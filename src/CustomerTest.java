import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void test(){
        Movie m1 = new Movie("movie43", 1);
        Movie m2 = new Movie("snakes in plane", 2);
        Movie m3 = new Movie("the room", 3);
        Movie m4 = new Movie("human centipede 2 ", 4);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Rental r3 = new Rental(m3, 14);
        Rental r4 = new Rental(m4, 8);
        Customer c1 = new Customer("Koritz Mnapp");
        c1.addRental(r1);   c1.addRental(r2);   c1.addRental(r3);   c1.addRental(r4);
        System.out.println("Let's get the Statement");
        String result = c1.statement();
        System.out.println(result);
        String expected ="Rental Record for Koritz Mnapp\n\tTitle\t\t\t\tDays\tAmount\n\tmovie43\t\t\t\t10\t30.0\n\tsnakes in plane\t\t\t\t5\t4.5\n\tthe room\t\t\t\t14\t0.0\n\thuman centipede 2\t\t\t\t8\t0.0\nAmount owed is 34.5\nYou earned 5 frequent renter points" ;
        assertEquals(expected, result);

    }
}
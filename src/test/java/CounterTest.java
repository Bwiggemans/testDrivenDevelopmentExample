import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    //Atributen
    private Counter counter;

    @BeforeEach
    public void setup(){
        this.counter = new Counter();
    }

    @Test
    public void testCounter(){

        //Arange
//        Counter counter = new Counter();

        //Act
        counter.add();
        counter.add(5);
        counter.add();

        int actual = counter.current();

        //Assert
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void testResetCounter(){

        //Arange
//        Counter counter = new Counter();

        //Act
        counter.add();
        counter.add(5);
        counter.reset();
        counter.add();

        int actual = counter.current();

        //Assert
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testCountertoString(){

        //Arange
//        Counter counter = new Counter();

        //Act
        counter.add();
        counter.add(5);
        counter.add();

        String actual = counter.toString();

        //Assert
        String  expected = "7";

        assertEquals(expected, actual);
    }
}
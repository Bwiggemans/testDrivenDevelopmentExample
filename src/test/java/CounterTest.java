import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    public void testCounter(){

        Counter counter = new Counter();

        counter.add();
        counter.add(5);
        counter.add();

        int actual = counter.current();
        int expected = 7;

        assertEquals(expected, actual);

    }

}
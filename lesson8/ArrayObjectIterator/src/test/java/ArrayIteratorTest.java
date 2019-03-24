import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class ArrayIteratorTest {
    private static final int SIZE = 10;
    ArrayIterator<Integer> arrayIterator = new ArrayIterator<>(SIZE);

    @Before
    public void setUp() {
        for (int i = 0; i < SIZE; i++) {
            arrayIterator.put(i, i);
        }
    }

    @After
    public void tearDown() throws Exception {
        arrayIterator = null;
    }

    @Test
    public void put() {
        assertEquals((Integer) arrayIterator.get(0), (Integer) 0);
        arrayIterator.put(0, 1);
        assertEquals(arrayIterator.get(0), (Integer) 1);
        arrayIterator.put(0, 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void putExcept() throws Exception {
        arrayIterator.put(-1, 1);
    }

    @Test
    public void get() {
        int rez = 9;
        assertEquals(arrayIterator.get(9), (Integer) rez);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getExcept() {
        arrayIterator.get(-1);
    }

    @Test
    public void iterator() {
        int i = 0;
        for (Integer integ : arrayIterator
                ) {
            assertEquals(integ,(Integer)(i++));
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void iteratorExcept() {
        Iterator<Integer> iterator = arrayIterator.iterator();
        iterator.remove();
    }
}
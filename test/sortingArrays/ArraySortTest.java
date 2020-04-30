package sortingArrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static sortingArrays.ArraySort.sort;

public class ArraySortTest {

    @Test
    public void testSingleElement() {
        assertArrayEquals(
                new String[]{"7"},
                sort(new String[]{"7"})
        );
    }

    @Test
    public void testEmptyArray() {
        assertArrayEquals(
                new String[]{},
                sort(new String[]{})
        );
    }

    @Test
    public void testNullArray() {
        assertArrayEquals(
                null,
                sort(null)
        );
    }
    @Test
    public void testTwoElements() {
        assertArrayEquals(new String[]{"Order","Out"},
        sort(new String[]{"Out","Order"})
        );
    }
    @Test
    public void testThreeElements() {
        assertArrayEquals(new String[]{"Of", "Order", "Out"},
        sort(new String[]{"Out", "Of", "Order"})
        );
    }
    @Test
    public void testCaseSorting() {
        assertArrayEquals(new String[] {"Aardvark", "bear", "Canary", "deer"},
        sort(new String[]{"bear", "Canary", "Aardvark", "deer"})
        );
    }

}

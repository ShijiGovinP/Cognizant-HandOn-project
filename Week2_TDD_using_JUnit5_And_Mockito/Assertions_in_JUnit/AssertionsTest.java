import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class assertion {

    public int add(int a, int b) {
        return a + b;
    }

    public Integer getNull() {
        return null;
    }

    public Integer getNonNullValue() {
        return 42;
    }

    public int[] getEvenNumbers() {
        return new int[]{2, 4, 6};
    }

    public String getMessage() {
        return "Hello JUnit";
    }
}

public class assertionTest {

    assertion utils = new assertion();

    @Test
    void testAssertEquals() {
        assertEquals(5, utils.add(2, 3));
    }

    @Test
    void testAssertNotEquals() {
        assertNotEquals(10, utils.add(4, 3));
    }

    @Test
    void testAssertTrue() {
        assertTrue(utils.add(2, 2) == 4);
    }

    @Test
    void testAssertFalse() {
        assertFalse(utils.add(2, 2) == 5);
    }

    @Test
    void testAssertNull() {
        assertNull(utils.getNull());
    }

    @Test
    void testAssertNotNull() {
        assertNotNull(utils.getNonNullValue());
    }

    @Test
    void testAssertArrayEquals() {
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, utils.getEvenNumbers());
    }

    @Test
    void testAssertSame() {
        String msg = utils.getMessage();
        assertSame(msg, utils.getMessage());
    }

    @Test
    void testAssertNotSame() {
        String a = new String("JUnit");
        String b = new String("JUnit");
        assertNotSame(a, b);
    }
}

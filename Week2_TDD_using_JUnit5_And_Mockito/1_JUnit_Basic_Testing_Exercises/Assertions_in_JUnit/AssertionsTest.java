import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionUtilsTest {

    AssertionUtils utils = new AssertionUtils();

    @Test
    public void testAssertEquals() {
        assertEquals(5, utils.add(2, 3));
    }

    @Test
    public void testAssertNotEquals() {
        assertNotEquals(10, utils.add(4, 3));
    }

    @Test
    public void testAssertTrue() {
        assertTrue(utils.add(2, 2) == 4);
    }

    @Test
    public void testAssertFalse() {
        assertFalse(utils.add(2, 2) == 5);
    }

    @Test
    public void testAssertNull() {
        assertNull(utils.getNull());
    }

    @Test
    public void testAssertNotNull() {
        assertNotNull(utils.getNonNullValue());
    }

    @Test
    public void testAssertArrayEquals() {
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, utils.getEvenNumbers());
    }

    @Test
    public void testAssertSame() {
        String msg = utils.getMessage();
        assertSame(msg, utils.getMessage());
    }

    @Test
    public void testAssertNotSame() {
        String a = new String("JUnit");
        String b = new String("JUnit");
        assertNotSame(a, b);
    }
}

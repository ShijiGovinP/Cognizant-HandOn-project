public class AssertionUtils {

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

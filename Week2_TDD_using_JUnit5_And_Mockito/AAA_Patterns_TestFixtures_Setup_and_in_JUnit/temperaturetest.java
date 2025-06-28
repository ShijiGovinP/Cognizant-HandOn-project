import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTest {

    @Before
    public void setUp() {
        converter = new TemperatureConverter();
        System.out.println("Setup: Converter initialized");
    }

    @After
    public void tearDown() {
        converter = null;
        System.out.println("Teardown: Converter object cleared");
    }

    @Test
    public void testCelsiustoFahrenheit() {        
        double inputCelsius = 0.0;
        double result = converter.celsiusToFahrenheit(inputCelsius);
        assertEquals(32.0, result, 0.001);
    }

    @Test
    public void testFahrenheittoCelsius() {
        double inputFahrenheit = 212.0;
        double result = converter.fahrenheitToCelsius(inputFahrenheit);
        assertEquals(100.0, result, 0.001);
    }
    @Test 
    public void testRoundoTwoDecimals() {
        double value = 98.7654;
        double result = converter.roundToTwoDecimals(value); 
        assertEquals(98.77, result, 0.001);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    @Test
    public void testCelsiusToFahrenheit(){
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0));
        assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100));
        assertEquals(-40, TemperatureConverter.celsiusToFahrenheit(-40));
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37));
    }

    @Test
    public void testFahrenheitToCelsius(){
        assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32));
        assertEquals(100, TemperatureConverter.fahrenheitToCelsius(212));
        assertEquals(-40, TemperatureConverter.fahrenheitToCelsius(-40));
        assertEquals(37, TemperatureConverter.fahrenheitToCelsius(98.6));
    }
}

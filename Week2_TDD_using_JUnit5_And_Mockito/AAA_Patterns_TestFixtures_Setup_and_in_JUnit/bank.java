ppublic class TemperatureConverter {

    public double celsiustoFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheittoCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double roundtoTwoDecimals(double value) {
        double shifted = value * 100;
        double fractionalPart = shifted - (int)shifted;
        int rounded;
        if (fractionalPart >= 0.5) {
            rounded = (int)shifted + 1;
        } else {
            rounded = (int)shifted;
        }

        return rounded / 100.0;
    }
}

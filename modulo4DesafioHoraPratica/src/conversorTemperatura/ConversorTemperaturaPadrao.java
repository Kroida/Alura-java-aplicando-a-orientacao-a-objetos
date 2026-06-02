package conversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double celsius) {
        System.out.println(celsius + " graus celsius para fahrenheit é: " + (celsius * 1.8) + 32);
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        System.out.println(fahrenheit + " graus fahrenheit para celsius é: " + (fahrenheit - 32) / 1.8);
    }
}

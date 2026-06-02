package conversorMoeda;

public class ConversorMoeda implements ConversaoFinanceira {
    private double real = 5.04;

    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar * real;
    }
}

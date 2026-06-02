package calculadora;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    @Override
    public double calcularPerimetro(double lado) {
        return 4 * lado;
    }
}

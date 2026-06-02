package calculavel;

public class Livro implements Calculavel {
    private double livroPreco = 50;

    @Override
    public double calcularPrecoFinal() {
        return livroPreco - (livroPreco * 0.10);
    }
}

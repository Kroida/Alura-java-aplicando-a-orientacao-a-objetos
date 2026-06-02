package calculavel;

public class ProdutoFisico implements Calculavel {
    private double produtoFisicoPreco = 150;

    @Override
    public double calcularPrecoFinal() {
        return produtoFisicoPreco - (produtoFisicoPreco * 0.60);
    }
}

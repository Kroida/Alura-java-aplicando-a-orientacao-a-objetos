package vendavel;

public class Produto implements Vendavel {
    private double precoProduto = 12.50;
    private int descontoUnidades = 5;

    @Override
    public double precoTotal(double qtd) {
        if (qtd > descontoUnidades) {
            double precoTotal = 0;

            for (int i = 0; i < qtd; i++) {
                precoTotal += precoProduto - (precoProduto * 0.10);
            }

            return precoTotal;
        }
        return precoProduto * qtd;
    }
}

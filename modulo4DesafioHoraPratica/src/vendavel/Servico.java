package vendavel;

public class Servico implements Vendavel {
    private String nomeServico = "mamadinha";
    private double custoServico = 200.00;
    private boolean noCredito = true;

    @Override
    public double precoTotal(double qtd) {
        if (noCredito) {
            return (custoServico + (200 / 100) * 10) * qtd;
        }
        return custoServico * qtd;
    }
}

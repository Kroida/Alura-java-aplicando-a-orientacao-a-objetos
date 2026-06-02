package desafioHoraPratica.contaBancaria;

public class ContaCorrente extends ContaBancaria {
    private double tarifa = 50.00;

    public void cobrarTarifaMensal() {
        saldo -= tarifa;
        System.out.println("Tarifa cobrada!");
    }
}

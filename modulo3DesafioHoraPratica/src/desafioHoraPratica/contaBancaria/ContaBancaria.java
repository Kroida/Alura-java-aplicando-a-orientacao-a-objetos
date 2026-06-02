package desafioHoraPratica.contaBancaria;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("O valor tem que ser maior que zero!");
        }
    }

    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é de: " + saldo);
    }
}

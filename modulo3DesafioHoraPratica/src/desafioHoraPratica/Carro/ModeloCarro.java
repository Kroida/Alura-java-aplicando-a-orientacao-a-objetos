package desafioHoraPratica.Carro;

public class ModeloCarro  {
    static void main(String[] args) {
        Carro carro = new Carro();

        carro.definirNome("Fiat Uno");
        carro.definirPrecos(4000, 8000, 12000);

        System.out.println(carro.calcularMaiorPreco());
        System.out.println(carro.calcularMenorPreco());
    }
}

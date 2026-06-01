public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoPlano;
    double somaAvaliacoes;
    int totalAvaliacoes;
    int duracaoMinutos;

    void exibirFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia() {
        return somaAvaliacoes / totalAvaliacoes;
    }
}

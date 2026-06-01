public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    int duracaoMinutos;

    int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração em minutos: " + duracaoMinutos);
        System.out.println("Incluído no plano: " + incluidoPlano);
    }

    void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia() {
        return somaAvaliacoes / totalAvaliacoes;
    }
}

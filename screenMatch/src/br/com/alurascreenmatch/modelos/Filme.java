package br.com.alurascreenmatch.modelos;

public class Filme {
    public String nome;
    int anoLancamento;
    boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    int duracaoMinutos;

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração em minutos: " + duracaoMinutos);
        System.out.println("Incluído no plano: " + incluidoPlano);
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia() {
        return somaAvaliacoes / totalAvaliacoes;
    }
}

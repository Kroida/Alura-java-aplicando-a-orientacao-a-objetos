public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Título da música: " + titulo);
        System.out.println("Música do artista: " + artista);
        System.out.println("A música foi lançada em: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Total de avaliações: " + numAvaliacoes);
    }

    void avaliar(double _avaliacao) {
        avaliacao += _avaliacao;
        numAvaliacoes++;
    }

    double mediaAvaliacoes() {
        return avaliacao / numAvaliacoes;
    }
}

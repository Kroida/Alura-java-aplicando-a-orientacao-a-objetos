public class main {
    static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "Homem aranha";
        filme.anoLancamento = 2003;
        filme.duracaoMinutos = 120;

        filme.exibeFichaTecnica();
        filme.avalia(10);
        filme.avalia(5);

        System.out.println(filme.somaAvaliacoes);
        System.out.println(filme.pegaMedia());
    }
}

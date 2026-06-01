public class main {
    static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "Homem aranha";
        filme.anoLancamento = 2003;
        filme.incluidoPlano = true;
        filme.avaliacao = 5.0;
        filme.totalAvaliacoes = 1;
        filme.duracaoMinutos = 120;

        System.out.println(filme.nome);
        System.out.println(filme.anoLancamento);
    }
}

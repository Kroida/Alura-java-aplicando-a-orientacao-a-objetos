import br.com.alurascreenmatch.modelos.Filme;

public class main {
    static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("Homem aranha");
        filme.setAnoLancamento(2003);
        filme.setDuracaoMinutos(120);
        filme.setIncluidoPlano(true);

        filme.exibeFichaTecnica();
        filme.avalia(9);
        filme.avalia(8);
        filme.avalia(9);

        System.out.println("Média de avaliações do filme: " + filme.pegaMedia());
    }
}

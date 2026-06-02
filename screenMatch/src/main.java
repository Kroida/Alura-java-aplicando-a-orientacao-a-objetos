import br.com.alurascreenmatch.modelos.Filme;
import br.com.alurascreenmatch.modelos.Serie;

public class main {
    static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Homem Aranha");
        filme.setAnoLancamento(2003);
        filme.setDuracaoMinutos(120);
        System.out.println("Duração do filme: " + filme.getDuracaoMinutos());

        System.out.println("----------");

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.exibeFichaTecnica();
        System.out.println("----------");

        lost.setTemporadas(10);
        lost.setEpisodiosTemporada(10);
        lost.exibeFichaTecnica();
        System.out.println("----------");

        lost.setMinutosEpisodio(50);
        System.out.println("Duração da serie: " + lost.getDuracaoMinutos());
    }
}

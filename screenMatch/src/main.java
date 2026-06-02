import br.com.alurascreenmatch.modelos.Filme;
import br.com.alurascreenmatch.modelos.Serie;

public class main {
    static void main(String[] args) {
        Filme filme = new Filme();
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosTemporada(10);
        lost.exibeFichaTecnica();
    }
}

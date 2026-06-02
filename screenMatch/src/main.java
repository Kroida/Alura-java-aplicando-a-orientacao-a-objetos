import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alurascreenmatch.modelos.Filme;
import br.com.alurascreenmatch.modelos.Serie;

public class main {
    static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Homem Aranha");
        meuFilme.setAnoLancamento(2003);
        meuFilme.setDuracaoMinutos(120);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoMinutos());

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
        System.out.println("----------");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Batman o cavaleiro das trevas");
        outroFilme.setAnoLancamento(2008);
        outroFilme.setDuracaoMinutos(150);

        CalculadoraTempo calculadoraTempo = new CalculadoraTempo();
        calculadoraTempo.inclui(meuFilme);
        calculadoraTempo.inclui(outroFilme);
        calculadoraTempo.inclui(lost);
        System.out.println(calculadoraTempo.getTempoTotal());
    }
}

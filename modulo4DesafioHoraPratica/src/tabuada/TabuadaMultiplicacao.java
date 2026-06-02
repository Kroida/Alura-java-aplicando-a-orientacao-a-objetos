package tabuada;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i < 11; i++) {
            System.out.println("Número " + numero + " x " + i + " = " + numero * i);
        }
    }
}

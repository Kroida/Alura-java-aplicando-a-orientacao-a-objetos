package br.com.alura.screenmatch.calculos;

import br.com.alurascreenmatch.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal = 0;

    // ----- Getters and Setters -----
    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme filme) {
//        tempoTotal += filme.getDuracaoMinutos();
//    }
//
//    public void inclui(Serie serie) {
//        tempoTotal += serie.getDuracaoMinutos();
//    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de" + titulo);
        tempoTotal += titulo.getDuracaoMinutos();
    }
}

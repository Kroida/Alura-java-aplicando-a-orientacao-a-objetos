package models;

import interfaces.Detalhes;

public class Podcast extends Audio implements Detalhes {
    private String nomePodcast;
    private double velocidadeReproducao = 1.0;
    double tempoRestanteduracao = getDuracao();

    // ----- Constructor -----
    public Podcast(String titulo, double duracao, String nomePodcast) {
        super(titulo, duracao);
        this.nomePodcast = nomePodcast;
    }

    // ----- Methods -----
    public void aumentarVelocidade() {
        if (velocidadeReproducao <= 2) {
            velocidadeReproducao += 0.5;
            System.out.println("Velocidade aumentada para: " + velocidadeReproducao);
        }
    }

    public void diminuirVelocidade() {
        if (velocidadeReproducao > 0.5) {
            velocidadeReproducao -= 0.5;
            System.out.println("Velocidade diminuida para: " + velocidadeReproducao);
        }
    }

    public void avancarSegundos() {
        avancarSegundos(0.15);
    }

    public void avancarSegundos(Double segundos) {
        tempoRestanteduracao -= segundos;

        if (tempoRestanteduracao > 1.0) {
            if (segundos > 1.0)
                System.out.println("Avançando " + segundos + " minutos" + "\n" + "Tempo restante: " + tempoRestanteduracao + " minutos");
            else {
                System.out.println("Avançando " + segundos + " segundos" + "\n" + "Tempo restante: " + tempoRestanteduracao  + " minutos");
            }
        } else {
            if (segundos > 1.0)
                System.out.println("Avançando " + segundos + " minutos" + "\n" + "Tempo restante: " + tempoRestanteduracao  + " segundos");
            else {
                System.out.println("Avançando " + segundos + " segundos" + "\n" + "Tempo restante: " + tempoRestanteduracao  + "segundos");
            }
        }
    }

    public void voltarSegundos() {
        voltarSegundos(0.15);
    }

    public void voltarSegundos(Double segundos) {
        tempoRestanteduracao += segundos;
        if (segundos > 1.0) {
            System.out.println("Voltando " + segundos + " minutos" + "\n" + "Tempo restante: " + tempoRestanteduracao);
        } else {
            System.out.println("Voltando " + segundos + " segundos" + "\n" + "Tempo restante: " + tempoRestanteduracao);
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome do episódio: " + getTitulo());

        if (getDuracao() < 1.0) {
            System.out.println("Duração do episódio: " + getDuracao() + " segundos");
        } else {
            System.out.println("Duração do episódio: " + getDuracao() + " minutos");
        }

        System.out.println("Canal do podcast: " + nomePodcast);
        System.out.println("Total de reproduções: " + getTotalReproducoes());
        System.out.println("Total de curtidas: " + getCurtidas());
        System.out.println("Classificação: " + getClassificacao());
    }
}

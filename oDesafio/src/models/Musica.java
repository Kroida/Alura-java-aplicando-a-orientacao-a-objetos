package models;

import interfaces.Detalhes;

import java.util.Scanner;

public class Musica extends Audio implements Detalhes {
    Scanner scanner = new Scanner(System.in);

    private String album;
    private String banda;
    private String entradaLetras;
    private boolean entrada;
    private boolean repetir;

    // ----- Constructor -----
    public Musica(String titulo, double duracao, String album, String banda) {
        super(titulo, duracao);
        this.album = album;
        this.banda = banda;
    }

    // ----- Methods -----
    public void repetirMusica() {
        if (repetir == false) {
            repetir = true;
            System.out.println("Repetição ativada");
        } else {
            repetir = false;
            System.out.println("Repetição desativada");
        }
    }

    public void definirLetras(String letras) {
        entradaLetras = letras;
        entrada = true;
    }

    public void exibirLetras() {
        if (!entrada) {
            System.out.println("Defina as letras primeiro.");
        } else {
            System.out.println(entradaLetras);
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome da música: " + getTitulo());

        if (getDuracao() < 1.0) {
            System.out.println("Duração da música: " + getDuracao() + " segundos");
        } else {
            System.out.println("Duração da música: " + getDuracao() + " minutos");
        }

        System.out.println("Album da música: " + album);
        System.out.println("Nome da banda: " + banda);
        System.out.println("Total de reproduções: " + getTotalReproducoes());
        System.out.println("Total de curtidas: " + getCurtidas());
        System.out.println("Classificação: " + getClassificacao());
    }
}

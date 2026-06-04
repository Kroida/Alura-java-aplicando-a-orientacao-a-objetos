package models;

public class Audio {
    private String titulo;
    private double duracao;
    private double totalReproducoes;
    private int curtidas;
    private double classificacao;
    private boolean pausado = true;

    // ----- Constructor -----
    public Audio(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    // ----- Getters and Setters -----
    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public double getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificacao() {
        if (curtidas == 0) {
            return 0;
        }

        return (curtidas / totalReproducoes) * 5;
    }

    // ----- Methods -----
    public void reproduzir() {
        totalReproducoes++;
        pausado = false;
        System.out.println(titulo + " está sendo reproduzido");
    }

    public void pausar() {
        if (pausado == false) {
            pausado = true;
            System.out.println(titulo + " está pausado");
        } else {
            pausado = false;
            System.out.println(titulo + " está despausado");
        }
    }

    public void curtir() {
        if (curtidas >= totalReproducoes) {
            System.out.println("Como vai ter mais curtidas que reproduções?");
        } else {
            curtidas++;
            System.out.println(titulo + " foi curtido");
        }
    }

    public void exibirClassificacao() {
        classificacao = (curtidas / totalReproducoes) * 5;

        if (classificacao >= 4.5 && totalReproducoes > 1_000_000) {
            System.out.println(titulo + " está fazendo muito sucesso!!!");
        } else if(classificacao > 4 && totalReproducoes > 500_000) {
            System.out.println(titulo + " está bombando!");
        } else if(classificacao > 3 && totalReproducoes > 100_000) {
            System.out.println(titulo + " está circulando entre a galera!");
        } else if (classificacao > 2 && totalReproducoes > 40_000) {
            System.out.println(titulo + " é meio underground");
        } else {
            System.out.println(titulo + " pode ser escutado mais tarde");
        }
    }
}

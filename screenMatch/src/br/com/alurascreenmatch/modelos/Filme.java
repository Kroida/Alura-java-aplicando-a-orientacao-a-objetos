package br.com.alurascreenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    // Getters and Setters
    public String getDiretor() {
        return diretor;
    }

    // Methods
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    // Sobreescrita
    @Override
    public int getClassificacao() {
        return 0;
    }
}

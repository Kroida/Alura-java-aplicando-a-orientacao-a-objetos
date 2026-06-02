public class Produto {
    private String nome;
    private double preco;

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Methods
    public void aplicarDesconto(int percentual) {
        preco = preco - ((preco/100) * percentual);
        System.out.println("Novo preço: " + preco);
    }
}

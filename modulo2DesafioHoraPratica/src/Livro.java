public class Livro {
    private String titulo;
    private String autor;

    // Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.printf("""
                Título: %s
                Autor: %s
                """,
                titulo,
                autor
        );
    }
}

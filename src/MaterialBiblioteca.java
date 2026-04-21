public abstract class MaterialBiblioteca {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public MaterialBiblioteca(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    } 

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnopublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }



    public abstract void exibirDetalhes();

    public void emprestar() {
        System.out.println("Material emprestado\n");
    }

}

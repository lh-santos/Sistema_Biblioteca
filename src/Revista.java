public class Revista extends MaterialBiblioteca {
    private int ed;
    
    public Revista(String titulo, String autor, int anoPublicacao, int ed) {
        super(titulo, autor, anoPublicacao);
        this.ed = ed;
    }

    @Override
    public void exibirDetalhes() {

        System.out.println("Titulo: " + this.getTitulo()) ;
        System.out.println("Edição" + this.ed);
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano de publicação: " + this.getAnoPublicacao());
        System.out.println(this.getAutor());
        System.out.println("A nova edição de.... [Ler mais]\n");
    }   
    
}

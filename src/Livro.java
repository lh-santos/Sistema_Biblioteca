public class Livro extends MaterialBiblioteca {
    public int pag;

    public Livro(String titulo, String autor, int anoPublicacao, int pag) {
           super(titulo, autor, anoPublicacao);
           this.pag  = pag;
           
         }

    @Override
    public void exibirDetalhes() {
        System.out.println("Titulo: " + this.getTitulo()) ;
        System.out.println(this.pag);
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano de ppublicação: " + this.getAnoPublicacao());
        System.out.println(this.getAutor());
        System.out.println("A nova edição de.... [Ler mais]");
    }   

}

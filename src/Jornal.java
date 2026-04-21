public class Jornal extends MaterialBiblioteca {
    private int dataEdicao;

    public Jornal(String titulo, String autor, int anoPublicacao, int dataEdicao ){
        super(titulo, autor, anoPublicacao);
        this.dataEdicao = dataEdicao;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Titulo: " + this.getTitulo()) ;
        System.out.println("Data de edição: " + this.dataEdicao);
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano de publicação: " + this.getAnoPublicacao());
        System.out.println(this.getAutor());
        System.out.println("A nova edição do jorn.... [Ler mais]\n");
    }
}

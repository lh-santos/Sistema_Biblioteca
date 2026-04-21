public class Main {
    public static void main(String[] args) throws Exception {
        Livro guerra = new Livro("Arte da guerra", "Sun-tzu", 0,  160);
        Revista avon = new Revista("Avon", "seila", 2012, 12);

        guerra.exibirDetalhes();
        avon.exibirDetalhes();
        avon.emprestar();

    }
}

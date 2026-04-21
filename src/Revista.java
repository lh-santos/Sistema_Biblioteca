public class Revista extends MaterialBiblioteca {

    private int edição(int ed) {
    return ed;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("A nova edição de.... [Ler mais]") ;
    }   
    
}

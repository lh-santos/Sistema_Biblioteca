import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<MaterialBiblioteca>  materiais;

    //Iniciando a lista de array por meio de um metoto
    private Biblioteca() {
        materiais = new ArrayList<>();
    }
    
    public void adicionarMaterial(MaterialBiblioteca material){
        materiais.add(material);
    }

    public void listaMateriais() {
        for(MaterialBiblioteca m : materiais){
            m.exibirDetalhes();
        }
    }
    buscarPorTitulo(String titulo)

}

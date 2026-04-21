import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<MaterialBiblioteca>  materiais;

    //Iniciando a lista de array por meio de um metoto
    Biblioteca() {
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
    buscarPorTitulo(String titulo) {
        for(MaterialBiblioteca m : materiais){
            if(material.getTitulo())
        }
    }

}

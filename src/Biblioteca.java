import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<MaterialBiblioteca> materiais;

    Biblioteca() {
        materiais = new ArrayList<>();
    }

    public void adicionarMaterial(MaterialBiblioteca material) {
        materiais.add(material);
    }

    public void listaMateriais() {
        for (MaterialBiblioteca m : materiais) {
            m.exibirDetalhes();
        }
    }

    public MaterialBiblioteca buscarPorTitulo(String titulo) {
        for (MaterialBiblioteca m : materiais) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                return m;

            }
        }
        System.out.println("Material não encontrado");
        return null;
    }

    public void emprestarMaterial(MaterialBiblioteca material) {

        if (material != null) {
            material.emprestar();
            materiais.remove(material);

        } else {
            System.out.printf("Material não encontrado");
        }
    }
}

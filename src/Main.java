import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int op;

        Biblioteca b1 = new Biblioteca();

        Scanner leitor = new Scanner(System.in);  
        System.out.println("===== MENU BIBLIOTECA =====");
        System.out.println("1 - Adicionar Livro");
        System.out.println("2 - Adicionar Revista");
        System.out.println("3 - Adicionar Jornal");
        System.out.println("4 - Listar Materiais");
        System.out.println("5 - Buscar por Título");
        System.out.println("6 - Emprestar Material");
        System.out.println("7 - Sair");
        op = leitor.nextInt();


        while(true) {
            switch (op) {
                case 1:
                    leitor.adicionarMaterial(material);
                    break;
            
                case 2:

                    break;
                    
            }
        }
    }
}

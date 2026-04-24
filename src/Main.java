import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int op;
        boolean continuar = true;
        Scanner leitor = new Scanner(System.in);

        Biblioteca b1 = new Biblioteca();

        while(continuar) {

            System.out.printf("===== MENU BIBLIOTECA =====");
            System.out.printf("1 - Adicionar Livro");
            System.out.printf("2 - Adicionar Revista");
            System.out.printf("3 - Adicionar Jornal");
            System.out.printf("4 - Listar Materiais");
            System.out.printf("5 - Buscar por Título");
            System.out.printf("6 - Emprestar Material");
            System.out.printf("7 - Sair");
            op = leitor.nextInt();
            leitor.nextLine();



                switch (op) {
                    case 1:
                        System.out.printf("Titulo: ");
                        String tituloLivro = leitor.nextLine();

                        System.out.printf("Autor: ");
                        String autorLivro = leitor.nextLine();

                        System.out.printf("Ano: ");
                        int anoLivro = leitor.nextInt();

                        System.out.printf("Numero de paginas: ");
                        int pagLivro = leitor.nextInt();

                        b1.adicionarMaterial(tituloLivro, anoLivro, autorLivro, pagLivro);
                        break;

                    case 2:
                        System.out.printf("Titulo: ");
                        String tituloRevista = leitor.nextLine();

                        System.out.printf("Autor: ");
                        String autorRevista = leitor.nextLine();

                        System.out.printf("Ano: ");
                        int anoRevista = leitor.nextInt();

                        System.out.printf("Numero de edição: ");
                        int edRevista = leitor.nextInt();

                        b1.adicionarMaterial(tituloRevista, anoRevista, autorRevista, edRevista);
                        break;


                    case 3:
                        System.out.printf("Titulo: ");
                        String tituloJornal = leitor.nextLine();

                        System.out.printf("Autor: ");
                        String autorJornal = leitor.nextLine();

                        System.out.printf("Ano: ");
                        int anoJornal = leitor.nextInt();

                        System.out.printf("Numero de paginas: ");
                        int dataEdicaoJornal = leitor.nextInt();

                        b1.adicionarMaterial(tituloJornal, anoJornal, autorJornal, dataEdicaoJornal);
                        break;

                    case 4:
                        b1.listaMateriais();

                        break;

                    case 5:
                        System.out.printf("Informe o nome do material: ");
                        String material = leitor.nextLine();
                        b1.buscarPorTitulo(material);
                        break;

                    case 6:
                        System.out.printf("Informe o nome do material: ");
                        String m = leitor.nextLine();
                        b1.emprestarMaterial(m);
                        break;

                    case 7:
                        System.out.printf("Encerrando...");

                        continuar = false;

                        break;

            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int op;
        boolean continuar = true;
        Scanner leitor = new Scanner(System.in);

        Biblioteca b1 = new Biblioteca();

        while(continuar) {

            System.out.printf("\n===== MENU BIBLIOTECA =====\n");
            System.out.printf("1 - Adicionar Livro\n");
            System.out.printf("2 - Adicionar Revista\n");
            System.out.printf("3 - Adicionar Jornal\n");
            System.out.printf("4 - Listar Materiais\n");
            System.out.printf("5 - Buscar por Título\n");
            System.out.printf("6 - Emprestar Material\n");
            System.out.printf("7 - Sair\n");
            System.out.printf("Escolha uma opção: ");
            op = leitor.nextInt();
            leitor.nextLine();
            System.out.printf("\n");



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

                        Livro livro = new Livro(tituloLivro, autorLivro, anoLivro, pagLivro);
                        b1.adicionarMaterial(livro);
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


                        Revista revista = new Revista(tituloRevista, autorRevista, anoRevista, edRevista);
                        b1.adicionarMaterial(revista);
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

                        Jornal jornal = new Jornal(tituloJornal, autorJornal, anoJornal, dataEdicaoJornal);
                        b1.adicionarMaterial(jornal);
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
                        MaterialBiblioteca mat = b1.buscarPorTitulo(m);
                        b1.emprestarMaterial(mat);
                        break;

                    case 7:
                        System.out.printf("Encerrando...");

                        continuar = false;

                        break;

            }
        }
    }
}

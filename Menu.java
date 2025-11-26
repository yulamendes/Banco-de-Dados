import java.util.List;
import java.util.Scanner;

public class Menu {

    private BancoDeDados banco;

    public Menu(BancoDeDados banco) {
        this.banco = banco;
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar pessoa");
            System.out.println("2 - Buscar por ID");
            System.out.println("3 - Buscar por parte do nome");
            System.out.println("4 - Listar todos");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("Digite um número válido.");
                continue;
            }

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    banco.adicionarPessoa(nome);
                    System.out.println("Pessoa adicionada!");
                    break;

                case 2:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    Pessoa pessoa = banco.buscarPorId(id);
                    System.out.println(pessoa != null ? pessoa : "Não encontrado.");
                    break;

                case 3:
                    System.out.print("Buscar: ");
                    String parte = sc.nextLine();
                    List<Pessoa> encontrados = banco.buscarPorNome(parte);
                    if (encontrados.isEmpty()) {
                        System.out.println("Nenhum resultado.");
                    } else {
                        encontrados.forEach(System.out::println);
                    }
                    break;

                case 4:
                    banco.listarTodos();
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}

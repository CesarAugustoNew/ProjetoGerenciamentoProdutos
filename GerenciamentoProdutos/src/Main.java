import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        public class Main {
            

                Scanner sc = new Scanner(System.in);
                GerenciadorProduto gProduto = new GerenciadorProduto();
                boolean continuarRodando = true;

                do {
                    System.out.println("\n=== Sistema de Gerenciamento de Produto ===\n");
                    System.out.println("(1) - Cadastrar Produto");
                    System.out.println("(2) - Listar Produto");
                    System.out.println("(3) - Atualizar Produto");
                    System.out.println("(4) - Deletar Produto");
                    System.out.println("(5) - Sair do programa");
                    System.out.print("\nInforme uma opção: ");

                    int opcaoUsuario = sc.nextInt();
                    sc.nextLine(); // limpa buffer

                    switch (opcaoUsuario) {

                        case 1:
                            System.out.println("\n--- Cadastro de Produto ---");
                            System.out.print("Informe o nome do Produto: ");
                            String nomeProduto = sc.nextLine();

                            gProduto.cadastrarProduto(nomeProduto);
                            break;

                        case 2:
                            System.out.println("\n--- Lista de Produto ---");
                            gProduto.listarProduto();
                            break;

                        case 3:
                            System.out.println("\n--- Atualizar Produto ---");
                            System.out.print("Digite o nome do Produto para atualizar: ");
                            String nomeAntigo = sc.nextLine();

                            System.out.print("Digite o novo nome do Produto: ");
                            String nomeNovo = sc.nextLine();

                            gProduto.atualizarProduto(nomeAntigo, nomeNovo);
                            break;

                        case 4:
                            System.out.println("\n--- Deletar Produto ---");
                            System.out.print("Digite o nome do Produto a ser deletado: ");
                            String livroDeletado = sc.nextLine();

                            gProduto.deletarProduto(ProdutoDeletado);
                            break;

                        case 5:
                            System.out.println("\nPrograma encerrado");
                            continuarRodando = false;
                            break;

                        default:
                            System.out.println("\nOpção inválida");
                    }

                    // separador visual (UX)
                    System.out.println("\n========================\n");

                } while (continuarRodando);

                sc.close();
            }
        }


    }
}

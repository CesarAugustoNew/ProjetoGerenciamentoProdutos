import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GerenciadorProduto gProduto = new GerenciadorProduto();
        boolean continuarRodando = true;

        do {
            System.out.println("\n=== Sistema de Gerenciamento de Produto ===\n");
            System.out.println("(1) - Cadastrar Produto");
            System.out.println("(2) - Listar Produto");
            System.out.println("(3) - Atualizar Produto");
            System.out.println("(4) - Deletar Produto");
            System.out.println("(5) - Sair");

            int opcaoUsuario = sc.nextInt();
            sc.nextLine();

            switch (opcaoUsuario) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    gProduto.cadastrarProduto(nome, preco);
                    break;

                case 2:
                    gProduto.listarProduto();
                    break;

                case 3:
                    System.out.print("Produto antigo: ");
                    String antigo = sc.nextLine();

                    System.out.print("Novo nome: ");
                    String novo = sc.nextLine();

                    System.out.print("Novo preço: ");
                    double novoPreco = sc.nextDouble();
                    sc.nextLine();

                    gProduto.atualizarProduto(antigo, novo, novoPreco);
                    break;

                case 4:
                    System.out.print("Produto: ");
                    gProduto.deletarProduto(sc.nextLine());
                    break;

                case 5:
                    continuarRodando = false;
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (continuarRodando);



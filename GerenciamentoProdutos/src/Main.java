import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GerenciadorProduto gp = new GerenciadorProduto();
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Deletar");
            System.out.println("5 - Sair");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeCadastro = sc.nextLine();
                    gp.cadastrarProduto(nomeCadastro);
                    break;

                case 2:
                    gp.listarProdutos();
                    break;

                case 3:
                    System.out.print("Digite o nome do produto: ");
                    String nomeAtualizar = sc.nextLine();
                    gp.atualizarProduto(nomeAtualizar);
                    break;

                case 4:
                    System.out.print("Digite o nome do produto: ");
                    String nomeDeletar = sc.nextLine();
                    gp.deletarProduto(nomeDeletar);
                    break;

                case 5:
                    rodando = false;
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }

        sc.close();
    }
}
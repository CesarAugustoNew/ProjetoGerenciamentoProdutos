import java.util.ArrayList;

public class GerenciadorProduto {

    ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void cadastrarProduto(String nomeProduto, double preco) {
        for (Produto produto : listaProdutos) {
            if (produto.nome.equals(nomeProduto)) {
                System.out.println("\nEsse produto já está cadastrado");
                return;
            }
        }

        listaProdutos.add(new Produto(nomeProduto, preco));
        System.out.println("\nProduto cadastrado com sucesso");
    }

    public void listarProduto() {
        if (listaProdutos.size() == 0) {
            System.out.println("\nLista vazia");
            return;
        }

        for (Produto produto : listaProdutos) {
            System.out.println("Nome: " + produto.nome + " | Preço: R$ " + produto.preco);
        }
    }

    public void atualizarProduto(String nomeAntigo, String nomeNovo, double novoPreco) {
        boolean encontrado = false;

        for (int i = 0; i < listaProdutos.size(); i++) {
            if (listaProdutos.get(i).nome.equals(nomeAntigo)) {
                listaProdutos.get(i).nome = nomeNovo;
                listaProdutos.get(i).preco = novoPreco;
                encontrado = true;
                System.out.println("\nProduto atualizado com sucesso");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\nProduto não encontrado");
        }
    }

    public void deletarProduto(String nomeProduto) {
        boolean removido = false;

        for (int i = 0; i < listaProdutos.size(); i++) {
            if (listaProdutos.get(i).nome.equals(nomeProduto)) {
                listaProdutos.remove(i);
                removido = true;
                System.out.println("\nProduto deletado com sucesso");
                break;
            }
        }

        if (!removido) {
            System.out.println("\nProduto não encontrado");
        }
    }
}




        sc.close();
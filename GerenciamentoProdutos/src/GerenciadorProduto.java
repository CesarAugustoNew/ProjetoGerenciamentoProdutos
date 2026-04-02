import java.util.ArrayList;

public class GerenciadorProduto {

    ArrayList<String> listaProdutos = new ArrayList<>();


    public void cadastrarProduto(String nome) {
        if (listaProdutos.contains(nome)) {
            System.out.println("Produto já existe");
            return;
        }

        listaProdutos.add(nome);
        System.out.println("Produto cadastrado");
    }


    public void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }

        for (String produto : listaProdutos) {
            System.out.println(produto);
        }
    }


    public void atualizarProduto(String nomeAntigo) {
        if (!listaProdutos.contains(nomeAntigo)) {
            System.out.println("Produto não encontrado");
            return;
        }

        int index = listaProdutos.indexOf(nomeAntigo);
        listaProdutos.set(index, nomeAntigo + " (Atualizado)");

        System.out.println("Produto atualizado");
    }


    public void deletarProduto(String nome) {
        if (listaProdutos.remove(nome)) {
            System.out.println("Produto removido");
        } else {
            System.out.println("Produto não encontrado");
        }
    }
}
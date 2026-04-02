public class GerenciadorDeProdutos {

    public static void main(String[] args) {

        import java.util.ArrayList;

        public class GerenciadorProduto {

            ArrayList<String> listaProdutos = new ArrayList<>();

            public void cadastrarProduto(String nomeProduto) {
                try {
                    // verificar duplicado sem contains
                    for (String produto : listaProdutos) {
                        if (produto.equals(nomeProduto)) {
                            System.out.println("\nEsse produto já está cadastrado");
                            return;
                        }
                    }

                    listaProdutos.add(nomeProduto);
                    System.out.printf("\nO produto: %s foi cadastrado com sucesso\n", nomeProduto);

                } catch (Exception e) {
                    System.out.println("\nErro ao cadastrar produto: " + e);
                }
            }

            public void listarProduto() {
                try {
                    // verificar se está vazia sem isEmpty
                    if (listaProdutos.size() == 0) {
                        System.out.println("\nProduto de produto vazia");
                        return;
                    }

                    for (String produto : listaProdutos) {
                        System.out.println(produto);
                    }

                } catch (Exception e) {
                    System.out.println("\nErro ao listar produto: " + e);
                }
            }

            public void atualizarProduto(String nomeAntigo, String nomeNovo) {
                try {
                    boolean encontrado = false;

                    for (int i = 0; i < listaProduto.size(); i++) {
                        if (listarProduto().get(i).equals(nomeAntigo)) {
                            listaProduto.set(i, nomeNovo);
                            encontrado = true;
                            System.out.println("\nProduto atualizado com sucesso");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("\nProduto não encontrado");
                    }

                } catch (Exception e) {
                    System.out.println("\nErro ao atualizar livro: " + e);
                }
            }

            public void deletarProduto(String deletarProduto) {
                try {
                    boolean removido = false;

                    for (int i = 0; i < listaProduto.size(); i++) {
                        if (listaProduto.get(i).equals(deletarProduto)) {
                            listaProduto.remove(i);
                            removido = true;
                            System.out.println("\nProduto deletado com sucesso");
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("\nProduto não encontrado");
                    }

                } catch (Exception e) {
                    System.out.println("\nErro ao deletar Produto: " + e);
                }
            }
        }
    }
}

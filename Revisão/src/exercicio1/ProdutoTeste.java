package exercicio1;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Banana");
        produto.getNome();
        produto.setPreco(100);
        produto.getPreco();
        produto.setQuantidadeEstoque(10);
        produto.getQuantidadeEstoque();
        produto.aplicarDesconto(10);
        produto.getPreco();

    }
}

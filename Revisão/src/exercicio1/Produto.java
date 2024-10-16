package exercicio1;

public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void getNome(){
        System.out.println(nome);
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void getPreco(){
        System.out.println(preco);
    }

    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void getQuantidadeEstoque(){
        System.out.println(quantidadeEstoque);
    }

    public void aplicarDesconto(double percentual){
        this.preco -= (preco*percentual)/100;
    }

}

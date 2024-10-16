package exercicio4;

public class Moto extends Veiculo {
    private boolean temCarrinho;

    public Moto(String marca, String modelo, int ano, boolean temCarrinho) {
        super(marca, modelo, ano);
        this.temCarrinho = temCarrinho;
    }

    @Override
    public void exibirInformacoes() {
        String carrinhoInfo = temCarrinho ? "com carrinho" : "sem carrinho";
        System.out.println("Moto: " + marca + " " + modelo + ", Ano: " + ano + ", " + carrinhoInfo);
    }
}


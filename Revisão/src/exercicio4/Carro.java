package exercicio4;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Carro: " + marca + " " + modelo + ", Ano: " + ano + ", Portas: " + numeroDePortas);
    }
}


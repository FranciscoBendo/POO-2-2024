package exercicio4;

public class Main {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();

        concessionaria.adicionarVeiculo(new Carro("Toyota", "Corolla", 2020, 4));
        concessionaria.adicionarVeiculo(new Moto("Honda", "CB500", 2021, true));

        System.out.println("Veículos na concessionária:");
        concessionaria.listarVeiculos();

        concessionaria.removerVeiculo(0);
        System.out.println("Após remover um veículo:");
        concessionaria.listarVeiculos();
    }
}


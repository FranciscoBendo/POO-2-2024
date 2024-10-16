package exercicio4;
import java.util.List;
import java.util.ArrayList;

public class Concessionaria {
    private List<Veiculo> veiculos;

    public Concessionaria() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(int indice) {
        if (indice >= 0 && indice < veiculos.size()) {
            veiculos.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarVeiculos() {
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirInformacoes();
        }
    }
}


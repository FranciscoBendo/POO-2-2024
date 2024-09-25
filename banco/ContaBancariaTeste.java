package banco;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setTitular();
        conta.setNumeroConta();
        conta.depositar();

        conta.getTitular();
        conta.getNumeroConta();
        conta.getSaldo();

        conta.sacar();
        conta.getSaldo();
    }
}

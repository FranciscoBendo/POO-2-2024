package exercicio2;
class Pessoa{
    String nome;
    int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

class Funcionario extends Pessoa{
    double salario;
    String Cargo;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    void dadosCompletos(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);
        System.out.println(Cargo);
    }
    void calcularSalarioAnual(){
        System.out.println(salario*12);
    }
}

public class Heranca {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Francisco");
        funcionario.setIdade(18);
        funcionario.setCargo("Chefe");
        funcionario.setSalario(10000);

        funcionario.dadosCompletos();
        funcionario.calcularSalarioAnual();
    }
}

package exercicio3;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.adicionarAluno(new Aluno("Alice", 9.5));
        gerenciador.adicionarAluno(new Aluno("Bob", 7.0));
        gerenciador.listarAlunos();
        System.out.println("Média: " + gerenciador.calcularMedia());

        gerenciador.removerAluno("Alice");
        gerenciador.listarAlunos();
    }
}



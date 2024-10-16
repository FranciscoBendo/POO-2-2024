package exercicio3;

import java.util.ArrayList;

class GerenciadorAlunos {
    private ArrayList<Aluno> alunos;

    public GerenciadorAlunos() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(String nome) {
        alunos.removeIf(aluno -> aluno.getNome().equals(nome));
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Nota: " + aluno.getNota());
        }
    }

    public double calcularMedia() {
        if (alunos.isEmpty()) {
            return 0;
        }

        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }
        return soma / alunos.size();
    }
}




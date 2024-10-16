package exercicio5;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", 1949));
        biblioteca.adicionarLivro(new Livro("O Hobbit", "J.R.R. Tolkien", 1937));

        System.out.println("Livros disponíveis:");
        biblioteca.listarLivros();

        biblioteca.removerLivro("1984");
        System.out.println("\nApós remover '1984':");
        biblioteca.listarLivros();

        System.out.println("\nLivros de J.R.R. Tolkien:");
        List<Livro> livrosTolkien = biblioteca.buscarPorAutor("J.R.R. Tolkien");
        for (Livro livro : livrosTolkien) {
            livro.exibirInformacoes();
        }
    }
}


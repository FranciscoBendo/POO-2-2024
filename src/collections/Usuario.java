package collections;

public class Usuario {
    String nome;
    String email;
    String nickname;

    public Usuario(String nome, String email, String nickname) {
        this.nome = nome;
        this.email = email;
        this.nickname = nickname;
    }
Override
public String toString(){
        return "Nome: " + nome;
}
}

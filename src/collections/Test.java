package collections;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
    ArrayList<Usuario> usuarios = new ArrayList<>();

    Usuario u1 = new Usuario("Victor", "dev@gmail.com", "dev");
    usuarios.add(u1);
    usuarios.add(new Usuario("João", "Joao@gmail.com", "jao"));
    Usuario u2 = new Usuario("Paulo", "Paulo@gmail.com", "Pau");
    usuarios.add(u2);

    System.out.println(usuarios.stream().count());

    System.out.println(usuarios.get(2).nome);

    for(Usuario usuario : usuarios){
        System.out.println("Nome: " + usuario.nome);
    }

        for(Usuario usuario : usuarios){
            System.out.println(usuario);
        }


    }
}

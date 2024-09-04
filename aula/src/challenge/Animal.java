package challenge;

public class Animal {

    String nome;
    double peso = 270;

    double comer(Alimento alimento){
        return this.peso += alimento.peso;

    }

}

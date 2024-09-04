package challenge;

public class Teste {
    public static void main(String[] args){
        var animal = new Animal();
        animal.nome = "Melore";

        var Silo = new Alimento();
        Silo.nome = "Silo";
        Silo.peso = 200;

        animal.comer(Silo);

        System.out.println(animal.peso);

        var racao = new Alimento();

        racao.peso = 100;

        animal.comer(racao);

        System.out.println(animal.peso);


    }
}

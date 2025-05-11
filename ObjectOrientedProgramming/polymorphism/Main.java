package polymorphism;

import java.util.ArrayList;
import java.util.List;

import inheritance.Animal;
import inheritance.Cachorro;
import inheritance.Gato;

public class Main {
    
    public static void main(String[] args) {
        
        // Já temos as classes Animal, Cachorro, Gato do exemplo de Herança.
        // Animal pai = Animal genérico
        // Cachorro extends Animal
        // Gato extends Animal

        // Em outra parte do seu código:
        // Criando uma lista de animais variados
        List<Animal> meusBichos = new ArrayList<>(); // List é como uma lista de compras
        meusBichos.add(new Cachorro()); // Adiciono um objeto Cachorro na lista
        meusBichos.add(new Gato());     // Adiciono um objeto Gato na lista
        meusBichos.add(new Animal());   // Adiciono um objeto Animal "puro" (menos comum, mas possível)

        // Agora vou pedir para CADA bicho da lista fazer um som, usando o MESMO comando!
        for (Animal bicho : meusBichos) { // Para cada item 'bicho' na minha lista 'meusBichos'
            bicho.fazerSom(); // CHAMO O MESMO MÉTODO fazerSom()
                            // O Java vai descobrir que tipo REAL é o 'bicho' naquele momento
                            // e chamar o fazerSom() CERTO (do Cachorro, do Gato, ou do Animal puro)
        }

        // Saída esperada:
        // Au Au!     (do Cachorro)
        // Miau!      (do Gato)
        // Algum som... (do Animal puro)

    }

}

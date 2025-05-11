package oop;

// --- Classe Principal para Rodar o Exemplo ---
public class OOPExample {

    public static void main(String[] args) {
        System.out.println("--- Demonstrando POO com Animais ---");

        // Criando objetos (instâncias das classes Dog e Cat)
        Dog myDog = new Dog("Rex");
        Cat myCat = new Cat("Felix");

        // =======================================================
        // Demonstrando Pilares:
        // =======================================================

        System.out.println("\n--- Demonstrando Encapsulamento (acesso controlado) ---");
        // Tentativa de acessar atributo privado diretamente (NÃO FUNCIONA! Java impede):
        // myDog.energy = 50; // <-- Erro de compilação!
        // System.out.println(myCat.name); // <-- Erro de compilação!

        // Acessando dados via métodos públicos (Getters):
        System.out.println("Nome do cachorro: " + myDog.getName());
        System.out.println("Energia inicial do gato: " + myCat.getEnergy());

        // Alterando dados via métodos públicos (que controlam a lógica interna):
        myDog.eat(); // Chama o metodo público eat()
        myCat.sleep();   // Chama o metodo público sleep()

        System.out.println("\n--- Demonstrando Herança (reutilização de código) ---");
        // Dog e Cat usam métodos que HERDARAM de Animal:
        myDog.introduce(); // Metodo 'introduce()' herdado de Animal
        myCat.introduce(); // Metodo 'introduce()' herdado de Animal

        // Eles também têm seus próprios métodos (especializações):
        myDog.fetchStick(); // Metodo próprio de Dog
        myCat.scratchFurniture(); // Metodo próprio de Cat

    }

}

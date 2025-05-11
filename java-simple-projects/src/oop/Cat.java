package oop;

// ============== PILLAR 3: INHERITANCE =================
// 'extends Animal' indica que 'Cat' também é uma subclasse (filha) de 'Animal'.
// Cat também HERDA todos os membros NÃO PRIVADOS de Animal.
public class Cat extends Animal {
    // Cat pode adicionar seus próprios atributos e métodos.

    // Construtor de Cat.
    public Cat(String name) {
        super(name); // Chama o construtor da classe pai (Animal).
        System.out.println("  ... e sou um gato!");
    }

    // ============== PILLAR 4: POLYMORPHISM =================
    // Implementação do metodo abstrato makeSound() OBRIGATÓRIO pela classe pai Animal.
    // O Cat implementa makeSound() DE SUA FORMA ÚNICA (diferente do Dog).
    @Override
    public void makeSound() {
        System.out.println(getName() + " mia: Miau!"); // Implementação específica para Cat.
    }

    // Metodo próprio de Cat (não existe em Animal ou Dog).
    public void scratchFurniture() {
        System.out.println(getName() + " está arranhando os móveis (ops!).");
        // Podemos chamar métodos herdados ou próprios aqui:
        sleep(); // Chama o metodo sleep() herdado de Animal.
    }

}

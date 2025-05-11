package oop;

// ============== PILLAR 3: INHERITANCE =================
// 'extends Animal' indica que 'Dog' é uma subclasse (filha) de 'Animal' (superclasse/pai).
// Dog HERDA todos os membros NÃO PRIVADOS de Animal (eat, sleep, introduce, getName, getEnergy).
public class Dog extends Animal {
    // Dog pode adicionar seus próprios atributos e métodos.

    // Construtor de Dog.
    public Dog(String name) {
        super(name); // 'super()' chama o construtor da classe pai (Animal) primeiro.
        // Garante que a parte "Animal" do Dog seja inicializada (dando o nome).
        System.out.println(" ... e sou um cachorro!");
    }

    // ============== PILLAR 4: POLYMORPHISM =================
    // Implementação do metodo abstrato makeSound() OBRIGATÓRIO pela classe pai Animal.
    // O '@Override' indica que estamos fornecendo uma implementação para um metodo que
    // já existe na classe pai/interface. É boa prática usá-lo.
    @Override
    public void makeSound() {
        System.out.println(getName() + " late: Au Au!"); // Implementação específica para Dog.
    }

    // Metodo próprio de Dog (não existe em Animal ou Cat).
    public void fetchStick() {
        System.out.println(getName() + " foi buscar o graveto!");
        // Podemos chamar métodos herdados ou próprios aqui:
        eat(); // Chama o metodo eat() herdado de Animal.
    }

}

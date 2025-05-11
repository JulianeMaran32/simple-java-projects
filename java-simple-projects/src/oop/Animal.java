package oop;

// ============== PILLAR 2: ABSTRACTION (Abstract Class) =================
// 'abstract' indica que não podemos criar um objeto DIRETAMENTE desta classe (ex: new Animal(...)).
// Ela representa um conceito geral e serve como "molde base" para classes mais específicas (filhas).
// Ela define o QUE um Animal faz de forma geral, mas pode deixar o COMO para as filhas.
public abstract class Animal {

    // ============== PILLAR 1: ENCAPSULATION =================
    // 'private' indica que estes atributos (propriedades) só podem ser acessados
    // e modificados diretamente DENTRO desta classe 'Animal'.
    // Isso protege os dados de serem alterados de forma indesejada por "fora".
    private String name;
    private int energy;

    // Construtor: Metodo especial chamado ao criar um novo objeto (ex: new Dog(...)).
    // Ele inicializa o objeto.
    public Animal(String name) {
        this.name = name; // 'this.name' se refere ao atributo 'name' desta classe.
        this.energy = 100; // Todos os animais começam com 100 de energia.
        System.out.println(name + " nasceu!");
    }

    // ============== PILLAR 1: ENCAPSULATION (Getters/Setters) =================
    // Métodos públicos para acessar (ler) os atributos privados de forma controlada (Getters).
    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    // Exemplo de Setter (para mudar a cor, se tivéssemos um atributo cor):
    // public void setColor(String newColor) { this.color = newColor; }
    // Setters podem ter lógica de validação, como verificar se a nova cor é válida.

    // ============== PILLAR 1: ENCAPSULATION (Methods control data) =================
    // Metodo privado: Detalhe interno de como a energia diminui.
    private void decreaseEnergy(int amount) {
        this.energy -= amount;
        if (this.energy < 0) this.energy = 0;
    }

    // Metodo público para comer. Ele usa o metodo privado para controlar a energia.
    public void eat() { // Comportamento geral de Animal
        System.out.println(this.name + " está comendo...");
        decreaseEnergy(10);
        System.out.println("Energia de " + this.name + " agora é: " + this.energy);
    }

    // Metodo público para dormir (aumenta energia).
    public void sleep() { // Comportamento geral de Animal
        System.out.println(this.name + " está dormindo...");
        this.energy += 20; // Aumenta energia (diretamente, pois estamos DENTRO da classe).
        if (this.energy > 100) this.energy = 100; // Garante que não passa de 100.
        System.out.println("Energia de " + this.name + " agora é: " + this.energy);
    }

    // ============== PILLAR 2 & 4: ABSTRACTION & POLYMORPHISM =================
    // Metodo 'abstract': A classe Animal diz que TO-DO Animal DEVE ter este metodo,
    // mas ELA NÃO fornece a implementação (o COMO fazer).
    // As classes filhas são OBRIGADAS a fornecer a sua própria versão deste metodo.
    public abstract void makeSound();

    // Metodo para apresentar o animal. Este metodo NÃO é abstrato, tem implementação aqui.
    // As classes filhas HERDAM este metodo e o usam como está.
    public void introduce() {
        System.out.println("Olá, eu sou " + this.name + ". Tipo: " + this.getClass().getSimpleName());
        // getName() é usado para acessar o nome (Encapsulamento).
        // getClass().getSimpleName() mostra o tipo REAL do objeto (Dog, Cat, etc.).
    }

}

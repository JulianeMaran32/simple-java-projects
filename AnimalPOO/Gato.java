// ============== PILAR 3: HERANÇA =================
// Gato 'estende' (extends) Animal. Também herda tudo de Animal.
public class Gato extends Animal {

    // Construtor do Gato
    public Gato(String nome) {
        super(nome); // Chama o construtor do pai Animal
        System.out.println("  ... e sou um gato!");
    }

    // ============== PILAR 4: POLIMORFISMO =================
    // O Gato também PRECISA implementar fazerSom(), mas faz DE SUA FORMA ÚNICA.
    @Override
    public void fazerSom() {
        System.out.println(getNome() + " mia: Miau!");
    }

    // Gato também pode ter métodos PRÓPRIOS
    public void arranharMoveis() {
        System.out.println(getNome() + " está arranhando os móveis (ops!).");
        System.out.println("(Arranhar móveis também cansa!)");
        comer(); // Chama o metodo comer herdado de Animal
    }

}

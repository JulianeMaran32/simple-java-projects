// ============== PILAR 2: ABSTRAÇÃO (Classe Abstrata) =================
// A classe Animal é um CONCEITO geral. Faz sentido ter a IDEIA de um Animal,
// mas talvez não um "Animal genérico" que não é nem cachorro nem gato.
// Por isso, a tornamos ABSTRACT (abstrata). Você NÃO pode criar um objeto
// diretamente da classe Animal (ex: new Animal("Bicho")), APENAS de suas "filhas".
// Ela define o QUE um Animal faz de forma geral.
public abstract class Animal {

    // ============== PILAR 1: ENCAPSULAMENTO =================
    // 'private' significa que só os métodos DENTRO desta classe Animal
    // podem mexer diretamente nesses dados (atributos).
    // Isso protege os dados de serem modificados de forma errada por "fora".
    private String nome;
    private int energia; // Vamos dar energia para os animais

    // Construtor: É como montamos um Animal quando ele nasce (quando criamos o objeto)
    public Animal(String nome) {
        this.nome = nome; // O 'this.nome' se refere ao 'nome' private acima
        this.energia = 100; // Todos os animais começam com 100 de energia
        System.out.println(nome + " nasceu!");
    }

    // Metodo público para obter o nome (Encapsulamento: acesso controlado)
    public String getNome() {
        return this.nome;
    }

    // Metodo público para obter a energia (Encapsulamento: acesso controlado)
    public int getEnergia() {
        return this.energia;
    }

    // Metodo privado para diminuir energia (Encapsulamento: detalhe interno)
    private void diminuirEnergia(int quantidade) {
        this.energia -= quantidade;
        if (this.energia < 0) this.energia = 0; // Garante que a energia não seja negativa
    }

    // Metodo público para comer (usa o metodo privado diminuirEnergia)
    public void comer() {
        System.out.println(this.nome + " está comendo...");
        diminuirEnergia(10); // Comer gasta um pouco de energia (simples!)
        System.out.println("Energia de " + this.nome + " agora é: " + this.energia);
    }

    // Metodo público para dormir (aumenta energia)
    public void dormir() {
        System.out.println(this.nome + " está dormindo...");
        this.energia += 20; // Dormir restaura energia
        if (this.energia > 100) this.energia = 100; // Energia máxima é 100
        System.out.println("Energia de " + this.nome + " agora é: " + this.energia);
    }

    // ============== PILAR 2 & 4: ABSTRAÇÃO & POLIMORFISMO =================
    // Este metodo é 'abstract'. Isso significa que a classe Animal diz que
    // TODO Animal DEVE ter um método 'fazerSom()', mas ELA NÃO diz COMO fazer o som.
    // É um metodo obrigatório para as classes "filhas".
    public abstract void fazerSom();

    // Metodo para apresentar o animal (não é abstrato, é herdado)
    public void apresentar() {
        System.out.println("Olá, eu sou " + this.nome + ". Tipo: " + this.getClass().getSimpleName());
    }

}
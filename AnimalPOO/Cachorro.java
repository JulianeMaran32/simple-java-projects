// ============== PILAR 3: HERANÇA =================
// Cachorro 'estende' (extends) Animal. Isso significa que Cachorro é um
// tipo de Animal. Ele HERDA tudo que Animal tem (nome, energia, comer, dormir, apresentar).
public class Cachorro extends Animal {

    // Cachorro tem seu próprio construtor, mas chama o construtor do pai (Animal)
    public Cachorro(String nome) {
        super(nome); // Chama o 'public Animal(String nome)' da classe Animal
        System.out.println("  ... e sou um cachorro!");
    }

    // ============== PILAR 4: POLIMORFISMO =================
    // O Cachorro PRECISA implementar o metodo fazerSom(), porque Animal o declarou como abstrato.
    // E ele implementa de FORMA DIFERENTE de outros animais.
    // O '@Override' é uma anotação que diz: "Eu estou implementando um metodo que
    // já existe na classe pai (ou interface)". Ajuda o Java a verificar se você
    // escreveu o nome do metodo corretamente.
    @Override
    public void fazerSom() {
        System.out.println(getNome() + " late: Au Au!"); // Usa o nome herdado e o comportamento próprio
    }

    // Cachorro também pode ter métodos PRÓPRIOS que não existem em Animal
    public void buscarGraveto() {
        System.out.println(getNome() + " foi buscar o graveto!");
        // Buscar graveto gasta mais energia! Podemos chamar um metodo herdado/próprio
        // Não temos um metodo para diminuir aqui, vamos chamar o 'comer' de novo só para exemplo de chamar herdado
        // Ou melhor, vamos diminuir energia direto aqui (mostrando que a filha pode mexer na energia se fosse
        // protected/default, mas é private, então usamos um metodo do pai se tivesse um):
        // Como a energia é PRIVATE na classe pai, a filha não mexe diretamente nela.
        // Precisaríamos de um metodo protected/public no pai para isso.
        // Vamos simular que gasta energia chamando 'comer' que gasta energia, só para mostrar o uso de metodo herdado:
        System.out.println("(Buscar graveto cansou o " + getNome() + ")");
        comer(); // Chama o metodo comer herdado de Animal!
    }

}
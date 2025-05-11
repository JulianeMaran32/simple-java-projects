import java.util.ArrayList;
import java.util.List;

// ============== CLASSE PRINCIPAL PARA RODAR O PROJETO =================
// Esta classe tem o metodo main() que é o ponto de partida do programa.
public class AnimaisPOO {

    public static void main(String[] args) {
        System.out.println("--- Demonstrando POO com Animais ---");

        // Criando objetos (instâncias das classes)
        Cachorro meuCachorro = new Cachorro("Rex"); // Criando um objeto Cachorro
        Gato meuGato = new Gato("Felix");         // Criando um objeto Gato

        System.out.println("\n--- Ações dos objetos individuais ---");

        // ============== PILAR 1: ENCAPSULAMENTO em Ação =================
        // Não podemos fazer: meuCachorro.energia = 50;  <-- Erro! energia é private.
        // Não podemos fazer: System.out.println(meuGato.nome); <-- Erro! nome é private.
        // Temos que usar os métodos públicos:
        System.out.println("Nome do cachorro: " + meuCachorro.getNome());
        System.out.println("Energia do gato: " + meuGato.getEnergia());

        // ============== PILAR 3: HERANÇA em Ação =================
        // Cachorro e Gato podem usar métodos que vieram da classe Animal:
        meuCachorro.comer(); // Metodo herdado de Animal
        meuGato.dormir();   // Metodo herdado de Animal

        // Eles também podem usar seus próprios métodos:
        meuCachorro.buscarGraveto(); // Metodo próprio de Cachorro
        meuGato.arranharMoveis();   // Metodo próprio de Gato

        System.out.println("\n--- Demonstrando POLIMORFISMO (Muitas Formas) ---");

        // ============== PILAR 4: POLIMORFISMO em Ação =================
        // Podemos criar uma lista que guarda REFERÊNCIAS do tipo Animal
        // (o tipo 'pai' ou mais geral)...
        List<Animal> meusBichos = new ArrayList<>();

        // ...e colocar objetos dos tipos 'filhos' (Cachorro, Gato) nela!
        // Uma variável/lista do tipo Animal pode "apontar" para um objeto Cachorro ou Gato.
        meusBichos.add(meuCachorro); // Adiciona o Rex (que é um Cachorro)
        meusBichos.add(meuGato);     // Adiciona o Felix (que é um Gato)
        // meusBichos.add(new Animal("Qualquer")); // ISSO NÃO FUNCIONA! Animal é abstrato.

        // Agora, vamos percorrer a lista e pedir para CADA bicho fazer um som,
        // USANDO O MESMO COMANDO (o metodo fazerSom()).
        // O Java, em tempo de execução, sabe qual é o TIPO REAL do objeto
        // (se é um Cachorro ou Gato) e chama o metodo fazerSom() CORRETO para aquele objeto!
        System.out.println("Pedindo para cada bicho fazer um som:");
        for (Animal bicho : meusBichos) {
            // Aqui 'bicho' é visto como um Animal (o tipo da variável/lista),
            // mas o Java magicamente chama o fazerSom() do tipo REAL do objeto.
            bicho.fazerSom(); // Polimorfismo em ação!
        }

        System.out.println("\n--- Apresentando todos os bichos (Polimorfismo + Herança) ---");
        for (Animal bicho : meusBichos) {
            // O metodo apresentar() é herdado e funciona para todos,
            // mostrando o nome (herdado) e o tipo real do objeto.
            bicho.apresentar();
        }

        System.out.println("\n--- Fim da demonstração ---");

        // Exemplo de Abstração novamente:
        // Animal umBicho = new Animal("Nome"); // <- Se tentar descomentar esta linha, dará erro de compilação!
        //    Porque Animal é uma classe abstrata.
        Animal outroBicho = new Cachorro("Pluto"); // <- Mas você PODE criar uma variável
        // Animal que guarda um Cachorro.
        //    Aqui a abstração permite tratar um Cachorro como um Animal mais geral.
        outroBicho.fazerSom(); // E o polimorfismo garante que ele latiirá.
        // outroBicho.buscarGraveto(); // <- Isso NÃO funciona! A variável é do TIPO Animal,
        // e Animal não tem o metodo buscarGraveto().
        //    Mesmo que o objeto REAL seja um Cachorro. Você só pode chamar métodos que existem no tipo da VARIÁVEL.
    }

}

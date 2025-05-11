package basics;

// Tudo em Java fica dentro de uma classe.
// Pense na classe como um "molde" ou "recipiente" para o seu código.
// 'public' significa que esta classe pode ser acessada de qualquer lugar.
// 'class' é a palavra-chave para criar uma classe.
// 'HelloWorld' é o nome da nossa classe.
public class HelloWorld {

    // Este é o metodo principal (main).
    // É por aqui que o programa Java começa a executar.
    // Quando você "roda" um programa Java, a Máquina Virtual Java (JVM) procura por este metodo.
    // 'public static void main(String[] args)' é a assinatura exata que a JVM procura.
    // - 'public': Pode ser chamado de fora da classe (pela JVM).
    // - 'static': Pertence à classe, não a um objeto específico. Não precisa criar um objeto HelloWorld para chamar o main.
    // - 'void': Este metodo não retorna nenhum valor depois de executar.
    // - 'main': O nome especial deste metodo.
    // - '(String[] args)': Permite passar informações (argumentos) para o programa ao iniciá-lo (não usaremos agora, mas precisa estar aqui).

    public static void main(String[] args) {
        // Este comando mostra uma mensagem na tela (no console).
        // 'System.out' se refere à saída padrão do sistema.
        // 'println' (print line) imprime o texto entre parênteses e pula para a próxima linha.
        // O texto a ser impresso deve estar entre aspas duplas "".
        System.out.println("Olá, Mundo!");

        // Podemos imprimir outras coisas também:
        System.out.println("Meu primeiro programa Java!");

        // O programa termina automaticamente quando o método main acaba.

    }

}

package advanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// --- Classe Principal para Rodar o Exemplo ---
public class LambdaStreamExample {

    public static void main(String[] args) {
        System.out.println("--- Demonstrando Lambda Expressions ---"); //

        // O que é uma Interface Funcional?
        // É uma interface que tem APENAS UM metodo abstrato.
        // Exemplos em Java: Runnable (metodo run()), Consumer<T> (metodo accept(T)),
        // Predicate<T> (metodo test(T)), Function<T, R> (metodo apply(T)), etc.
        // Lambdas são usadas para implementar esses metodos únicos de forma rápida!

        // Exemplo 1: Implementando Runnable (Interface Funcional com metodo run() -> void)
        // Sem Lambda (jeito antigo):
        Runnable oldTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("-> Tarefa antiga rodando..."); //
            }
        };
        oldTask.run(); // Chama o metodo run()

        // Com Lambda: Forma curta de implementar Runnable
        // () -> { corpo do código }  -> Não recebe argumentos, não retorna nada.
        Runnable lambdaTask = () -> {
            System.out.println("-> Tarefa lambda rodando!"); //
        };
        lambdaTask.run(); // Chama o metodo run()

        // Com Lambda (ainda mais curto, corpo com 1 linha e sem chaves):
        Runnable anotherTask = () -> System.out.println("-> Outra tarefa lambda rodando! (curta)");
        anotherTask.run(); // Chama o metodo run()


        // Exemplo 2: Implementando Predicate<T> (Interface Funcional com metodo test(T) -> boolean)
        // Predicate<Integer> verifica se um Integer é maior que 10
        // Sem Lambda:
        Predicate<Integer> greaterThan10Old = new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number > 10;
            }
        };
        System.out.println("15 é maior que 10? " + greaterThan10Old.test(15)); // true
        System.out.println("5 é maior que 10? " + greaterThan10Old.test(5));   // false

        // Com Lambda: Forma curta de implementar Predicate<Integer>
        // (number) -> corpo que retorna boolean -> recebe um Integer, retorna true/false
        Predicate<Integer> greaterThan10Lambda = (number) -> number > 10;
        // Se for só um argumento, os parênteses () são opcionais:
        // Predicate<Integer> greaterThan10Lambda = number -> number > 10;

        System.out.println("15 é maior que 10 (Lambda)? " + greaterThan10Lambda.test(15)); // true
        System.out.println("5 é maior que 10 (Lambda)? " + greaterThan10Lambda.test(5));   // false

        System.out.println("--- Fim da Demonstração de Lambda Expressions ---"); //


        System.out.println("\n--- Demonstrando Stream API ---"); //
        // Stream API: Processando coleções (Listas, etc.) de forma "pipeline".
        // Geralmente usada JUNTO com Lambdas.

        List<String> fruits = Arrays.asList("Maçã", "Banana", "Laranja", "Morango", "Abacaxi");

        // Exemplo 1: Filtrar frutas que começam com 'M' e imprimir cada uma
        System.out.println("Frutas que começam com 'M':"); //
        fruits.stream()                 // 1. Cria um Stream a partir da lista (metodo stream() é padrão)
                .filter(f -> f.startsWith("M")) // 2. Op. Intermediária: Filtra (mantém) apenas frutas 'f' onde 'f' começa com "M". Usa Lambda (Predicate)!
                .forEach(f -> System.out.println("- " + f)); // 3. Op. Terminal: Para cada fruta 'f' restante, imprime. Usa Lambda (Consumer)!
        // Saída esperada:
        // - Maçã
        // - Morango


        // Exemplo 2: Transformar todas as frutas para letras maiúsculas e coletar em uma nova lista
        List<String> upperCaseFruits = fruits.stream()
                .map(f -> f.toUpperCase()) // 2. Op. Intermediária: Mapeia (transforma) cada fruta 'f' para sua versão em maiúsculas. Usa Lambda (Function)!
                .collect(Collectors.toList()); // 3. Op. Terminal: Coleta os resultados em uma nova Lista (metodo collect() é padrão, Collectors.toList() é padrão)

        System.out.println("\nFrutas em maiúsculas:"); //
        System.out.println(upperCaseFruits); // Saída esperada: [MAÇÃ, BANANA, LARANJA, MORANGO, ABACAXI]


        // Exemplo 3: Contar quantas frutas na lista original têm mais de 5 letras
        long count = fruits.stream()      // 1. Cria Stream
                .filter(f -> f.length() > 5) // 2. Op. Intermediária: Filtra apenas as com mais de 5 letras. Usa Lambda! (metodo length() é padrão de String)
                .count();                    // 3. Op. Terminal: Conta os elementos restantes (metodo count() é padrão)

        System.out.println("\nQuantidade de frutas com mais de 5 letras: " + count); //
        // Saída esperada: 3 (Banana, Laranja, Abacaxi)


        // Exemplo 4: Encontrar a primeira fruta que começa com 'L'
        fruits.stream()                // 1. Cria Stream
                .filter(f -> f.startsWith("L")) // 2. Op. Intermediária: Filtra (Laranja) (metodo startsWith() é padrão de String)
                .findFirst()           // 3. Op. Terminal: Tenta encontrar o primeiro elemento (Retorna Optional) (metodo findFirst() é padrão)
                .ifPresent(f -> System.out.println("\nPrimeira fruta com 'L': " + f)); // Se encontrou algo, imprime. Usa Lambda (Consumer)! (metodo ifPresent() é padrão de Optional)


        System.out.println("\n--- Fim da Demonstração de Stream API ---"); //

        System.out.println("\nLambdas e Streams são muito usados juntos para processar coleções de forma moderna e funcional no Java 8+!"); //


    }

}

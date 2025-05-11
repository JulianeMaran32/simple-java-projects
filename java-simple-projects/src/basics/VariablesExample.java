package basics;

// Este programa demonstra a criação e uso de variáveis com diferentes tipos de dados em Java.
// Usamos nomes em inglês para classes, métodos e variáveis, mas comentários e textos de saída em português.
public class VariablesExample { // CamelCase

    public static void main(String[] args) { // Metodo principal, ponto de partida do programa

        System.out.println("--- Exemplo de Variáveis e Tipos de Dados ---");

        // --- 1. Declarando e Inicializando Variáveis ---
        // Declarar: Criar a "caixinha" dando um tipo e um nome.
        // Inicializar: Colocar um primeiro valor na caixinha.
        // Atribuir: Mudar o valor na caixinha.

        // Exemplo de declaração (cria a caixinha 'count', mas ainda está vazia/com valor padrão)
        int count; // Declara uma variável do tipo inteiro (int) chamada 'count'

        // Exemplo de atribuição (coloca o valor 0 na caixinha 'count')
        count = 0; // Atribui o valor 0 à variável 'count'
        System.out.println("Valor inicial da variável count após atribuição: " + count); // Usando a variável 'count'

        // É mais comum declarar e inicializar na mesma linha:
        int totalItems = 150; // Declara 'totalItems' como int e já coloca 150 nela. Nome da variável em camelCase.

        // --- 2. Tipos de Dados Primitivos (Os básicos do Java) ---

        // Inteiros (números sem vírgula)
        byte smallNumber = 10; // byte: Inteiro pequeno, de -128 a 127. Usa pouca memória.
        short mediumNumber = 5000; // short: Inteiro médio, de -32,768 a 32,767.
        int standardNumber = 100_000; // int: Inteiro padrão, o mais usado. Suporta números grandes (aprox. +/- 2 bilhões). Podemos usar '_' para separar milhares (ajuda na leitura).

        long veryBigNumber = 10_000_000_000L; // long: Inteiro muito grande. Precisa do 'L' no final do número.

        // Números com vírgula (Decimais / Ponto Flutuante)
        float price = 23.55f; // float: Número decimal com menor precisão. Precisa do 'f' ou 'F' no final. Usa menos memória que double.
        double precisePrice = 123.456; // double: Número decimal com MAIOR precisão, o mais comum para valores com vírgula. O 'd' é opcional (123.456d).

        // Caractere (um único símbolo)
        char initial = 'J'; // char: Guarda um único caractere. Use aspas SIMPLES ''.

        // Lógico (Verdadeiro ou Falso)
        boolean isComplete = true; // boolean: Guarda apenas 'true' ou 'false'. Ideal para condições.

        // --- 3. Tipo Não Primitivo Básico: String ---
        // String: Guarda texto (sequência de caracteres). É uma CLASSE, não um tipo primitivo.
        String greetingMessage = "Olá, aprendizes de Java!"; // Use aspas DUPLAS "". Nome da variável em camelCase.

        // --- 4. Classes Wrapper (Versões Objeto dos Tipos Primitivos) ---
        // Para cada tipo primitivo, existe uma classe "irmã" que é um Objeto.
        // Usadas em coleções (como ArrayList) e quando precisamos de funcionalidades de Objeto.
        // Java faz a conversão automática na maioria das vezes (Autoboxing/Unboxing).
        Integer objectCount = totalItems; // int (primitivo) para Integer (Wrapper) - Autoboxing
        Double objectPrice = precisePrice; // double (primitivo) para Double (Wrapper) - Autoboxing
        // int primitivoCount = objectCount; // Integer (Wrapper) para int (primitivo) - Unboxing

        // --- 5. Mostrando os Valores das Variáveis ---
        System.out.println("\nValores das variáveis:"); // Texto de saída em português
        System.out.println("Byte (smallNumber): " + smallNumber);
        System.out.println("Short (mediumNumber): " + mediumNumber);
        System.out.println("Int (totalItems): " + totalItems); // Já está sendo usada
        System.out.println("Int (standardNumber): " + standardNumber); // **AGORA ESTÁ SENDO USADA** - Mostrando o valor
        System.out.println("Long (veryBigNumber): " + veryBigNumber);
        System.out.println("Float (price): " + price);
        System.out.println("Double (precisePrice): " + precisePrice);
        System.out.println("Char (initial): " + initial);
        System.out.println("Boolean (isComplete): " + isComplete);
        System.out.println("String (greetingMessage): " + greetingMessage);
        System.out.println("Integer Wrapper (objectCount): " + objectCount);
        System.out.println("Double Wrapper (objectPrice): " + objectPrice);

        // --- 6. Usando Variáveis em Operações Simples ---
        int itemQuantity = 5;
        double itemCost = 10.50;
        double orderTotal = itemQuantity * itemCost; // Multiplicação de int por double resulta em double

        // Exemplo usando 'count' em uma operação (apenas para mostrar o uso)
        int finalCount = count + 10; // Usando 'count' em uma soma
        System.out.println("\nExemplo usando 'count' em operação: " + finalCount); // Mostrando o resultado

        // Exemplo usando 'standardNumber' em uma operação (apenas para mostrar o uso)
        int bigTotal = standardNumber + 5000; // Usando 'standardNumber' em uma soma
        System.out.println("Exemplo usando 'standardNumber' em operação: " + bigTotal); // Mostrando o resultado

        System.out.println("\nCálculo simples original:");
        System.out.println("Quantidade de itens: " + itemQuantity);
        System.out.println("Custo por item: " + itemCost);
        System.out.println("Total do pedido: " + orderTotal);

        // --- Fim do Exemplo ---
        System.out.println("\n--- Fim da Demonstração ---");

    }

}

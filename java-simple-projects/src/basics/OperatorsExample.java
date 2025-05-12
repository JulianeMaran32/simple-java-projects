package basics;

// Este programa demonstra o uso dos operadores básicos em Java: Aritméticos, Relacionais e Lógicos.
public class OperatorsExample {

    public static void main(String[] args) { // Metodo principal, ponto de partida do programa

        // --- 1. Operadores Aritméticos (Matemática) ---
        System.out.println("\n--- Operadores Aritméticos ---");

        int number1 = 20; // Declara e inicializa variáveis inteiras
        int number2 = 5;

        int sum = number1 + number2; // Operador de Adição (+)
        System.out.println(number1 + " + " + number2 + " = " + sum); // Mostra a operação e o resultado

        int difference = number1 - number2; // Operador de Subtração (-)
        System.out.println(number1 + " - " + number2 + " = " + difference);

        int product = number1 * number2; // Operador de Multiplicação (*)
        System.out.println(number1 + " * " + number2 + " = " + product);

        int division = number1 / number2; // Operador de Divisão (/). Para inteiros, é divisão INTEIRA (descarta decimal).
        System.out.println(number1 + " / " + number2 + " = " + division);

        int remainder = number1 % number2; // Operador de Resto da Divisão (%). O que sobra da divisão inteira.
        System.out.println(number1 + " % " + number2 + " = " + remainder);

        // Exemplo de divisão inteira vs decimal:
        int numInt1 = 10;
        int numInt2 = 3;
        int intDivisionResult = numInt1 / numInt2; // Ambos são inteiros
        System.out.println(numInt1 + " / " + numInt2 + " (divisão int) = " + intDivisionResult); // Saída: 3 (decimal 0.333... é perdido)

        double numDouble1 = 10.0; // Usando double (número com vírgula)
        double numDouble2 = 3.0;
        double doubleDivisionResult = numDouble1 / numDouble2; // Um ou ambos double
        System.out.println(numDouble1 + " / " + numDouble2 + " (divisão double) = " + doubleDivisionResult); // Saída: 3.333...

        // Operadores de Incremento (++) e Decremento (--)
        int counter = 10;
        System.out.println("Contador inicial: " + counter);
        counter++; // Incrementa em 1 (counter agora é 11)
        System.out.println("Contador depois de counter++: " + counter);
        counter--; // Decrementa em 1 (counter agora é 10 de novo)
        System.out.println("Contador depois de counter--: " + counter);

        // Nota: Quando usados SOZINHOS em uma linha (como acima), ++var e var++ fazem a mesma coisa.
        // A diferença aparece quando usados DENTRO de uma expressão. Não se preocupe com isso agora.

        // --- 2. Operadores Relacionais (Comparação) ---
        System.out.println("\n--- Operadores Relacionais (Comparações) ---");
        // Comparam valores e retornam TRUE ou FALSE (boolean).

        int value1 = 15;
        int value2 = 10;
        int value3 = 15;

        boolean isEqual = value1 == value2; // Igual a (==)
        System.out.println(value1 + " == " + value2 + "? " + isEqual); // false

        boolean isDifferent = value1 != value2; // Diferente de (!=)
        System.out.println(value1 + " != " + value2 + "? " + isDifferent); // true

        boolean isGreaterThan = value1 > value2; // Maior que (>)
        System.out.println(value1 + " > " + value2 + "? " + isGreaterThan); // true

        boolean isGreaterOrEqual = value1 >= value3; // Maior ou igual a (>=)
        System.out.println(value1 + " >= " + value3 + "? " + isGreaterOrEqual); // true

        boolean isLessThan = value1 < value2; // Menor que (<)
        System.out.println(value1 + " < " + value2 + "? " + isLessThan); // false

        boolean isLessOrEqual = value2 <= value1; // Menor ou igual a (<=)
        System.out.println(value2 + " <= " + value1 + "? " + isLessOrEqual); // true

        // Comparando Strings (CUIDADO com ==)
        String text1 = "Java";
        String text2 = "Java";
        String text3 = "java"; // Letra minúscula

        System.out.println("\nComparando Strings:");
        System.out.println("text1 == text2? " + (text1 == text2)); // Cuidado! Pode dar true ou false dependendo de como Java gerencia Strings. NÃO use para comparar conteúdo.
        System.out.println("text1.equals(text2)? " + text1.equals(text2)); // Use .equals() para comparar o CONTEÚDO de Strings! (true)
        System.out.println("text1.equals(text3)? " + text1.equals(text3)); // Conteúdo diferente (false)
        System.out.println("text1.equalsIgnoreCase(text3)? " + text1.equalsIgnoreCase(text3)); // Ignora maiúsculas/minúsculas (true)


        // --- 3. Operadores Lógicos (Combinando Lógica TRUE/FALSE) ---
        System.out.println("\n--- Operadores Lógicos ---");
        // Trabalham com valores booleanos (true/false) e retornam booleanos.

        boolean conditionA = true;
        boolean conditionB = false;

        // E Lógico (&&) - Resultado é TRUE SÓ SE AMBOS forem TRUE
        boolean resultAnd = conditionA && conditionB;
        System.out.println(conditionA + " && " + conditionB + " = " + resultAnd); // true && false = false

        // OU Lógico (||) - Resultado é TRUE SE PELO MENOS UM for TRUE
        boolean resultOr = conditionA || conditionB;
        System.out.println(conditionA + " || " + conditionB + " = " + resultOr); // true || false = true

        // Negação (!) - Inverte o valor (true vira false, false vira true)
        boolean resultNotA = !conditionA;
        System.out.println("!" + conditionA + " = " + resultNotA); // !true = false

        boolean resultNotB = !conditionB;
        System.out.println("!" + conditionB + " = " + resultNotB); // !false = true


        // Combinando lógicos e relacionais (Exemplo para Decisões)
        int age = 20;
        boolean hasLicense = true;

        // Condição: Idade é maior ou igual a 18 E tem licença?
        boolean canDrive = (age >= 18) && hasLicense;
        System.out.println("\nPode dirigir? (Idade >= 18 && Tem Licença) -> " + canDrive); // true


        // --- 4. Operadores de Atribuição Composta (Atalhos) ---
        System.out.println("\n--- Operadores de Atribuição Composta ---");
        // São atalhos para fazer uma operação e atribuir na mesma variável.

        int score = 100;
        System.out.println("Pontuação inicial: " + score);

        score += 20; // score = score + 20;
        System.out.println("Pontuação depois de score += 20: " + score); // 120

        score -= 10; // score = score - 10;
        System.out.println("Pontuação depois de score -= 10: " + score); // 110

        score *= 2; // score = score * 2;
        System.out.println("Pontuação depois de score *= 2: " + score); // 220

        score /= 11; // score = score / 11; (divisão inteira)
        System.out.println("Pontuação depois de score /= 11: " + score); // 20

        score %= 15; // score = score % 15; (resto: 20 dividido por 15 é 1 com resto 5)
        System.out.println("Pontuação depois de score %= 15: " + score); // 5


        // --- Fim do Exemplo ---
        System.out.println("\n--- Fim da Demonstração ---");

    }

}
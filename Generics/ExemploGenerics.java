import java.util.ArrayList;

// --- Classe Principal para Rodar o Exemplo ---
public class ExemploGenerics {

    public static void main(String[] args) {
        System.out.println("--- Exemplo Sem Generics (Caixa Antiga) ---");
        CaixaAntiga caixaQualquer = new CaixaAntiga();

        // Podemos colocar um String...
        caixaQualquer.setItem("Olá Mundo Antigo!");

        // ...e depois podemos colocar um Integer! Sem erro na hora de colocar!
        caixaQualquer.setItem(123);

        // Ao pegar, recebemos um Object. Precisamos fazer casting.
        // String texto = (String) caixaQualquer.getItem(); // <-- Isso daria erro em tempo de execução (ClassCastException)
        //    porque o item guardado é na verdade um Integer!
        //    O Java NÃO te avisa antes de rodar!

        // Se soubermos que é um Integer, funciona com casting correto:
        Integer numero = (Integer) caixaQualquer.getItem();
        System.out.println("Peguei da Caixa Antiga (com casting): " + numero);

        // Problema: Você precisa SEMPRE lembrar ou descobrir qual tipo está dentro
        // e fazer o casting correto, correndo o risco de ClassCastException.
        System.out.println("---------------------------------------");


        System.out.println("\n--- Exemplo Com Generics (Caixa Moderna) ---");

        // Criamos uma Caixa que VAI GUARDAR APENAS Strings.
        // O 'T' na definição da classe se torna 'String' AQUI.
        Caixa<String> caixaDeTexto = new Caixa<>(); // O <> vazio no new é o Diamond Operator, Java 7+ infere o tipo

        // Podemos colocar um String:
        caixaDeTexto.setItem("Olá Mundo Moderno!");

        // Tentar colocar um Integer AQUI DARIA ERRO NA COMPILAÇÃO!
        // caixaDeTexto.setItem(456); // <--- Tente descomentar esta linha! O compilador vai gritar!
        //     "Erro: incompatible types: int cannot be converted to String"
        //     Isso é a Segurança de Tipo em ação! Erro pego cedo.

        // Ao pegar, o Java JÁ SABE que é um String. Não precisa de casting!
        String textoModerno = caixaDeTexto.getItem(); // Retorna diretamente um String
        System.out.println("Peguei da Caixa Moderna (sem casting): " + textoModerno);


        System.out.println("\n--- Outro Exemplo Com Generics (Caixa de Números) ---");

        // Criamos uma Caixa que VAI GUARDAR APENAS Integers.
        // Agora o 'T' na definição da classe se torna 'Integer'.
        Caixa<Integer> caixaDeNumero = new Caixa<>();

        // Podemos colocar um Integer:
        caixaDeNumero.setItem(789);

        // Tentar colocar um String AQUI DARIA ERRO NA COMPILAÇÃO!
        // caixaDeNumero.setItem("Isso não é um número"); // <--- Tente descomentar esta linha! O compilador vai gritar!

        // Ao pegar, o Java JÁ SABE que é um Integer. Sem casting!
        Integer numeroModerno = caixaDeNumero.getItem(); // Retorna diretamente um Integer
        System.out.println("Peguei da Caixa Moderna (de números, sem casting): " + numeroModerno);

        System.out.println("------------------------------------------");

        // Exemplo rápido com ArrayLists (onde Generics são muito usados)
        System.out.println("\n--- Exemplo com ArrayLists e Generics ---");

        // Lista antiga (sem Generics)
        ArrayList listaAntiga = new ArrayList();
        listaAntiga.add("abc");
        listaAntiga.add(123);
        // Object item = listaAntiga.get(0); // Pega um Object
        // String s = (String) item; // Precisa de casting
        // Integer i = (Integer) listaAntiga.get(1); // Precisa de casting

        // Lista moderna (COM Generics) - Lista SÓ de Strings
        ArrayList<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("Primeiro String");
        // listaDeStrings.add(456); // <--- Erro de compilação! Segurança de tipo!

        String meuString = listaDeStrings.get(0); // Não precisa de casting! Java sabe que é String!
        System.out.println("Peguei da lista de Strings (sem casting): " + meuString);


        // Lista moderna (COM Generics) - Lista SÓ de Integers
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(99);
        // listaDeNumeros.add("Outro"); // <--- Erro de compilação!

        Integer meuNumero = listaDeNumeros.get(0); // Não precisa de casting! Java sabe que é Integer!
        System.out.println("Peguei da lista de Integers (sem casting): " + meuNumero);

        System.out.println("\n--- Fim da Demonstração ---");
    }

}

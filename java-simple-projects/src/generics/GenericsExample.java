package generics;

import java.util.ArrayList;

// --- Classe Principal para Rodar o Exemplo ---
public class GenericsExample {

    public static void main(String[] args) {

        System.out.println("--- Exemplo Sem Generics (Caixa Antiga) ---");
        OldBox caixaQualquer = new OldBox();

        // Podemos colocar um String...
        caixaQualquer.setItem("Olá Mundo Antigo!");

        // ...e depois podemos colocar um Integer! O compilador NÃO reclama aqui!
        caixaQualquer.setItem(123);

        // Ao pegar, recebemos um Object. Precisamos dizer ao Java qual tipo esperamos (casting).
        // String texto = (String) caixaQualquer.getItem(); // <--- SE você tentar isso AGORA, daria erro em tempo de EXECUÇÃO (ClassCastException)
        //    porque o último item guardado foi um Integer!
        //    O PONTO é que o Java NÃO te avisa ANTES de rodar!

        // Se soubermos (ou adivinharmos) que é um Integer, funciona com casting correto:
        Integer numero = (Integer) caixaQualquer.getItem();
        System.out.println("Peguei da Caixa Antiga (com casting e risco de erro): " + numero);

        System.out.println("---------------------------------------");

        System.out.println("\n--- Exemplo Com Generics (Caixa Moderna) ---");

        // Criamos uma Caixa que VAI GUARDAR APENAS Strings.
        // O 'T' na definição da classe <T> se torna 'String' NESTA instância.
        Box<String> caixaDeTexto = new Box<>(); // O <> vazio é o Diamond Operator (Java 7+) - Java infere o tipo

        // Podemos colocar um String:
        caixaDeTexto.setItem("Olá Mundo Moderno!");

        // Tentar colocar um Integer AQUI DARIA ERRO NA HORA DE COMPILAR!
        // caixaDeTexto.setItem(456); // <--- Tente descomentar esta linha! O compilador (javac) vai gritar!
        //     "Erro: incompatible types: int cannot be converted to String"
        //     Isso é a Segurança de Tipo em Ação! O erro é pego CEDO.

        // Ao pegar, o Java JÁ SABE que é um String. Não precisa de casting!
        String textoModerno = caixaDeTexto.getItem(); // Retorna diretamente um String
        System.out.println("Peguei da Caixa Moderna (sem casting): " + textoModerno);
        System.out.println("\n--- Outro Exemplo Com Generics (Caixa de Números) ---");

        // Criamos uma Caixa que VAI GUARDAR APENAS Integers.
        // Agora o 'T' na definição da classe <T> se torna 'Integer' NESTA instância.
        Box<Integer> caixaDeNumero = new Box<>();

        // Podemos colocar um Integer:
        caixaDeNumero.setItem(789);

        // Tentar colocar um String AQUI DARIA ERRO NA HORA DE COMPILAR!
        // caixaDeNumero.setItem("Isso não é um número"); // <--- Tente descomentar esta linha! O compilador vai gritar!

        // Ao pegar, o Java JÁ SABE que é um Integer. Sem casting!
        Integer numeroModerno = caixaDeNumero.getItem(); // Retorna diretamente um Integer
        System.out.println("Peguei da Caixa Moderna (de números, sem casting): " + numeroModerno);

        System.out.println("------------------------------------------");

        // Exemplo rápido com ArrayLists (onde Generics são muito usados)
        System.out.println("\n--- Exemplo com ArrayLists e Generics ---");

        // Lista antiga (sem Generics) - PODE guardar qualquer coisa, mas precisa de casting e é inseguro
        ArrayList listaAntiga = new ArrayList();
        listaAntiga.add("abc");
        listaAntiga.add(123);
        // String s = (String) listaAntiga.get(0); // Precisa de casting
        // Integer i = (Integer) listaAntiga.get(1); // Precisa de casting
        // Integer iErrado = (Integer) listaAntiga.get(0); // <--- Erro em Runtime! ClassCastException!

        // Lista moderna (COM Generics) - Lista SÓ de Strings. Segura e sem casting!
        ArrayList<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("Primeiro String");
        // listaDeStrings.add(456); // <--- Erro de compilação! Segurança de tipo!

        String meuString = listaDeStrings.get(0); // Não precisa de casting! Java sabe que é String!
        System.out.println("Peguei da lista de Strings (sem casting): " + meuString);


        // Lista moderna (COM Generics) - Lista SÓ de Integers. Segura e sem casting!
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(99);
        // listaDeNumeros.add("Outro"); // <--- Erro de compilação!

        Integer meuNumero = listaDeNumeros.get(0); // Não precisa de casting! Java sabe que é Integer!
        System.out.println("Peguei da lista de Integers (sem casting): " + meuNumero);

        System.out.println("\n--- Fim da Demonstração ---");

    }

}
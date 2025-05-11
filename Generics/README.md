# Generics

## Projeto Simples Demonstrando Generics

Vamos criar uma classe muito simples chamada `Caixa` que guarda um único item. Faremos uma versão "antiga" (sem
Generics) e uma versão "moderna" (com Generics) para comparar.

### Como Rodar

1. Salve o código acima como `ExemploGenerics.java`.
2. Abra o terminal ou prompt de comando na pasta onde salvou o arquivo.
3. Compile: `javac ExemploGenerics.java`
4. Execute: `java ExemploGenerics`

### Observações no Código

* Veja a `CaixaAntiga`: ela usa `Object`, e na hora de pegar (`getItem`), você precisa fazer `(Tipo)`. E você pode
  colocar tipos diferentes sem aviso prévio, o que é perigoso.
* Veja a `Caixa<T>`: usamos `<T>` na declaração da classe. `T` é um placeholder.
* Quando criamos `Caixa<String> caixaDeTexto = new Caixa<>();`, estamos dizendo que, **nesta instância**, o `T` será
  `String`.
* Quando criamos `Caixa<Integer> caixaDeNumero = new Caixa<>();`, nesta instância, o `T` será `Integer`.
* Note que nos métodos `setItem` e `getItem` da `Caixa<T>`, usamos `T`. Na `caixaDeTexto`, `setItem` só aceita `String`
  e `getItem` retorna `String`. Na `caixaDeNumero`, `setItem` só aceita `Integer` e `getItem` retorna `Integer`.
* As linhas comentadas com `<--- Tente descomentar esta linha!` mostram onde o compilador (o `javac`) vai te impedir de
  rodar o código, demonstrando a segurança de tipo dos Generics.

Generics parecem um pouco estranhos no começo por causa da sintaxe `< >`, mas a ideia por trás é simples: ter código
flexível (que funciona com vários tipos) mas seguro (que verifica os tipos em tempo de compilação). Eles são
extremamente comuns em coleções em Java (Listas, Mapas, Sets, etc.) e em muitas outras partes da linguagem e
bibliotecas.

### Exemplo de saída

```text
--- Exemplo Sem Generics (Caixa Antiga) ---
Peguei da Caixa Antiga (com casting): 123
---------------------------------------

--- Exemplo Com Generics (Caixa Moderna) ---
Peguei da Caixa Moderna (sem casting): Olá Mundo Moderno!

--- Outro Exemplo Com Generics (Caixa de Números) ---
Peguei da Caixa Moderna (de números, sem casting): 789
------------------------------------------

--- Exemplo com ArrayLists e Generics ---
Peguei da lista de Strings (sem casting): Primeiro String
Peguei da lista de Integers (sem casting): 99

--- Fim da Demonstração ---
```
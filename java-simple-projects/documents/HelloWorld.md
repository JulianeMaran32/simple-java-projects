# Explicação do Exemplo: HelloWorld.java

Este arquivo, `HelloWorld.java`, contém o código do programa Java mais simples possível. Ele serve para demonstrar a
estrutura básica de um programa Java e como exibir texto na tela (no console).

**Localização no Repositório:** `src/basics/HelloWorld.java`

### Entendendo o Código Linha por Linha (ou Bloco por Bloco)

Vamos ver cada parte importante deste código:

```java
package basics;
```

* **`package basics;`:** Esta linha define a qual "pacote" (um agrupamento lógico, como uma pasta) esta classe pertence.
  Pacotes ajudam a organizar suas classes, especialmente em projetos maiores, e evitam conflitos de nomes. O nome do
  pacote geralmente corresponde à estrutura de pastas no seu repositório (`src/basics/` -> `package basics;`).

```java
public class HelloWorld {
    // ... 
}
```

* **`public class HelloWorld { ... }`:**
    * `class HelloWorld`: Declara uma Classe chamada `HelloWorld`. Em Java, todo o código e funcionalidades vivem dentro
      de classes. Pense na classe como um "molde" ou um "recipiente" que guarda o código relacionado.
    * `public`: Este é um modificador de acesso. `public` significa que esta classe pode ser acessada e usada por código
      de qualquer outro lugar no seu projeto. A classe principal que tem o método `main` (o ponto de partida) geralmente
      precisa ser `public` para que a Máquina Virtual Java (JVM) consiga encontrá-la e iniciar o programa.
    * **Regra Importante:** O nome do arquivo (`.java`) deve ser **exatamente o mesmo** que o nome da classe que é
      declarada como `public` dentro dele. Por isso, o arquivo se chama `HelloWorld.java`.

```java
public static void main(String[] args) {
    // ... 
}
```

* **`public static void main(String[] args) { ... }`:** Esta linha define o **método** principal (o `main`). Este método
  é o **ponto de partida** de execução do seu programa. Quando você pede para a JVM rodar sua classe (
  `java HelloWorld`), é este método exato que ela procura e executa primeiro.
    * `public`: Novamente, um modificador de acesso. O método `main` precisa ser `public` para ser acessível pela JVM
      que está fora da sua classe.
    * `static`: Este modificador significa que o método `main` pertence à **Classe** `HelloWorld` em si, e não a um *
      *objeto** específico criado a partir dessa classe. Você não precisa criar um `new HelloWorld()` para chamar o
      `main`; ele está disponível diretamente na classe.
    * `void`: Indica o **tipo de retorno** do método. `void` significa que este método **não devolve nenhum valor**
      depois de terminar a execução.
    * `main`: Este é o **nome** especial e fixo do método principal. A JVM procura por um método com este nome exato.
    * `(String[] args)`: São os **parâmetros** (ou argumentos) que o método main pode receber. `String[]` significa um "
      array de Strings" (uma lista de textos). `args` é o nome dado a essa lista (você poderia usar outro nome, mas
      `args` é a convenção). Estes argumentos permitem passar informações para o programa ao iniciá-lo pela linha de
      comando, mas para programas simples, não os usamos diretamente. Mesmo assim, a assinatura completa é necessária
      para o método ser reconhecido como o ponto de partida.

```java
System.out.println("Olá, Mundo!");
```

* **`System.out.println("Olá, Mundo!");`:** Esta linha executa uma **ação**: mostra texto na tela (no console).
    * `System`: É uma **Classe pronta** do Java (parte da biblioteca padrão) que dá acesso a funcionalidades do sistema
      operacional, como entrada/saída.
    * `.out`: É um **objeto pronto** (dentro da classe `System`) que representa a **saída padrão** do seu programa (
      geralmente o console/terminal).
    * `.println()`: É um **método** (ação) que o objeto `out` possui. `println` significa "print line" (imprimir linha).
      Ele imprime o que está entre parênteses (`"Olá, Mundo!"`) na saída padrão e, depois, pula para a próxima linha.
    * `"Olá, Mundo!"`: É um literal de **String** (texto). Em Java, textos são colocados entre aspas duplas (`"`).
    * `;`: O ponto e vírgula marca o **fim de uma instrução** (sentença) em Java. A maioria das linhas de código
      executáveis terminam com `;`.

### Como Rodar este Código

Para compilar e executar este arquivo, você precisa ter o [[Setting Up the Environment (JDK)]] instalado.

1. **Compile:** Use o compilador Java (javac). Você precisa informar o caminho completo para o arquivo:

    ```shell
    javac basics/HelloWorld.java
    ```

   Se não houver erros, um arquivo `HelloWorld.class` será criado dentro da pasta basics/. Este é o Bytecode que a JVM
   entende.

2. Use o comando `java`. Você precisa informar o nome COMPLETO da classe, incluindo o pacote, e sem a extensão `.class`:

    ```shell
    java basics.HelloWorld
    ```

**Saída no console**

```
Olá, Mundo!
Meu primeiro programa Java!
```
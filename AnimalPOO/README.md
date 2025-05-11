# AnimaisPOO - Projeto Simples de Demonstração dos Pilares da POO em Java

Este projeto Java é um exemplo simples e didático criado para demonstrar os quatro pilares fundamentais da Programação
Orientada a Objetos (POO): Encapsulamento, Abstração, Herança e Polimorfismo. Ele utiliza o conceito de diferentes tipos
de animais para ilustrar esses conceitos de forma prática.

## O que o projeto demonstra?

O código apresenta uma hierarquia simples de classes (`Animal`, `Cachorro`, `Gato`) e mostra como:

1. **Encapsular** dados (atributos) e comportamentos (métodos) dentro de uma classe.
2. Criar uma **Abstração** geral (`Animal`) que define o comportamento básico.
3. Usar **Herança** para criar classes mais específicas (`Cachorro`, `Gato`) que reúnem as características da classe
   geral.
4. Aplicar **Polimorfismo** para que objetos de diferentes classes respondam ao mesmo "comando" (`fazerSom()`) de
   maneiras distintas.

## Como Obter o Código

O projeto consiste em um único arquivo Java.

1. Copie o código completo fornecido anteriormente (`AnimaisPOO.java`).
2. Salve-o em um arquivo chamado `AnimaisPOO.java` no seu computador.

## Pré-requisitos

Para compilar e executar este código, você precisa ter o **Java Development Kit (JDK)** instalado no seu sistema.

## Como Compilar e Executar

1. Abra um terminal ou prompt de comando.
2. Navegue até a pasta onde você salvou o arquivo `AnimaisPOO.java`.
3. Compile o código usando o compilador Java (`javac`):

   ```bash
   javac AnimaisPOO.java
   ```

   Se não houver erros, um arquivo `AnimaisPOO.class` será criado na mesma pasta.

4. Execute o programa usando a Máquina Virtual Java (`java`):

   ```bash
   java AnimaisPOO
   ```

## Saída Esperada

Ao executar o programa, você verá uma saída no console demonstrando a criação dos objetos, suas ações e, principalmente,
o polimorfismo em ação ao chamar o método `fazerSom()` para diferentes tipos de animais.

```text
--- Demonstrando POO com Animais ---
Rex nasceu!
  ... e sou um cachorro!
Felix nasceu!
  ... e sou um gato!

--- Ações dos objetos individuais ---
Nome do cachorro: Rex
Energia do gato: 100
Rex está comendo...
Energia de Rex agora é: 90
Felix está dormindo...
Energia de Felix agora é: 100
Rex foi buscar o graveto!
(Buscar graveto cansou o Rex)
Rex está comendo...
Energia de Rex agora é: 80
Felix está arranhando os móveis (ops!).
(Arranhar móveis também cansa!)
Felix está comendo...
Energia de Felix agora é: 90

--- Demonstrando POLIMORFISMO (Muitas Formas) ---
Pedindo para cada bicho fazer um som:
Rex late: Au Au!
Felix mia: Miau!

--- Apresentando todos os bichos (Polimorfismo + Herança) ---
Olá, eu sou Rex. Tipo: Cachorro
Olá, eu sou Felix. Tipo: Gato

--- Fim da demonstração ---
Pluto nasceu!
  ... e sou um cachorro!
Pluto late: Au Au!
```

*(A saída pode variar ligeiramente dependendo da versão do Java ou do sistema, mas a lógica principal será a mesma).*

---

## Entendendo o Código e os Pilares

Vamos analisar como cada pilar da POO é aplicado no código:

### 1. Encapsulamento

* As propriedades `nome` e `energia` na classe `Animal` são declaradas como `private`. Isso significa que elas não podem
  ser acessadas ou modificadas diretamente de fora da classe `Animal`.
* Para acessar o nome ou a energia, usamos métodos `public` como `getNome()` e `getEnergia()`.
* Para modificar a energia, usamos métodos `public` como `comer()` e `dormir()`, que internamente chamam um método
  `private` (`diminuirEnergia`) para fazer a alteração controlada. Isso protege os dados internos e garante que eles
  sejam modificados de forma segura.

```java
// Exemplo no código:
private String nome; // Encapsulado
private int energia; // Encapsulado

public String getNome() { // Metodo público para acessar nome
    return this.nome;
}

public void comer() { // Metodo público para modificar energia indiretamente
    System.out.println(this.nome + " está comendo...");
    diminuirEnergia(10); // Chama metodo privado
    // ...
}

private void diminuirEnergia(int quantidade) { // Metodo privado (detalhe interno)
    this.energia -= quantidade;
    // ...
}
```

### 2. Abstração

* A classe `Animal` é declarada com a palavra-chave `abstract`. Isso a torna uma classe abstrata.
* Classes abstratas não podem ser instanciadas diretamente (você não pode fazer `new Animal(...)`). Elas existem apenas
  como um molde ou conceito geral para outras classes.
* A classe `Animal` declara o método `public abstract void fazerSom();`. Sendo abstrato, ele define que *todo* animal
  *deve* ser capaz de fazer som, mas *não* especifica *como* ele faz. A implementação (o "como") é deixada para as
  classes filhas concretas (`Cachorro`, `Gato`). Isso foca no "o que" (fazer som) e esconde o "como".

```java
// Exemplo no código:
abstract class Animal { // Classe abstrata
    // ... outros métodos e atributos ...

    public abstract void fazerSom(); // Metodo abstrato (define o QUE, não o COMO)
}
```

### 3. Herança

* As classes `Cachorro` e `Gato` são declaradas usando `extends Animal`. Isso significa que elas **herdam** todas as
  propriedades (`nome`, `energia`) e comportamentos (`comer()`, `dormir()`, `apresentar()`) que são acessíveis na classe
  `Animal` (ou seja, não são `private`).
* Elas também têm seus próprios atributos (`raca` - *no exemplo do código não foi adicionado um atributo específico, mas
  poderia*) e métodos específicos (`buscarGraveto()`, `arranharMoveis()`) que só fazem sentido para elas.
* A Herança promove a **reutilização de código**. Não precisamos escrever os métodos `comer()` ou `dormir()` novamente
  em `Cachorro` e `Gato`, pois eles já são fornecidos pela classe `Animal` através da herança.

```java
// Exemplo no código:
class Cachorro extends Animal { // Cachorro herda de Animal
    // ... construtor e métodos específicos ...

    // Usa métodos herdados:
    // this.nome (herdado, acessado via getNome())
    // comer() (herdado)
}

class Gato extends Animal { // Gato herda de Animal
    // ... construtor e métodos específicos ...

    // Usa métodos herdados:
    // this.nome (herdado, acessado via getNome())
    // comer() (herdado)
}
```

### 4. Polimorfismo

* Polimorfismo significa "muitas formas". No código, isso é melhor visto com o método `fazerSom()`.
* Na classe `Animal`, `fazerSom()` é uma ideia abstrata.
* Nas classes `Cachorro` e `Gato`, o método `fazerSom()` é **implementado de forma diferente** (`Au Au` vs `Miau`),
  usando a anotação `@Override`.
* A demonstração chave do polimorfismo está no loop que percorre a lista `meusBichos` (`List<Animal>`). Mesmo que a
  lista seja de tipo `Animal` (o tipo geral), o Java consegue identificar o *tipo real* do objeto em cada posição da
  lista (`Cachorro` ou `Gato`) em tempo de execução e chamar a implementação **correta** do método `fazerSom()` para
  aquele objeto específico. O *mesmo comando* (`bicho.fazerSom()`) resulta em *comportamentos diferentes*.
* Outro exemplo é a linha `Animal outroBicho = new Cachorro("Pluto");`. Uma variável do tipo `Animal` pode guardar um
  objeto `Cachorro`. Quando chamamos `outroBicho.fazerSom()`, o Polimorfismo garante que o método `fazerSom()` do
  `Cachorro` será executado.

```java
// Exemplo no código:
// Implementações diferentes do mesmo metodo:
class Cachorro extends Animal {
    @Override // Metodo fazerSom() implementado para Cachorro
    public void fazerSom() {
        System.out.println(getNome() + " late: Au Au!");
    }
}

class Gato extends Animal {
    @Override // Metodo fazerSom() implementado para Gato
    public void fazerSom() {
        System.out.println(getNome() + " mia: Miau!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Uso polimórfico:
        List<Animal> meusBichos = new ArrayList<>();
        meusBichos.add(meuCachorro); // Adiciona um Cachorro como Animal
        meusBichos.add(meuGato);     // Adiciona um Gato como Animal

        for (
                Animal bicho : meusBichos) {
            bicho.fazerSom(); // CHAMA a implementação CERTA para cada objeto!
        }
    }
}
```

---

Este projeto é uma demonstração para entender como os pilares da POO ajudam a organizar e estrutura o código de forma
mais eficiente e flexível.
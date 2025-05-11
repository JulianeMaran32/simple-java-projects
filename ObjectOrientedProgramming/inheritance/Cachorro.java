package inheritance;

// Classe Filha 1 (herda de Animal)
public class Cachorro extends Animal { // Cachorro É UM TIPO DE Animal
    
    // Cachorro HERDA nome e comer() e fazerSom() de Animal

    // Cachorro adiciona suas próprias coisas:
    String raca; // Propriedade específica de Cachorro

    public void latir() { // Comportamento específico de Cachorro
        System.out.println(this.nome + " latindo: Au Au!");
    }

    // Cachorro pode MUDAR como faz o fazerSom() (isso já conecta com Polimorfismo!)
    @Override // Boa prática para indicar que estamos mudando o método do pai
    public void fazerSom() {
        this.latir(); // No caso do Cachorro, fazer som é latir
    }

}

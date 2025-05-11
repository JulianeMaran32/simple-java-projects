package inheritance;

// Classe Pai (base)
public class Animal {

    String nome; // Propriedade geral

    void comer() { // Comportamento geral
        System.out.println(this.nome + " está comendo...");
    }

    public void fazerSom() { // Comportamento geral (talvez as filhas mudem)
         System.out.println(this.nome + " fazendo algum som...");
    }
    
}

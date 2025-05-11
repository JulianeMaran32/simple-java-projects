package inheritance;

// Classe Filha 2 (herda de Animal)
public class Gato extends Animal { // Gato É UM TIPO DE Animal
    
    // Gato HERDA nome e comer() e fazerSom() de Animal

     // Gato adiciona suas próprias coisas:
     boolean temBigodesLongos; // Propriedade específica de Gato

     public void miar() { // Comportamento específico de Gato
        System.out.println(this.nome + " miando: Miau!");
    }

     // Gato também muda como faz o fazerSom()
     @Override
     public void fazerSom() {
         this.miar(); // No caso do Gato, fazer som é miar
     }

}

// Em outra parte do seu código:
// Cachorro meuDog = new Cachorro();
// meuDog.nome = "Buddy"; // Posso usar 'nome' porque herdei de Animal
// meuDog.raca = "Labrador"; // Posso usar 'raca' porque é meu

// meuDog.comer(); // Posso usar 'comer()' porque herdei de Animal
// meuDog.latir(); // Posso usar 'latir()' porque é meu

// Gato meuCat = new Gato();
// meuCat.nome = "Whiskers";
// meuCat.temBigodesLongos = true;
// meuCat.comer(); // Gato também come!
// meuCat.miar(); // Gato mia!

// Animal bichoQualquer = new Cachorro(); // Uma variável do tipo Animal pode guardar um objeto Cachorro!
// bichoQualquer.comer(); // Funciona!
// bichoQualquer.fazerSom(); // Funciona! E vai latir (porque o objeto REAL é Cachorro)! (<- Polimorfismo de novo!)
// bichoQualquer.latir(); // ISSO NÃO FUNCIONA! A variável é vista como Animal, e Animal não tem latir().
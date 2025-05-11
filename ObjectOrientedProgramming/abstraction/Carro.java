package abstraction;

// Classe Carro: IMPLEMENTA o contrato Controlavel
public class Carro implements Controlavel {

    // PRECISA dizer COMO ligar() e COMO desligar()
    @Override // Indica que estamos implementando um método da Interface/Classe pai
    public void ligar() {
        System.out.println("Carro ligando motor... Vrum!");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligando motor...");
    }
    // Carro também pode ter seus métodos próprios, como acelerar()
    public void acelerar() { System.out.println("Acelerando carro..."); }
    
}

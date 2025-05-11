package abstraction;

// Classe Lampada: TAMBÉM IMPLEMENTA o contrato Controlavel
public class Lampada implements Controlavel {

    // PRECISA dizer COMO ligar() e COMO desligar() (de um jeito diferente!)
    @Override
    public void ligar() {
        System.out.println("Lâmpada acendendo... Brilho!");
    }

    @Override
    public void desligar() {
        System.out.println("Lâmpada apagando...");
    }
    
}

// Em outra parte do seu código:
// Controlavel item1 = new Carro(); // Veja! A variável é Controlavel, mas o objeto é um Carro
// Controlavel item2 = new Lampada(); // A variável é Controlavel, mas o objeto é uma Lampada

// item1.ligar(); // Chama o ligar() do Carro
// item2.ligar(); // Chama o ligar() da Lampada

// item1.acelerar(); // ISSO NÃO FUNCIONA se a variável for Controlavel!
                  // Controlavel não tem a IDEIA (o método) de acelerar.
                  // Para acelerar, você precisaria garantir que é um Carro:
                  // if (item1 instanceof Carro) { ((Carro) item1).acelerar(); }
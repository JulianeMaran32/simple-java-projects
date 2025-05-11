package encapsulation;

public class Carro { // Nosso molde/caixa

    // Propriedades (atributos) - tornamos elas privadas para PROTEGÊ-LAS
    private String cor; // Só os métodos DENTRO de Carro podem mexer nisso
    private int velocidadeAtual; // Só os métodos DENTRO de Carro podem mexer nisso

    // Comportamentos (métodos) - tornamos eles públicos para poder usá-los
    public void acelerar(int incremento) {
        // Este método PODE mexer em velocidadeAtual porque está DENTRO da classe
        this.velocidadeAtual += incremento;
        System.out.println("Acelerando! Velocidade atual: " + this.velocidadeAtual);
    }

    public int getVelocidadeAtual() {
         // Este método PODE acessar velocidadeAtual e devolve o valor
        return this.velocidadeAtual;
    }

    // Método para definir a cor - controlamos COMO a cor é definida
    public void setCor(String novaCor) {
        // Poderíamos adicionar uma regra aqui, tipo: if (novaCor.equals("rosa choque")) 
        // { System.out.println("Cor não permitida!"); return; }
        this.cor = novaCor;
    }

    public String getCor() {
        return this.cor;
    }
    
}

// Em outra parte do seu código (onde você usa o objeto Carro):
// Carro meuCarro = new Carro();
// meuCarro.acelerar(20); // Funciona! Você está usando o "botão público"
// int velocidade = meuCarro.getVelocidadeAtual(); // Funciona! Você está perguntando pelo valor público
// meuCarro.cor = "azul"; // ISSO NÃO FUNCIONA se a cor for 'private'! (Java impede)
// meuCarro.velocidadeAtual = 500; // ISSO NÃO FUNCIONA se a velocidadeAtual for 'private'! (Java impede)
// meuCarro.setCor("azul"); // Funciona! Você está usando o método público para mudar a cor
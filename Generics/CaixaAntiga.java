// --- Versão Antiga (Sem Generics) ---
// Esta caixa pode guardar QUALQUER coisa (um Object)
public class CaixaAntiga {

    private Object item; // Pode ser String, Integer, Carro, qualquer coisa...

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return this.item; // Você recebe um Object e tem que ADIVINHAR o que é
    }

}

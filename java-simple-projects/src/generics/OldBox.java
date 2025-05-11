package generics;

// --- Versão Antiga (Sem Generics) ---
// Esta caixa pode guardar QUALQUER coisa (um Object)
// Problema: Não há garantia de tipo em tempo de COMPILAÇÃO.
public class OldBox {

    private Object item; // Pode guardar String, Integer, Carro, qualquer coisa...

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return this.item; // Você recebe um Object. O Java NÃO sabe o tipo real aqui.
    }

}

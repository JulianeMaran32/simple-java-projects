package generics;

// --- Versão Moderna (Com Generics) ---
// Esta caixa é uma "Caixa de T".
// 'T' é um PLACEHOLDER (como uma variável de tipo) para um tipo que será definido depois.
// Benefício: Garante segurança de tipo em tempo de COMPILAÇÃO.
// Benefício: Elimina a necessidade de Casting na hora de pegar o item.
public class Box<T> {

    private T item;

    // O metodo getItem AGORA DEVOLVE um item do tipo 'T'. Java já sabe o tipo!
    public T getItem() {
        return item;
    }

    // O metodo setItem agora aceita APENAS itens do tipo 'T'
    public void setItem(T item) {
        this.item = item;
    }

}

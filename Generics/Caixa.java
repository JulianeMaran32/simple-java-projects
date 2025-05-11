// --- Versão Moderna (Com Generics) ---
// Esta caixa é uma "Caixa de T".
// 'T' é um PLACEHOLDER (como uma variável) para um tipo.
// Quando você USAR esta classe, você vai dizer qual é o tipo do 'T'.
public class Caixa<T> {

    private T item; // Agora o item tem o tipo 'T' que você especificar depois!

    // O metodo setItem agora aceita APENAS itens do tipo 'T'
    public void setItem(T item) {
        this.item = item;
    }

    // O metodo getItem AGORA DEVOLVE um item do tipo 'T'. Java já sabe o tipo!
    public T getItem() {
        return this.item;
    }

}

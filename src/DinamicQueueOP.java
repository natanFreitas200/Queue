import java.util.NoSuchElementException;

public class DinamicQueueOP<T> {
    private Node<T> first;
    private Node<T> last;
    private int cont;

    public DinamicQueueOP() {
        first = null;
        last = null;
        cont = 0;
    }
    public T front() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return (T) first.data;
    }
    public void enQueue(T elem, int priority){
        Node<T> novo = new Node<>(elem, priority);
        if (first == null){
            first = novo;
            last = novo;
        } else if (novo.priority < (first.priority) ) {
            novo.next = first;
            first = novo;
        } else if (novo.priority >= (last.priority)) {
            last.next = novo;
            last = novo;
        } else {
            Node<T> aux = first;
            Node<T> before = null;
            while (aux != null){
                if (aux.priority <= (novo.priority)){
                    before = aux;
                }
                aux = aux.next;
            }
            novo.next = before.next;
            before.next = novo;
        }
        cont++;
    }

    public T get(int i) {
        if (i < 0 || i >= cont) {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista");
        }

        Node<T> aux = first;
        for (int j = 0; j < i; j++) {
            aux = aux.next;
        }

        return aux.data;

    }


    public T deQueue(){
        if (isEmpty()) {
            throw new NoSuchElementException("A pilha está vazia");
        }
        else {
            Node<T> aux = first;
            first = first.next;
            cont--;
            return (T)aux.data;
        }

    }

    public void clear(){
        cont = 0;
        first = null;
        last = null;
    }
    public boolean isEmpty(){
        if (cont <= 0){
            return true;
        }
        return false;
    }
    public int indexOf(T element){
        Node<T> aux = first;
        for (int i = 0; i < cont; i++){
            if (aux.data.equals(element)){
                return i;
            }
            aux = aux.next;
        }
        return -1;
    }
    public int size(){
        return cont;
    }
    public boolean contains(T elemento){
        Node<T> aux = first;
        for (int i = 0; i < cont; i++){
            if (aux.data.equals(elemento)){
                return true;
            }
            aux = aux.next;
        }
        return false;
    }


    @Override
    public String toString() {
        Node<T> aux = first;
        StringBuilder str = new StringBuilder();
        while (aux != null){
            str.append(aux.data).append(" ");
            aux = aux.next;
        }
        return str.toString().trim();
    }
}

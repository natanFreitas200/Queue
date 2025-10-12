import java.util.NoSuchElementException;

public class DinamicQueue<T> {
    private int cont;
    private No<T> first;
    private No<T> last;
    public void enQueue(T elemento){
        No<T> novo = new No<>(elemento);
        if (first == null){
            first = novo;
            last = novo;
        }
        else {
            last.next = novo;
            last = novo;
        }
        cont++;
    }
    public DinamicQueue(){
        first = null;
        last = null;
        cont = 0;
    }
    public T front() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return (T) first.data;
    }
    public boolean isEmpty(){
        if (cont <= 0){
            return true;
        }
        return false;
    }
  
    public void clear(){
        cont = 0;
        first = null;
        last = null;
    }
    public T deQueue(){
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia");
        }
        else {
            No<T> aux = first;
            first = aux.next;

            if (first == null) {
                last = null;
            }
            cont--;
            return (T)aux.data;
        }

    }

    public int search(T element){
        No<T> aux = first;
        for (int i = 0; i < cont; i++){
            if (aux.data.equals(element)){
                return cont - i;
            }
            aux = aux.next;
        }
        return -1;
    }
    public int indexOf(T element){
        No<T> aux = first;
        for (int i = 0; i < cont; i++){
            if (aux.data.equals(element)){
                return  i;
            }
            aux = aux.next;
        }
        return -1;
    }
    public boolean contains(T element){
        No<T> aux = first;
        for (int i = 0; i < cont; i++){
            if (aux.data.equals(element)){
                return true;
            }
            aux = aux.next;
        }
        return false;
    }


    public int size(){
        return cont;
    }

    @Override
    public String toString() {
        No<T> aux = first;
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(aux != null) {
            str.append(aux.data);
            if(i < cont - 1) {
                str.append(", ");
            }
            aux = aux.next;
            i++;
        }
        return str.toString().trim();
    }
}

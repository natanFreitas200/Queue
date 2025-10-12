import java.util.NoSuchElementException;

public class StaticQueue<T> {
    private int cont;
    private int ini;
    private Object[] v;
    private int end;
    private int capacidade;
    public StaticQueue() {
        this.capacidade = 10;
        v = new Object[capacidade];
        ini = 0;
        end = -1;
        cont = -1;
    }
    public StaticQueue(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero.");
        }
        this.capacidade = capacidade;
        v = new Object[capacidade];

    }
    public void enQueue(T elemento) {
        end++;
        cont++;
        if (end == v.length) {
            if(ini == 0) {
                Object[] V = new Object[v.length + 15];
                for (int i = ini; i < end; i++) {
                    V[i] = v[i];
                }
                v = V;

                v[end] = elemento;
            } else {
                end = 0;
            }
        } else if(ini > 0 && end == ini) {
            Object[] V = new Object[v.length + 15];
            for (int i = 0; i < v.length - ini; i++){
                V[i] = v[ini + i];
            }
            for(int j = 0; j < end; j++) {
                V[v.length - ini + j] = v[j];
            }
            ini = 0;
            end = v.length;
            V[end] = elemento;
            v = V;
        }
        v[end] = elemento;


    }


    public T front(){
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia.");
        }
        return (T) v[ini];
    }
    public void clear() {
        end = -1;
        ini = 0;
        v = new Object[this.capacidade];
    }
    public T deQueue(){
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        cont--;
        ini++;
        return (T) v[ini - 1];
    }
    public int size(){
        return cont;
    }
    public boolean isEmpty(){
        if (size() == 0){
            return true;
        }
        return false;
    }
    public int indexOf(T ob) {
       if (isEmpty()){
           return -1;
       }
        for(int i = 0; i < size(); i++) {
            int index = (ini + i) % v.length;
            if (v[index].equals(ob)) {
                return i;
            }
        }
        return -1;
    }

    @Override

    public String toString() {
        StringBuilder str = new StringBuilder();

        if (end >= ini) {
            for (int i = ini; i <= end; i++) {
                str.append(v[i]).append(" ");
            }
        } else if (size() == 0){
            return "";
        }
        else {
            for (int i = ini; i < v.length; i++) {
                str.append(v[i]).append(" ");
            }
            for (int i = 0; i <= end; i++) {
                str.append(v[i]).append(" ");
            }


        }

        return str.toString();
    }

}

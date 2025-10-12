class StaticQueue2<T> {
    private Object[] v;
    private int ini = 0;
    private int end = -1;
    private int capacidade;


    public StaticQueue2() {
        this(10);
        end = -1;
         ini = 0;
    }

    public StaticQueue2(int capacidade) {
        this.capacidade = capacidade;
        v =  new Object[capacidade];
    }



    public void clear() {
        v =  new Object[capacidade];
        ini = 0;
        end = -1;
    }

    public void enQueue(T elemento) {
        if (size() == capacidade - 1) {
            int Capacidade = capacidade * 2;
            Object[] V =  new Object[Capacidade];
            int cont = size();
            int index = ini;
            for (int i = 0; i < cont; i++) {
                V[i] = v[index];
                index = (index + 1) % capacidade;
            }
            capacidade = Capacidade;
            ini = 0;
            end = cont - 1;
            v = V;
        }
        end = (end + 1) % capacidade;
        v[end] = elemento;
    }

    public T deQueue() {
        T elem = (T) v[ini];
        ini = (ini + 1) % capacidade;
        return elem;
    }

    public T front() {
        return (T) v[ini];
    }

    public boolean isEmpty() {
        return (end + 1) % capacidade == ini;
    }

    public int size() {
        if (end >= ini) {
            return end - ini + 1;
        } else {
            return capacidade - ini + end + 1;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        int count = size();
        int index = ini;

        for (int i = 0; i < count; i++) {
            str.append(v[index]);
            if (i < count - 1) {
                str.append(" ");
            }
            index = (index + 1) % capacidade;
        }


        return str.toString();
    }
}


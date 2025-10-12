public class No<T> {
    protected T data;
    protected No<T> next;

    public No(T data) {
        this.data = data;
        this.next = null;
    }
}
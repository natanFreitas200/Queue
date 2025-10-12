public class Node<T> {
    protected T data;
    protected Node<T> next;
    protected int priority;
    public Node(T data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}

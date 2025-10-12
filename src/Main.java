public class Main {
    public static void main(String[] args) {
        DinamicQueueOP<Integer> q = new DinamicQueueOP<>();
        q.enQueue(100,100); q.enQueue(120,120);
        q.enQueue(30,30); q.enQueue(90,90);
        q.enQueue(25,25);
        System.out.println(q);
        System.out.println(q.indexOf(30));
        q.deQueue(); q.deQueue();
        System.out.println(q);
        System.out.println(q.indexOf(120));
    }
}
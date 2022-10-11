public class Application {
    public static void main(String[] args) {
        Fifo fifo = new Fifo();
        Producer producer1 = new Producer("elso", fifo);
        Producer producer2 = new Producer("masodik", fifo);
        producer1.go();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        producer2.go();
    }
}

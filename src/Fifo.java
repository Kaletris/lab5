import java.util.LinkedList;

public class Fifo {
    LinkedList<String> fifo = new LinkedList<>();

    synchronized void putString(String s) throws InterruptedException {
        while (fifo.size() == 10) {
            wait();
        }

        fifo.add("s");
        notifyAll();
    }

    synchronized String get() throws InterruptedException {
        while (fifo.isEmpty()) {
            wait();
        }

        String s = fifo.getFirst();
        fifo.removeFirst();
        notifyAll();
        return s;
    }
}

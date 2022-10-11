public class Producer extends Thread {
    String text;
    Fifo fifo;

    Producer(String s, Fifo fifo) {
        this.text = s;
        this.fifo = fifo;
    }

    @Override
    public void run() {
        int count = 0;

        try {
            while (true) {
                fifo.putString(text + " " + count);
                System.out.println("produced " + text + " " + count + " " + System.currentTimeMillis() % 100000);
                Thread.sleep(1000);
                count++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        /*
        int count = 0;
        try {
            while (true) {
                System.out.println(text + " " + count +  " " + System.currentTimeMillis() % 100000);
                Thread.sleep(1000);
                count++;
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    */

    void go() {
        this.start();
        /*
        Thread thread = new Thread(() -> {
            int count = 0;
            try {
                while (true) {
                    System.out.println(text + " " + count +  " " + System.currentTimeMillis() % 100000);
                    Thread.sleep(1000);
                    count++;
                }
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        thread.start();
         */
    }
}

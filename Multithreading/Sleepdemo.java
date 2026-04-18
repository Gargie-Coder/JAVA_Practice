public class Sleepdemo implements Runnable {

    public void run() {
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " running " + i);
                Thread.sleep(1000);  // THIS thread sleeps
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Thread th1 = new Thread(new Sleepdemo(), "Thread1");
        Thread th2 = new Thread(new Sleepdemo(), "Thread2");

        th1.start();
        th2.start();
    }
}
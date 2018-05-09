import java.util.Set;

public class ThreadObject extends Thread {

    @Override
    public void run() {
        System.out.println("Saya ditulis melalui sebuah thread");
        System.out.println("Selang 10 Detik");

        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Done");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Nama Thread Main " +Thread.currentThread().getName());
        new ThreadObject().start();
        System.out.println("Selang 5 Detik Untuk Thread Selanjutnya");
        Thread.sleep(5000);
        new ThreadObject().start();
        Set<Thread> getAllThread = Thread.getAllStackTraces().keySet();
        System.out.println("Jumlah Thread Yang Jalan" + getAllThread.size());
    }
}

public class InterruptedThread extends Thread{

    @Override
    public void run() {
        System.out.println("Interrupted Thread Mulai");
        System.out.println("Interrupted Thread : Silahkan Tunggu 10 Detik");
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e) {
            System.out.println("Interrupted Thread Telah Di Interupt");
        }
    }

    /*
    * Interrupt menunjukkan  bahwa sebuah thread harus berhenti melakukan apa yang sedang dikerjakan dan melakukan pekerjaan lainnya
    * */
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Main Thread Jalan");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        System.out.println("Main Thread : Silahkan Tunggu 5 Detik");
        Thread.sleep(5000);
        interruptedThread.interrupt();
        System.out.println("Main Thread Selesai");
    }
}

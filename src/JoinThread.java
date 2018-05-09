public class JoinThread extends Thread {
    @Override
    public void run() {
        System.out.println("JoinThread Start");
        System.out.println("JoinThread : Silahkan Tunggu 5 Detik");
        try {
            Thread.sleep(5000);
            System.out.println("JoinThread Finish");
        }catch (InterruptedException e){
            System.out.println("JoinThread has been Interupted");
        }
    }

    /*
    * Method join() pada objek thread memungkinkan sebuah thread
    * untuk berhenti sementara hingga thread yang ia join telah selesai dieksekusi.*/
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread Start");
        JoinThread joinThread = new JoinThread();
        JoinThread joinThread2 = new JoinThread();
        joinThread.start();
        System.out.println("Main Thread Joining with JoinThread");
        joinThread.join();
        System.out.println("Join Thread 2 Start");
        joinThread2.start();
        System.out.println("Main Thread Joining with JoinThread 2");
        joinThread2.join();
        System.out.println("Main Thread Finish");
    }
}

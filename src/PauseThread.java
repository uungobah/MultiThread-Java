
/*
Sebuah thread dapat diberhentikan sementara.
Salah satu cara yang dapat digunakan adalah
dengan menggunakan method sleep() yang dimiliki oleh objek thread.
Melalui method ini anda dapat memberhentikan sebuah thread selama selang waktu tertentu
*/

public class PauseThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Saya ditulis");
        System.out.println("(Selang 5 detik)");
        Thread.sleep(5000);
        System.out.println("melalui");
        System.out.println("(Selang 5 detik)");
        Thread.sleep(5000);
        System.out.println("sebuah");
        System.out.println("(Selang 5 detik)");
        Thread.sleep(5000);
        System.out.println("thread");
    }
}

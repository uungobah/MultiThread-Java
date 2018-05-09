public class RunnableObject implements Runnable {

    @Override
    public void run() {
        System.out.println("Saya ditulis melalui sebuah thread");
    }

    public static void main(String[] args) {
        new Thread(new RunnableObject()).start();
    }
}

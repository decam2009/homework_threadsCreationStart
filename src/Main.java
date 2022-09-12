public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadMaingroup = new ThreadGroup("main group");
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(threadMaingroup, myThread, "1");
        thread1.start();
        Thread thread2 = new Thread(threadMaingroup, myThread, "2");
        thread2.start();
        Thread thread3 = new Thread(threadMaingroup, myThread, "3");
        thread3.start();
        Thread thread4 = new Thread(threadMaingroup, myThread, "4");
        thread4.start();
        Thread.sleep(15000);
        threadMaingroup.interrupt();
    }
}

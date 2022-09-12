public class MyThread extends Thread implements Runnable{
    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Я поток " + Thread.currentThread().getName() + ". Всем привет!");
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.printf("Поток %s завершен. ", Thread.currentThread().getName());
        }
    }
}

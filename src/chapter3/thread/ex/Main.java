package chapter3.thread.ex;

public class Main {
    public static void main(String[] args) {

        MySingle threadSingle = new MySingle();

        threadSingle.start();
        try {
            threadSingle.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyRunnable task0 = new MyRunnable(1, 250);
        MyRunnable task1 = new MyRunnable(251, 500);
        MyRunnable task2 = new MyRunnable(501, 750);
        MyRunnable task3 = new MyRunnable(751, 1000);

        Thread thread0 = new Thread(task0);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        long mulStartTime = System.currentTimeMillis();
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread0.join();
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long mulEndTime = System.currentTimeMillis();
        System.out.println("종료 시간: " + (mulEndTime - mulStartTime));
    }
}
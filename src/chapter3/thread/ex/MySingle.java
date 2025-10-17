package chapter3.thread.ex;

public class MySingle extends Thread {

    @Override
    public void run() {

        long startTime = System.currentTimeMillis();

        String threadName = Thread.currentThread().getName();
        System.out.println("현재 시작된 쓰레드: " + threadName);

        long sum = 0;
        for (int i = 0; i<= 1000; i++) {
            sum += i;
            try {
                Thread.sleep(10); //0.01 초마다 계산
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("종료된 쓰레드: " + threadName);
        System.out.println("종료 시간 = " + (endTime - startTime));
    }
}
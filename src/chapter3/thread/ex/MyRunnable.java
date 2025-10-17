package chapter3.thread.ex;

public class MyRunnable implements Runnable {

    private int start;
    private int end;

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("현재 시작된 쓰레드: " + threadName);

        long sum = 0;
        for (int i = start; i<= end; i++) {
            sum += i;
            try {
                Thread.sleep(10); //0.01 초마다 계산
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("종료된 쓰레드: " + threadName);
    }

    public MyRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }
}



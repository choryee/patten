package ex13_ChatGPT.CollectionPractice.Others;

public class SimpleThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new NumberPrinterThread("Thread-1");
        Thread thread2 = new NumberPrinterThread("Thread-2");

        thread1.start();
        thread2.start();
    }
}

class NumberPrinterThread extends Thread {
    private final String threadName;

    public NumberPrinterThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(1000); // 1초간 스레드를 일시 정지시킴
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

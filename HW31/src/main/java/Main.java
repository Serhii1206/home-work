import lock.LockExample;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static LockExample lockExample = new LockExample();

    public static void main(String[] args) throws InterruptedException {


        Thread thread1 = new Thread(Main::run);
        Thread.sleep(2000);
        thread1.start();
        thread1.join();

        Thread thread2 = new Thread(Main::run2);
        Thread.sleep(2000);
        thread2.start();
        thread2.join();
    }

    private static void run() {
        for (int i = 0; i < 10000; i++) {
            Thread.currentThread().setName(" FirstThread");
            Decrement.decrement(Thread.currentThread());
        }
    }

    private static void run2() {
        for (int i = 0; i < 10000; i++) {
            Thread.currentThread().setName(" SecondThread");
            Decrement.decrement(Thread.currentThread());
        }
        getLockMethod();
    }


    public static void getLockMethod() {
        lockExample.firstLock();
        lockExample.secondLock();
        lockExample.thirdLock();

    }
}

class Decrement {
    private static AtomicInteger atomicInteger = new AtomicInteger();

    public synchronized static void decrement(Thread thread) {
        atomicInteger.decrementAndGet();
        System.out.println(atomicInteger + thread.getName());
    }
}
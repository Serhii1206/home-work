package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
     Lock myLock = new ReentrantLock();

    public void firstLock() {
        myLock.lock();
        System.out.println("MyFirstlock: " + Thread.currentThread().getName());
    }

    public void secondLock() {
        System.out.println("MySecondLock: " + Thread.currentThread().getName());
    }

    public void thirdLock() {
        System.out.println("MyThirdLock: " + Thread.currentThread().getName());
        myLock.unlock();
    }
}

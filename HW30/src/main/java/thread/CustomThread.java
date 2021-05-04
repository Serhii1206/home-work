package thread;

import util.ThreadServiceClass;

public class CustomThread extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setName("Thread");
        for (int i = 0; i < 1000; i++) {
            ThreadServiceClass.getThreadName(Thread.currentThread());
        }
    }
}

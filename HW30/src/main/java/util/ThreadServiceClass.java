package util;

public class ThreadServiceClass {
    private static int count = 0;

    public synchronized static void getThreadName(Thread thread) {
        synchronized (ThreadServiceClass.class) {
            System.out.println("Thread: " + thread.getName() + " Count: " + count++);
       }
    }
}

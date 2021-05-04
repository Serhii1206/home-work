package thread;

import util.ThreadServiceClass;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        String callable = "CustomCallable";
        Thread.currentThread().setName("Callable");
        for (int i = 0; i < 1000; i++) {
            ThreadServiceClass.getThreadName(Thread.currentThread());
        }
        return callable;
    }
}

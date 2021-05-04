import deadlock.FirstClass;
import deadlock.SecondClass;
import thread.CustomCallable;
import thread.CustomRunnable;
import thread.CustomThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        CustomThread thread = new CustomThread();
        thread.start();
        thread.join();

        CustomRunnable runnable = new CustomRunnable();
        Thread threadRunnable = new Thread(runnable);
        threadRunnable.start();
        threadRunnable.join();

        CustomCallable callable = new CustomCallable();
        FutureTask<String> task = new FutureTask<>(callable);
        Thread callableThread = new Thread(task);
        callableThread.start();
        callableThread.join();

         //5.1 =  2471-2998
         //5.2 =  2190-2999
         //5.3 =  2999-2999

        FirstClass firstClass = new FirstClass();
        SecondClass secondClass = new SecondClass();

        firstClass.setSecondClass(secondClass);
        secondClass.setFirstClass(firstClass);

        Thread thread1 = new Thread(() -> System.out.println(firstClass.getStringFromSecondClass()));
        Thread thread2 = new Thread(() -> System.out.println(secondClass.getStringFromFirstClass()));

        thread1.start();
        thread2.start();
    }
}

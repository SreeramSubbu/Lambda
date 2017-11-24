package lambda.resources;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author ramudu
 */
public class Locking {

    static Lock lock = new ReentrantLock();

    private static void runLocked(Lock lock, Runnable runnable) {
        lock.lock();
        try {
            runnable.run();
        } finally {
            lock.unlock();
        }
    }

    public static void sampleFunction() {
        runLocked(lock, () -> System.out.println("Hello World"));
    }
}

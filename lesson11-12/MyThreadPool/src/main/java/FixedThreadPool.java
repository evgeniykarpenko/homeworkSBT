import java.util.LinkedList;
import java.util.Queue;

public class FixedThreadPool implements ThreadPool {
    private final int threadCount;
    private final WorkPool[] myThreads;
    private final Queue<Runnable> queue;

    public FixedThreadPool(int threadCount) {
        this.threadCount = threadCount;
        this.myThreads = new WorkPool[threadCount];
        this.queue = new LinkedList<>();
    }

    @Override
    public void start() {
        for (int i = 0; i < threadCount; i++) {
            myThreads[i] = new WorkPool();
            myThreads[i].start();
            System.out.println(myThreads[i].getName() + " was started ");
        }
    }

    @Override
    public void execute(Runnable runnable) {
        synchronized (queue) {
            queue.add(runnable);
            queue.notify();
        }
    }

    class WorkPool extends Thread {
        @Override
        public void run() {
            Runnable r;
            while (true) {
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        try {
                            System.out.println(this.getName() + " waiting!");
                            queue.wait();
                        } catch (InterruptedException e) {
                        }
                    }
                    r = queue.remove();
                }
                r.run();
            }
        }
    }
}

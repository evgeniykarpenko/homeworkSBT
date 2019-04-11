import java.util.concurrent.Callable;

public class Task<T> {
    private final Callable<? extends T> callable;
    private volatile T result;
    private volatile MyException ex;

    public Task(Callable<? extends T> callable) {
        this.callable = callable;
    }

    public T get() {
        if (ex != null)
            throw ex;

        if (result != null) {
            System.out.println("return value from cache");
            return result;
        }
        synchronized (this) {
            try {
                System.out.println("result");
                result = callable.call();
                int i = 1/0;
            } catch (Exception e) {
                ex = new MyException(e);
                throw ex;
            }
        }
        return result;
    }
}

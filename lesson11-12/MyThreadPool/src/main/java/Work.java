public class Work implements Runnable {
    private final int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("start: " + id + "( "+Thread.currentThread().getName()+" )" );
        double sum;
        for (int i = 0; i < 1000000; i++) {
          //sum = Math.sqrt(i)*i;
        }
        System.out.println("finish: " + id + "( "+Thread.currentThread().getName()+" )" );
    }
}

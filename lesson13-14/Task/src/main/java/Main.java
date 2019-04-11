public class Main {
    public static void main(String[] args) {
        Task<String> task = new Task<>(
                ()->"My test"+"task"
        );

        Runnable runnable = ()->{
            try{
                task.get();
            }catch (MyException e){
                System.out.println("Exception: "+e.getMessage());
            }
        };

        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }
    }
}

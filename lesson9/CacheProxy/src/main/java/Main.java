import java.io.File;

public class Main {
    public static void main(String[] args) {
        CacheProxy cacheProxy = new CacheProxy("C://Proxy//1.ser",CacheType.IN_MEMORY);

        IService service = cacheProxy.cache(new Service());

        System.out.println("result:  "+ service.doHardWork("work numb 1", 1));
        System.out.println("result:  "+ service.doHardWork("work numb 2", 2));
        System.out.println("result:  "+ service.doHardWork("work numb 3", 3));
        System.out.println("result:  "+ service.doHardWork("work numb 4", 4));


        System.out.println("result:  "+ service.run("work numb 1"));
        System.out.println("result:  "+ service.run("work numb 2"));
        System.out.println("result:  "+ service.run("work numb 3"));
        System.out.println("result:  "+ service.run("work numb 4"));
    }
}

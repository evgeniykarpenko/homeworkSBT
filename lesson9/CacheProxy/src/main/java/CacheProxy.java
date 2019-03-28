import java.lang.reflect.Proxy;

public class CacheProxy {
    private String cacheType;
    private  CacheType defaultCacheType;

    public CacheProxy(String cacheType, CacheType defaultCacheType) {
        this.cacheType = cacheType;
        this.defaultCacheType = defaultCacheType;
    }

    public IService cache(Service service){
        return (IService) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{IService.class},new ProxyHelper(service,cacheType,defaultCacheType));
    }
}

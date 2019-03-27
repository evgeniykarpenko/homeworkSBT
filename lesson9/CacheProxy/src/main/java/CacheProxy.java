public class CacheProxy {
    private String cacheType;
    private  CacheType defaultCacheType;

    public CacheProxy(String cacheType, CacheType defaultCacheType) {
        this.cacheType = cacheType;
        this.defaultCacheType = defaultCacheType;
    }
}

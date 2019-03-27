import java.util.Date;
import java.util.List;

public interface IService {
    @Cache(cacheType  = CacheType.IN_MEMORY, identityBy ={String.class, int.class})
    double doHardWork(final String work, final int value);

    @Cache (cacheType = CacheType.FILE, fileNamePrefix = "data", zip = true, identityBy = {String.class, double.class})
    List<Double> run(final String item);

}

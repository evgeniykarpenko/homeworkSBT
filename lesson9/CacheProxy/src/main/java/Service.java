import java.util.ArrayList;
import java.util.List;

public class Service implements IService {


    public double doHardWork(String work, int value) {
        return work.length() * 1.01;
    }

    public List<Double> run(String item) {
        List<Double> list = new ArrayList<>();
        list.add(item.length()*1.01);
        list.add(item.length()*1.02);
        list.add(item.length()*1.03);
        return null;
    }
}

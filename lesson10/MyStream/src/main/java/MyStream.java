
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStream<T> {
    private List<T> collection;

    public int size() {
        return collection.size();
    }

    public MyStream(List<T> collection) {
        this.collection = new ArrayList<T>(collection);
    }

    public static <V> MyStream<V> of(List<V> list) {
        return new MyStream<V>(list);
    }

    public MyStream<T> filter(Predicate<? super T> predicate) {
        for (int i = 0; i < this.collection.size(); i++)
            if (!predicate.test(this.collection.get(i)))
                this.collection.remove(i);
        return this;
    }

    public <U> MyStream<U> transform(Function<? super T, ? extends U> mapper) {
        List<U> newList = new ArrayList<>();
        for (T t :
                collection) {
            newList.add(mapper.apply(t));
        }
        return new MyStream<>(newList);
    }

    public <K, V> Map<K, V> toMap(Function<? super T, ? extends K> mapKey, Function<? super T, ? extends V> mapValue) {
        Map<K, V> myMap = new HashMap<>();
        for (T t :
                collection) {
            myMap.put(mapKey.apply(t), mapValue.apply(t));
        }
        return myMap;
    }
}

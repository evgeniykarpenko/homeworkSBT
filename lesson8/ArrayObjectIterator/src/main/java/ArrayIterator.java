import java.util.Iterator;

public class ArrayIterator<T> implements Iterable<T> {
    final private T[] array;
    final private int size;

    public ArrayIterator(int size) {
        this.array = (T[]) (new Object[size]);
        this.size = size;
    }

    public void put(int index,T object){
        if(index<0||index > this.size)
            throw new IndexOutOfBoundsException("wrong bounds!!!");
        this.array[index] = object;
    }

    public T get(int index)
    {
        if(index<0||index > this.size)
            throw new IndexOutOfBoundsException("wrong bounds!!!");
        return this.array[index];
    }

    public int length()
    {
        return this.size;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int i = 0;

            public boolean hasNext() {
                if (i < size) return true;
                return false;
            }

            public void remove() {
                throw new UnsupportedOperationException("no remove for arrays");
            }

            public T next() {
                return array[i++];
            }
        };
    }
}

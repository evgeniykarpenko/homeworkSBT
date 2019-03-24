import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayIterator<String> arrayIterator = new ArrayIterator<>(10);

        for (int i = 0; i < arrayIterator.length(); i++) {
            arrayIterator.put(i, "Str: " + i);
        }
        for (String s : arrayIterator) {
            System.out.println(s);
        }
        ArrayIterator<Integer> arrayIteratorInt = new ArrayIterator<>(10);
        for (int i = 0; i < arrayIteratorInt.length(); i++) {
            arrayIteratorInt.put(i, i);
        }
        for (Integer s : arrayIteratorInt) {
            System.out.println(s);
        }
    }
}

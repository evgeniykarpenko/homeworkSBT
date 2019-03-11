import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class HomeWork4 {
    public static void main(String[] args) {
        MyLinkedList<Number> list = new MyLinkedList<>();
        //add(E e) work:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("size: " + list.size());
        //add(E e, int index) work:
        list.add(111,3);
        System.out.println("size: " + list.size());
        list.add(5);
        list.add(2222,4);
        System.out.println("index: " + list.get(4));
        //E get(int index) work:
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(" foreach: ");
        for (Number l:list
                ) {
            System.out.println(l);
        }
        // E remove(int index) work:
        System.out.println(" after delete: ");
        list.remove(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(" foreach: ");
        for (Number l:list
             ) {
            System.out.println(l);
        }
        // boolean addAll(Collection collection) work:
        System.out.println(" add to MyList: ");
        List<Integer> testList = new ArrayList<>();
        testList.add(96);
        testList.add(97);
        testList.add(98);
        testList.add(99);
        testList.add(100);
        testList.add(101);
        list.addAll(testList);
        for (Number l:list
                ) {
            System.out.println(l);
        }
        // boolean copy(Collection collection) work:
        System.out.println(" copy from myList: ");
        List<Number> testList2 = new LinkedList<>();
        System.out.println(" size before: ");
        System.out.println(testList2.size());
        list.copy(testList2);
        System.out.println(" size afer and list: ");
        System.out.println("size: " + testList2.size());
        for (Number n:testList2
             ) {
            System.out.println(n);
        }
    }
}

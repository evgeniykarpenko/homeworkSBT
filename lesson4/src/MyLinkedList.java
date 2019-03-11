import java.util.Collection;
import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E> {
    private Node header = new Node<>(null, null, null);
    private int N = 0;

    public MyLinkedList() {
        header.next = header.prev = header;
    }
    public int size(){
        return (N);
    }

    public void add(E data){
        if(data==null) throw  new NullPointerException(" argument != 0 !!!");
        Node<E> newNode = new Node<>(data,null,header.prev);
        newNode.prev.next=newNode;
        header.prev=newNode;
        N++;
    }

    public void add(E data, int index){
        if(index<0||index>=N) throw new IndexOutOfBoundsException(" wrong index !!!!");
      if(index==N){add(data); return;        }
        Node<E> start = header;
        if(index<(N>>2))
        {
            for (int i = 0; i <=index; i++) {
                start=start.next;
            }
        }
        else {
            for (int i = N; i > index; i--) {
                start=start.prev;
            }
        }
        Node<E> nextNode = start;
        Node<E> newNode = new Node<>(data, nextNode, nextNode.prev);

        nextNode.prev = newNode;
        newNode.prev.next = newNode;
        N++;
    }

    public E get(int index){
        if(index<0||index>=N) throw new IndexOutOfBoundsException(" wrong index !!!!");
        Node<E> start = header;
        if(index<(N/2))
        {
            for (int i = 0; i <=index; i++) {
                start=start.next;

            }
        }
        else {
            for (int i = N; i > index; i--) {
                start=start.prev;
            }
        }
        return start.data;

    }
    public E remove(int index){
        if(index<0||index>=N) throw new IndexOutOfBoundsException(" wrong index !!!!");
        Node<E> start = header;
        if(index<(N>>1))
        {
            for (int i = 0; i <=index; i++) {
                start=start.next;

            }
        }
        else {
            for (int i = N; i > index; i--) {
                start=start.prev;
            }
        }
        Node<E> removable = start;
        if(removable.next != null){
            removable.prev.next = removable.next;
            removable.next.prev = removable.prev;
        }
        else{
            removable.prev.next = null;
            header.prev=removable.prev;
        }
        removable.next=null;
        removable.prev = null;
        N--;
        return removable.data;
    }

    public  boolean addAll(Collection<? extends E> collection){
        if(collection.size()<=0) return false;
        for(E e: collection){
            this.add(e);
        }
        return true;
    }

    public  boolean copy(Collection<? super E> collection){
        if(this.size()==0) return false;
        for(E e: this){
            collection.add(e);
        }
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> e = header;

            @Override
            public boolean hasNext() {
                return e.next != null;
            }

            @Override
            public E next() {
                e = e.next;
                return e.data;
            }
        };
    }

    private static class Node<E> {
        private E data;
        Node<E> next;
        Node<E> prev;

        public Node(E data, Node<E> next, Node<E> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}

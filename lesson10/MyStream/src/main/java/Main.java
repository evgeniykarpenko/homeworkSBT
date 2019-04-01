import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Anna", 30, false));
        list.add(new Person("Anton", 33, true));
        list.add(new Person("Boris", 15, true));
        list.add(new Person("Marina", 4, false));
        list.add(new Person("Tolik", 4, true));


        Map<String,Person> map = MyStream.of(list)
                .filter(p->p.getAge()>25)
                .transform(p->new Person(p.getName(),p.getAge()+50,p.isGender()))
                .toMap(Person::getName,p->p);

        for (String s :
                map.keySet()) {
            System.out.println("Key: " + s);
            System.out.println(map.get(s));
        }
    }
}

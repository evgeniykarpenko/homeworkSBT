public class User {

    private static int idCount;

    private final int id;
    private String name;
    private int age;
    private boolean gender;

    public User() {
        this.id = idCount++;
    }

    public User(String name, int age, boolean gender) {
        this();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public String getName() {
        return name;
    }

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person) {
        if (person == null || this.man == person.man || this.spouse == person) {
            return false;
        } else {
            if (spouse != null) {
                divorce();
            }
            this.spouse = person;
            person.spouse = this;
            person.marry(this);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Person name: " + name + (" is a " + (man ? "man, " : "woman, ") + (spouse == null ? "not married" : "married to " + spouse.getName()));
    }

    public boolean divorce() {
        if (spouse == null) {
            return false;
        } else {
            Person exSpouse = spouse;
            spouse = null;
            exSpouse.divorce();
            return true;
        }
    }

    public static void main(String[] args) {
        Person Anton = new Person(true, "Anton");
        Person Anna = new Person(false, "Anna");
        System.out.println(Anna);   //Anna is a woman, not married
        System.out.println(Anton);  //Anton is a man, not married
        Anna.marry(Anton);          //true
        System.out.println(Anna);   //Person name: Anna is a woman, married to Anton
        System.out.println(Anton);  //Person name: Anton is a man, married to Anna
        Person Boris = new Person(true, "Boris");
        System.out.println(Boris);  //Person name: Boris is a man, not married
        Anna.divorce();             //true
        System.out.println(Anna);   //Person name: Anna is a woman, not married
        System.out.println(Anton);  //Person name: Anton is a man, not married
        System.out.println(Boris);  //Person name: Boris is a man, not married
        Boris.marry(Anton);          //false (gender equals)
        Boris.marry(Anna);          //true
        System.out.println(Anna);   //Person name: Anna is a woman, married to Boris
        System.out.println(Anton);  //Person name: Anton is a man, not married
        System.out.println(Boris);  //Person name: Boris is a man, married to Anna
        Anton.marry(Anna);          //true
        System.out.println(Anna);   //Person name: Anna is a woman, married to Anton
        System.out.println(Anton);  //Person name: Anton is a man, married to Anna
        System.out.println(Boris);  //Person name: Boris is a man, not married
        Anton.marry(Anna);          //false (both already married)
        Person Marina = new Person(false, "Marina");
        Boris.marry(Marina);        //true
        System.out.println(Boris);  //Person name: Boris is a man, married to Marina
        System.out.println(Marina); //Person name: Marina is a woman, married to Boris
        Anton.marry(Marina);        //true
        Anna.marry(Boris);          //true
    }
}

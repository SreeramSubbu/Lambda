package lambda.comparator;

/**
 *
 * @author ramudu
 */
public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int ageDifference(Person p2) {
        return age - p2.age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", name, age);
    }
}

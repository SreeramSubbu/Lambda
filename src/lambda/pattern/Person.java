package lambda.pattern;

import java.util.function.Consumer;

/**
 *
 * @author ramudu
 */
public class Person {

    private int age;
    private String name;
    private String address;

    public Person age(final int age) {
        this.age = age;
        return this;
    }

    public Person name(final String name) {
        this.name = name;
        return this;
    }

    public Person address(final String address) {
        this.address = address;
        return this;
    }

    public static Person build(Consumer<Person> builder) {
        Person person = new Person();
        builder.accept(person);
        return person;
    }
}

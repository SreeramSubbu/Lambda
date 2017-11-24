package lambda.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author ramudu
 */
public class PersonComparator {

    private final List<Person> persons;

    public PersonComparator(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersonsInAscendingOrder() {
        return this.persons
                .stream()
                .sorted(Person::ageDifference)
                .collect(Collectors.toList());
    }

    public List<Person> getPersonsInDescendingOrder() {
        return this.persons
                .stream()
                .sorted((person1, person2) -> person2.ageDifference(person1))
                .collect(Collectors.toList());
    }

    public void printYoungest() {
        this.persons
                .stream()
                .min(Person::ageDifference)
                .ifPresent(youngest -> System.out.println("Youngest" + youngest));
    }

    public void printEldest() {
        Comparator<Person> comparator = (person1, person2) -> person1.ageDifference(person2);
        Comparator<Person> reverseComparator = comparator.reversed();
        this.persons
                .stream()
                .min(reverseComparator)
                .ifPresent(eldest -> System.out.println("Eldest" + eldest));
    }

    private Function<Person, String> byName = person -> person.getName();
    private final Function<Person, Integer> byAge = person -> person.getAge();

    public List<Person> getPersonsSortedByAgeAndThenByName() {
        return this.persons
                .stream()
                .sorted(Comparator.comparing(byAge).thenComparing(byName))
                .collect(Collectors.toList());

    }

    public List<Person> getPersonsOlderthan(int minAge) {

        return this.persons
                .stream().filter(person -> person.getAge() > minAge)
                .collect(Collectors.toList());
    }

    public Map<Integer, List<Person>> getPersonsGroupedByAge() {

        return this.persons
                .stream()
                .collect(Collectors.groupingBy(byAge));
    }

    public Map<Integer, List<String>> getPersonsNameGroupedByAge() {

        return this.persons
                .stream()
                .collect(Collectors.groupingBy(byAge, Collectors.mapping(byName, Collectors.toList())));
    }

    public Map<Character, Optional<Person>> getOldestPersonOfEachLetter() {

        Comparator​<Person> byAge1 = Comparator.comparing(byAge);
        return persons.stream().
                collect(Collectors.groupingBy(person -> person.getName().charAt(0), Collectors.reducing(BinaryOperator.maxBy(byAge1))));
    }
}

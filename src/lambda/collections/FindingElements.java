package lambda.collections;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author ramudu
 */
public class FindingElements {

    final private List<String> friends;
    final private Predicate<String> startsWithK = name -> name.startsWith("K");
    final private Function<String, Predicate<String>> startsWithLetter = (String letter) -> {
        Predicate<String> checkLetter = (name) -> name.startsWith(letter);
        return checkLetter;
    };
    final private Function<String, Predicate<String>> startsWithConciseLetter = (letter) -> (name) -> name.startsWith(letter);

    public FindingElements(List<String> friends) {
        this.friends = friends;
    }

    public void findAndPrint() {
        this.friends.stream()
                .filter(startsWithK)
                .forEach(System.out::println);
    }

    public void findAndPrintLexical() {
        this.friends.stream()
                .filter(startsWithK)
                .forEach(System.out::println);
    }

    public void findAndPrintLexical(String letter) {
        this.friends.stream()
                .filter(startsWithLetter.apply(letter))
                .forEach(System.out::println);
    }

    public void findAndPrintConciseLexical(String letter) {
        this.friends.stream()
                .filter(startsWithConciseLetter.apply(letter))
                .forEach(System.out::println);
    }

    public void findCount() {
        final List<String> listStartsWithK = this.friends.stream()
                .filter(startsWithK)
                .collect(Collectors.toList());
        System.out.println("List Size :" + listStartsWithK.size());
    }

    public long findLongCount() {
        return this.friends.stream()
                .filter(name -> name.startsWith("K"))
                .count();
    }

    public void pickName(final List<String> names, final String startingLetter) {

        final Optional<String> foundName
                = names.stream()
                        .filter(name -> name.startsWith(startingLetter))
                        .findFirst();

        foundName.ifPresent((s) -> System.out.println("Hello " + s));
    }

}

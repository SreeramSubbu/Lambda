package lambda.collections;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author ramudu
 */
public class ReducingCollections {

    final private List<String> friends;

    public ReducingCollections(List<String> friends) {
        this.friends = friends;
    }

    public long findSum() {
        return friends.stream()
                .mapToInt(name -> name.length())
                .sum();
    }

    public Optional printLongest() {
        return friends.stream()
                .reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);

    }

    public String printLongestWithDefault() {
        return friends.stream()
                .reduce("Default", (name1, name2) -> name1.length() >= name2.length() ? name1 : name2);

    }

}

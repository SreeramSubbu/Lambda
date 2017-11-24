package lambda.collections;

import java.util.List;

/**
 *
 * @author ramudu
 */
public class TransformingList {

    final private List<String> friends;

    public TransformingList(List<String> friends) {
        this.friends = friends;
    }

    public void upperCaseWithforEach() {
        this.friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);
    }
}

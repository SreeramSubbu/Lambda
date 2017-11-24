package lambda.collections;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author ramudu
 */
public class IteratingAList {

    final private List<String> friends;

    public IteratingAList(List<String> friends) {
        this.friends = friends;
    }

    public void iterateWithForEach() {
        this.friends.forEach(new Consumer<String>() {

            @Override
            public void accept(final String name) {
                System.out.println(name);
            }

        }
        );
    }

    public void iterateWithLambda() {
        this.friends.forEach((final String name) -> System.out.println(name));
    }

    public void iterateWithMethodReference() {
        this.friends.forEach(System.out::println);
    }

}

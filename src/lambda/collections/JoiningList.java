package lambda.collections;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ramudu
 */
public class JoiningList {

    private final List<String> friends;

    public JoiningList(List<String> friends) {
        this.friends = friends;
    }

    public void printList() {
        System.out.println(String.join(",", friends));
    }

    public void printUpperCaseList() {
        System.out.println(
                friends.stream().map(name -> name.toUpperCase())
                        .collect(Collectors.joining(","))
        );
    }

}

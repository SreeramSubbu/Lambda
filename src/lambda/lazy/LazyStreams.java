package lambda.lazy;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author ramudu
 */
public class LazyStreams {

    public static void evaluate(List<String> names) {
        Optional<String> result = names.stream()
                .filter(name -> lengthCheck(name))
                .map(name -> toUpperCase(name))
                .findFirst();
        result.ifPresent(name -> System.out.print("Result: " + name));
    }

    public static boolean lengthCheck(String name) {
        return name.length() > 5;
    }

    public static String toUpperCase(String name) {
        return name.toUpperCase();
    }
}

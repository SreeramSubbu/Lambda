package lambda.pattern;

import java.util.function.Function;
import org.junit.Test;

/**
 *
 * @author ramudu
 */
public class PersonWithBuilderPattern {

    @Test
    public void createPerson() {
        Person person = Person.build(
                newPerson -> newPerson
                        .age(20)
                        .name("Kumar")
                        .address("postTown")
        );
    }

}

package lambda.collections;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author ramudu
 */
public class IteratingAListTest {

    IteratingAList list;

    @Before
    public void setUp() {
        List<String> friends = Arrays.asList("Kumar", "Karthik", "Vivek", "Nishanth", "Anbu", "Sugan");
        list = new IteratingAList(friends);
    }

    /**
     * Test of iterateWithForEach method, of class IteratingAList.
     */
    @Test
    public void testIterateWithForEach() {
        list.iterateWithForEach();
    }

    /**
     * Test of iterateWithLambda method, of class IteratingAList.
     */
    @Test
    public void testIterateWithLambda() {
        list.iterateWithLambda();
    }

    /**
     * Test of iterateWithMethodReference method, of class IteratingAList.
     */
    @Test
    public void testIterateWithMethodReference() {
        list.iterateWithMethodReference();
    }

}

package lambda.collections;

import lambda.collections.TransformingList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author ramudu
 */
public class TransformingListTest {

    TransformingList list;

    @Before
    public void setUp() {
        List<String> friends = Arrays.asList("Kumar", "Karthik", "Vivek", "Nishanth", "Anbu", "Sugan");
        list = new TransformingList(friends);
    }

    /**
     * Test of upperCaseWithforEach method, of class TransformingList.
     */
    @Test
    public void testUpperCaseWithforEach() {
        list.upperCaseWithforEach();

    }

}

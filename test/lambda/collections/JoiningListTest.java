package lambda.collections;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author ramudu
 */
public class JoiningListTest {

    JoiningList list;

    @Before
    public void setUp() {
        List<String> friends = Arrays.asList("Kumar", "Karthik", "Vivek", "Nishanth", "Anbu", "Sugan");
        list = new JoiningList(friends);
    }

    @Test
    public void testPrintList() {
        list.printList();
    }

    @Test
    public void testPrintUpperCaseList() {
        list.printUpperCaseList();
    }

}

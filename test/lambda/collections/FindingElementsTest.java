package lambda.collections;

import lambda.collections.FindingElements;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ramudu
 */
public class FindingElementsTest {

    FindingElements list;

    @Before
    public void setUp() {
        List<String> friends = Arrays.asList("Kumar", "Karthik", "Vivek", "Nishanth", "Anbu", "Sugan");
        list = new FindingElements(friends);
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of upperCaseWithforEach method, of class TransformingList.
     */
    @Test
    public void testStaticValueK() {
        list.findAndPrint();

    }

    @Test
    public void testPickName() {
        List<String> friends = Arrays.asList("Kumar", "Karthik", "Vivek", "Nishanth", "Anbu", "Sugan");
        list.pickName(friends, "K");

    }

    @Test
    public void testFindAndPrint() {
        list.findAndPrint();
    }

    @Test
    public void testFindAndPrintLexical_0args() {
        list.findAndPrintLexical();
    }

    @Test
    public void testFindAndPrintLexical_String() {
        list.findAndPrintLexical("K");
    }

    @Test
    public void testFindAndPrintConciseLexical() {
        list.findAndPrintConciseLexical("S");
    }

    @Test
    public void testFindCount() {
        list.findCount();
    }

    @Test
    public void testFindLongCount() {
        System.out.println(list.findLongCount());
    }

}

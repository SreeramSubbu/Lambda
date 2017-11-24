package lambda.resources;

import org.junit.Test;

/**
 *
 * @author ramudu
 */
public class ExceptionTester {

    @Test
    public void testException() {
        ExceptionTestHelper.assertThrows(NullPointerException.class, ExceptionTestClass::throwException);
    }
}

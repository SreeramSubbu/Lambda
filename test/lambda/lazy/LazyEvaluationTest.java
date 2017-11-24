package lambda.lazy;

import org.junit.Test;

/**
 *
 * @author ramudu
 */
public class LazyEvaluationTest {
    
    public LazyEvaluationTest() {
    }

    @Test
    public void testNormalValuator() {
        LazyEvaluation.normalValuator();
    }

    @Test
    public void testLazyValuator() {
        LazyEvaluation.lazyValuator();
    }
    
}

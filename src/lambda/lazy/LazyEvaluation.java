package lambda.lazy;

import java.util.function.Supplier;

/**
 *
 * @author ramudu
 */
public class LazyEvaluation {

    public static void normalValuator() {
        System.out.println("Accept" + (evaluate(10) && evaluate(120)));
    }

    public static void lazyValuator() {
        System.out.println("Accept" + lambdaEvaluator(() -> evaluate(10), () -> evaluate(120)));
    }

    private static boolean lambdaEvaluator(Supplier<Boolean> val1, Supplier<Boolean> val2) {
        return (val1.get() && val2.get());
    }

    private static boolean evaluate(Integer a) {
        System.out.println("Evaluating" + a);
        return a > 100;
    }
}

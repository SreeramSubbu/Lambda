package lambda.lazy;

import java.util.function.Supplier;
import lambda.lazy.Heavy;

/**
 *
 * @author ramudu
 */
public class LazyInstanceCreation {

    private Supplier<Heavy> heavy = () -> createAndCacheHeavy();

    public LazyInstanceCreation() {
        System.out.println("L created");
    }

    Heavy getHeavy() {
        return heavy.get();
    }

    private synchronized Heavy createAndCacheHeavy() {
        class HeavyFactory implements Supplier<Heavy> {

            private final Heavy heavyInstance = new Heavy();

            @Override
            public Heavy get() {
                return heavyInstance;
            }
        }

        if (!HeavyFactory.class.isInstance(heavy)) {
            heavy = new HeavyFactory();
        }

        return heavy.get();
    }
}

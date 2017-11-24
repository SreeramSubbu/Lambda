package lambda.resources;

/**
 *
 * @author ramudu
 */
@FunctionalInterface
public interface AutoCleanUpWriter<T, X extends Throwable> {

    public void accept(T t) throws X;

}

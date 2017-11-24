package lambda.lazy;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author ramudu
 */
public class LazyStreamTester {

    List<String> names = Arrays.asList("Amal","Kim","Sri","Kamala","Kumar");
    
    @Test
    public void testLazyStream(){
         LazyStreams.evaluate(names);
    }
}
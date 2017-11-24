package lambda.resources;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author ramudu
 */
public class LambdaWriterTest {

    @Test
    public void testWriter() throws IOException {

        LambdaFileWriter.use("temp", writer -> writer.write("Hello"));

    }

}

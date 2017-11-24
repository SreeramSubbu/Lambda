package lambda.resources;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ramudu
 */
public class LambdaFileWriter {

    private final FileWriter writer;

    private LambdaFileWriter(String fileName) throws IOException {
        writer = new FileWriter(fileName);
    }

    public void write(String content) throws IOException {
        writer.write(content);
    }

    private void close() throws IOException {
        writer.close();
    }

    public static void use(String fileName, AutoCleanUpWriter<LambdaFileWriter, IOException> xWriter) throws IOException {
        LambdaFileWriter lambdaWriter = new LambdaFileWriter(fileName);
        try {
            xWriter.accept(lambdaWriter);
        } finally {
            lambdaWriter.close();
        }

    }
}

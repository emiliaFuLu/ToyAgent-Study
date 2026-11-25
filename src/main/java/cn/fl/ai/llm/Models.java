package cn.fl.ai.llm;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * read config
 *
 * @author <a href="mailto:fulurjj@gmail.com">FuLu</a>
 * @since 2026/11/25 16:15
 */
public final class Models {

    private static String baseUrl;
    private static String apikey;
    private static String modelName;

    static {
        load_simple();
    }

    private static void load_simple() {
        Properties properties = new Properties();
        Path conf = Path.of("config.properties");

        try (InputStream in = Files.newInputStream(conf)) {
            properties.load(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        baseUrl = properties.getProperty("base-url");
        apikey = properties.getProperty("api-key");
        modelName = properties.getProperty("model");
    }

    public static OpenAiChatModel openAiOrNull() {
        return new OpenAiChatModel(baseUrl, apikey, modelName);
    }
}

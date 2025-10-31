package utilities;

import io.github.cdimascio.dotenv.Dotenv;

public class ConfigReader {
    private static final Dotenv dotenv = Dotenv.configure()
            .directory(System.getProperty("user.dir"))
            .ignoreIfMissing()
            .load();

    public static String get(String key) {
        return dotenv.get(key);
    }
}
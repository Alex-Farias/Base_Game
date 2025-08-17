package repositories;

import java.io.InputStream;
import java.util.Properties;

public class Config {
    private static final Properties properties = new Properties();

    static {
        // Load the properties file when the class is initialized
        try (InputStream input = Config.class.getClassLoader().getResourceAsStream("game.properties")) {
            if (input == null) {
                System.out.println("Unable to find game.properties");
            }
            properties.load(input);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }
}

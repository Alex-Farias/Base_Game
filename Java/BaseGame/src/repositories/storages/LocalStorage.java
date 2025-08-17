package repositories.storages;

import repositories.storages.enums.LocalStorageEnum;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LocalStorage {
    private List<String> contents;

    public LocalStorage(String file){
        Path path = Paths.get(file);
        try {
            contents = Files.readAllLines(path);
        } catch (Exception e) {
            contents = null;
            throw new RuntimeException(e);
        }
    }

    public String getContent(String index) {
        try {
            for (String content : contents){
                if(content.contains(index)){
                    return content.substring(index.length());
                }
            }
            return "none content for " + index;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

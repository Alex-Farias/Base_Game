package repositories.storages.enums;

public enum LocalStorageEnum {
    FIRST("First"),
    SECOND("Secord");

    private final String index;

    private LocalStorageEnum(String index) {
        this.index = index;
    }

    public String getValue(){
        return this.index;
    }
}

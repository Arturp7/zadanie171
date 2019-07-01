public enum Season {
    SPRING("Wiosna"),
    SUMMER("Lato"),
    AUTUMN("Jesień"),
    WINTER("Zima");

    private String translation;

    Season(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}

package de.telran.Ex4_02_09.Search;

public class Document {
    private final String text;

    public Document(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Document{" +
                "text='" + text + '\'' +
                '}';
    }
}

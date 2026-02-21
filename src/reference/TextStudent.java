package reference;

import java.util.Objects;

public class TextStudent {
    private String text;

    public TextStudent(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
public void printText() {
        text = text.replaceAll("%.*%", " ");
}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TextStudent that = (TextStudent) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(text);
    }

    @Override
    public String toString() {
        return "TextStudent{" +
                "text='" + text + '\'' +
                '}';
    }
}

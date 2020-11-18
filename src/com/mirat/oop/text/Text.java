package com.mirat.oop.text;

import java.util.Objects;

public class Text {

    private String header;
    private Sentence sentence;

    public Text(String header, Sentence sentence) {
        this.header = header;
        this.sentence = sentence;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Sentence getSentence() {
        return sentence;
    }

    public void setSentence(Sentence sentence) {
        this.sentence = sentence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(header, text.header) &&
                Objects.equals(sentence, text.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, sentence);
    }

    @Override
    public String toString() {
        return String.format("%-7s%-100s%-7s%-100s", "Header: ", header, "| Text: ", sentence);
    }
}

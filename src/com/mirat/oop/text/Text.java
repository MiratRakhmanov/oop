package com.mirat.oop.text;

import java.util.List;
import java.util.Objects;

public class Text {

    private String header;
    private List<Sentence> sentence;

    public Text(String header, List<Sentence> sentence) {
        this.header = header;
        this.sentence = sentence;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<Sentence> getSentence() {
        return sentence;
    }

    public void setSentence(List<Sentence> sentence) {
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
        return "Text{" +
                "header='" + header + '\'' +
                ", sentence=" + sentence +
                '}';
    }
}

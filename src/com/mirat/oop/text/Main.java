package com.mirat.oop.text;

import com.mirat.oop.View;

public class Main {

    public static void main(String[] args) {
        Word hello = new Word("Hello");
        Word world = new Word("world!");
        Word name = new Word("Mirat.");
        Word extra = new Word("Some new text!");

        Sentence sentence = new Sentence();
        sentence.addWords(hello);
        sentence.addWords(world);
        sentence.addWords(name);

        Text text = new Text("My First Text.", sentence);

        View.print(text.getSentence());
        System.out.println("*********************");

        sentence.addWords(extra);

        View.print(text.getSentence());
        System.out.println("*********************");

        View.print(text.getHeader());

    }
}

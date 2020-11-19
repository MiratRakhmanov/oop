package com.mirat.oop.text;

import com.mirat.oop.View;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Character h = 'H';
        Character e = 'e';
        Character l = 'l';
        Character o = 'o';
        Word hello = new Word(new ArrayList<>(Arrays.asList(h, e, l, l, o)));

        Character sp = ' ';
        Word space = new Word(new ArrayList<>(Arrays.asList(sp)));

        Character w = 'W';
        Character r = 'r';
        Character d = 'd';
        Word world = new Word(new ArrayList<>(Arrays.asList(w, o, r, l, d)));

        Character sh = '!';
        Word specialCharacter = new Word(new ArrayList<>(Arrays.asList(sh)));

        Sentence sentence = new Sentence();
        sentence.addWord(hello);
        sentence.addWord(space);
        sentence.addWord(world);
        sentence.addWord(specialCharacter);

        Text text = new Text("My First Text.", (new ArrayList<>(Arrays.asList(sentence))));

        View.print(text.getSentence());
        System.out.println("*********************");

        Character i = 'i';
        Word hi = new Word(new ArrayList<>(Arrays.asList(h, i)));

        sentence.addWord(space);
        sentence.addWord(hi);
        sentence.addWord(specialCharacter);

        View.print(text.getSentence());
        System.out.println("*********************");

        View.print(text.getHeader());
    }
}


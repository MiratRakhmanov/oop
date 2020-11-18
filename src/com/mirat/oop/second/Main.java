package com.mirat.oop.second;

import com.mirat.oop.View;

public class Main {

    public static void main(String[] args) {
        City grodno = new City("Grodno");
        City vitebsk = new City("Vitebsk");
        City mogilev = new City("Mogilev");
        City gomel = new City("Gomel");
        City brest = new City("Brest");
        City minsk = new City("Minsk");

        Rayon grodnoRayon = new Rayon("Grodnenski Rayon", grodno);
        Rayon vitebskRayon = new Rayon("Vitebskski Rayon", vitebsk);
        Rayon mogilevRayon = new Rayon("Mogilevski Rayon", mogilev);
        Rayon gomelRayon = new Rayon("Gomelski Rayon", gomel);
        Rayon brestRayon = new Rayon("Brestski Rayon", brest);
        Rayon minskRayon = new Rayon("Minski Rayon", minsk);

        Oblast grodnenskaya = new Oblast("Grodnenskaya Oblast", grodnoRayon);
        Oblast vitebskaya = new Oblast("Vitebskaya Oblast", vitebskRayon);
        Oblast mogilevskaya = new Oblast("Mogilevskaya Oblast", mogilevRayon);
        Oblast gomelskaya = new Oblast("Gomelskaya Oblast", gomelRayon);
        Oblast brestskaya = new Oblast("Brestskaya Oblast", brestRayon);
        Oblast minskaya = new Oblast("Minskaya Oblast", minskRayon);

        State belarus = new State("Republic of Belarus", minsk, 200.7, grodnenskaya, vitebskaya, mogilevskaya, gomelskaya, brestskaya, minskaya);
        View.print(belarus.getCapital());
        System.out.println("*********************");

        View.print(belarus.getOblast().length);
        System.out.println("*********************");

        View.print(belarus.getArea());
        System.out.println("*********************");

        View.printArray(belarus.getOblast());
    }
}

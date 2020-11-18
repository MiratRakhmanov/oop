package com.mirat.oop;

import com.mirat.oop.second.Oblast;
import com.mirat.oop.second.Rayon;
import java.util.Arrays;
import java.util.List;

public class View {

    public static <T> void printArrayList(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static void printArray(Oblast[] element) {
        for (Oblast o : element) {
            for (Rayon r : o.getRayons()) {
                System.out.println(Arrays.toString(r.getRayonCities()).replace("[", "").replace("]", ""));
            }
        }
    }

    public static <T> void print(T element){
        System.out.println(element);
    }
}

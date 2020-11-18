package com.mirat.oop.second;

import java.util.Arrays;
import java.util.Objects;

public class Oblast {

    private String oblastName;
    private Rayon[] rayons;

    public Oblast(String oblastName, Rayon... rayons) {
        this.oblastName = oblastName;
        this.rayons = rayons;
    }

    public String getOblastName() {
        return oblastName;
    }

    public void setOblastName(String oblastName) {
        this.oblastName = oblastName;
    }

    public Rayon[] getRayons() {
        return rayons;
    }

    public void setRayons(Rayon[] rayons) {
        this.rayons = rayons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oblast oblast = (Oblast) o;
        return Objects.equals(oblastName, oblast.oblastName) &&
                Arrays.equals(rayons, oblast.rayons);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(oblastName);
        result = 31 * result + Arrays.hashCode(rayons);
        return result;
    }

    @Override
    public String toString() {
        return String.format("%-11s%-8s%-17s%-8s", "Oblast name: ", oblastName, "| Rayon Capital: ", Arrays.toString(rayons).replace("[", "").replace("]", ""));
    }
}

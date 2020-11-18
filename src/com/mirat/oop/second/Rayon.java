package com.mirat.oop.second;

import java.util.Arrays;
import java.util.Objects;

public class Rayon {

    private String rayonName;
    private City[] rayonCities;

    public Rayon(String rayonName, City... rayonCities) {
        this.rayonName = rayonName;
        this.rayonCities = rayonCities;
    }

    public String getRayonName() {
        return rayonName;
    }

    public void setRayonName(String rayonName) {
        this.rayonName = rayonName;
    }

    public City[] getRayonCities() {
        return rayonCities;
    }

    public void setRayonCities(City[] rayonCities) {
        this.rayonCities = rayonCities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rayon rayon = (Rayon) o;
        return Objects.equals(rayonName, rayon.rayonName) &&
                Arrays.equals(rayonCities, rayon.rayonCities);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(rayonName);
        result = 31 * result + Arrays.hashCode(rayonCities);
        return result;
    }

    @Override
    public String toString() {
        return String.format("%-11s%-8s%-17s%-8s", "Rayon name: ", rayonName, "| Rayon Capital: ", Arrays.toString(rayonCities).replace("[", "").replace("]", ""));
    }
}

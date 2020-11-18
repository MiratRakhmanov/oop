package com.mirat.oop.second;

import java.util.Arrays;
import java.util.Objects;

public class State {

    private double area;
    private City capital;
    private String stateName;
    private Oblast[] oblast;

    public State(String stateName, City capital, double area, Oblast... oblast) {
        this.stateName = stateName;
        this.capital = capital;
        this.area = area;
        this.oblast = oblast;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Oblast[] getOblast() {
        return oblast;
    }

    public void setOblast(Oblast[] oblast) {
        this.oblast = oblast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Double.compare(state.area, area) == 0 &&
                Objects.equals(capital, state.capital) &&
                Objects.equals(stateName, state.stateName) &&
                Arrays.equals(oblast, state.oblast);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(area, capital, stateName);
        result = 31 * result + Arrays.hashCode(oblast);
        return result;
    }

    @Override
    public String toString() {
        return String.format("%-11s%-8s%-5s%-6s%-8s%-6s%-7s%-100s", "State name: ", stateName, "| Area: ", area, "| Capital: ", capital,  "| Oblasti: ", Arrays.toString(oblast).replace("[", "").replace("]", ""));
    }
}

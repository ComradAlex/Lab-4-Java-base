package ru.billing;

public class WorkArray<T extends Number> {
    private T[] arrNums;

    public WorkArray(T[] numP) {
        this.arrNums = numP;
    }

    public double sum() {
        double doubleWork = 0;

        for (T elem: arrNums) {
            doubleWork += elem.doubleValue();
        }
        return doubleWork;
    }
}

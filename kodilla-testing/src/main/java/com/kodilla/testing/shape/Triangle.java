package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private double a;
    private double h;

    public Triangle(int a, int h){
        this.a = a;
        this.h = h;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
        return (a * h)/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 &&
                Double.compare(triangle.h, h) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(a, h);
    }
}

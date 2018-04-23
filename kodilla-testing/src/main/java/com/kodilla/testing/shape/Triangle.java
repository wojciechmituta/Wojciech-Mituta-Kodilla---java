package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private Shape triangle;
    private double a;
    private double h;

    public Triangle(int a, int h){
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (a * h)/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle1 = (Triangle) o;
        return a == triangle1.a &&
                h == triangle1.h &&
                Objects.equals(triangle, triangle1.triangle);
    }

    @Override
    public int hashCode() {

        return Objects.hash(triangle, a, h);
    }
}

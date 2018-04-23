package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private Shape circle;
    private double r;

    public Circle(int r){
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.PI * r *r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle1 = (Circle) o;
        return r == circle1.r &&
                Objects.equals(circle, circle1.circle);
    }

    @Override
    public int hashCode() {

        return Objects.hash(circle, r);
    }
}

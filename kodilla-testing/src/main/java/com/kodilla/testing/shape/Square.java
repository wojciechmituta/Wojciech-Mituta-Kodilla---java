package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private Shape square;
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return a * a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square1 = (Square) o;
        return a == square1.a &&
                Objects.equals(square, square1.square);
    }

    @Override
    public int hashCode() {

        return Objects.hash(square, a);
    }
}

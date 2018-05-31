package com.kodilla.testing.shape;


import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(5);
        Triangle triangle = new Triangle(5, 3);
        Circle circle = new Circle(6);
        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(square, shapeCollector.getFigure(0));
        Assert.assertEquals(triangle, shapeCollector.getFigure(1));
        Assert.assertEquals(circle, shapeCollector.getFigure(2));


        shapeCollector.removeFigure(square);
        Assert.assertEquals(triangle, shapeCollector.getFigure(0));
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(6);
        Triangle triangle = new Triangle(5, 3);
        Circle circle = new Circle(6);
        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        //Then
        shapeCollector.removeFigure(square);
        Assert.assertEquals(triangle, shapeCollector.getFigure(0));
    }

    @Test
    public void testCalculateTheField(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(4);
        Triangle triangle = new Triangle(5, 3);
        Circle circle = new Circle(6);
        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(16.0, square.getField(), 0.1);
        Assert.assertEquals(7.5, triangle.getField(), 0.1);
        Assert.assertEquals(113, circle.getField(), 0.1);
    }
}

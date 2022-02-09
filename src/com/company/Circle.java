package com.company;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        radius =1.0;
    }
    public Circle(double radius){
        setRadius(radius);
    }

    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 3.14 * Math.pow(getRadius(),2);
    }

    public double getPerimeter(){
        return 2*3.14*getRadius();
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius() + " which is subclass of " + super.toString();
    }
}



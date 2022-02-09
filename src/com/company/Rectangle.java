package com.company;

public class Rectangle extends Shape{
    public double width;
    public double length;

    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        super();
        setWidth(width);
        setLength(length);
    }

    public Rectangle(String color, boolean filled, double radius, double width, double length){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return (width + length)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth() + ", length = " + getLength() + " which is subclass of " + super.toString();
    }
}

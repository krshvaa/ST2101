package com.company;

public class Square extends Rectangle{
    private double side;
    Square(){
        super();
    }

    public Square(double side){
        setLength(side);
        setWidth(side);
    }

    public Square(String color, boolean filled, double side){
        setLength(side);
        setWidth(side);
        this.color = color;
        this.filled = false;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        length = side;
    }

    @Override
    public void setLength(double side) {
        width = side;
    }

    @Override
    public String toString() {
        return "A Square with side = " + getLength() + " which is subclass of " + super.toString();
    }
}

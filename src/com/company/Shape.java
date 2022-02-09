package com.company;

public class Shape {
    public String color = "red";
    public boolean filled = true;

    public Shape(){
        color = "green";
        filled = true;
    }
    public Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (isFilled())
            return "A shape with color of " + getColor() + " and filled";
        else
            return "A shape with color of " + getColor() + " and not filled";
    }
}



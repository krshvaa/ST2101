package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Circle: ");
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("The area of the circle: " + circle.getArea());
        System.out.println("The perimeter of the circle: " + circle.getPerimeter());
        System.out.println("Rectangle: ");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println("The area of the rectangle: " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle: " + rectangle.getPerimeter());
        System.out.println("Square: ");
        Square square = new Square();
        System.out.println(circle);
        System.out.println("The area of the square: " + square.getArea());
        System.out.println("The perimeter of the square: " + square.getPerimeter());

    }

}

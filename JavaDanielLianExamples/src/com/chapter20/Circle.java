package com.chapter20;

public class Circle extends GeometricObject {

    private double radius;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        return  radius;
    }

    // Print the circle info
    public void printCircle(){
        System.out.println("The circle is created "+ getDateCreated()+ " and the radius is "+ radius);
    }
}
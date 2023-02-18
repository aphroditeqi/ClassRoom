package com.classroom.Class;

/*
 * @author
 * @version 1.0
 *
 * 2022/12/30 17:03
 */
public abstract class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
    }

    public Circle(String realType) {
        super(realType);
    }

    public Circle(String realType, double radius) {
        super(realType);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + "半径：" + this.radius + '\n';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

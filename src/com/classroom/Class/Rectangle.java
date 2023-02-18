package com.classroom.Class;

/*
 * @author
 * @version 1.0
 *
 * 2022/12/30 16:51
 */
public abstract class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle() {
        super();
    }

    public Rectangle(String realType) {
        super(realType);
    }

    public Rectangle(double width, double height, String realType){
        this(realType);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + "宽度：" + this.width + ";高度：" + this.height + '\n';
    }

    @Override
    public double getArea(){
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

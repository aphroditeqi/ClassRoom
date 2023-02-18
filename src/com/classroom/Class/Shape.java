package com.classroom.Class;

/*
 * @author
 * @version 1.0
 *
 * 2022/12/30 16:46
 */
public abstract class Shape {
    private String realType = "未知";

    public Shape() {
    }

    public Shape(String realType) {
        this.realType = realType;
    }

    public String getRealType() {
        return realType;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "类型：" + this.realType  + "\n";
    }
}

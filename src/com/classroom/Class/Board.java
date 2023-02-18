package com.classroom.Class;

/*
 * @author
 * @version 1.0
 *
 * 2022/12/30 17:53
 */
public class Board extends Rectangle{
    private String color = "黑色";

    public Board(){
        super("黑板");
    }

    public Board(double width, double height) {
        super(width, height, "黑板");
    }

    public Board(double width, double height, String color) {
        this(width, height);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "颜色" + this.color + "\n";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}

package com.classroom.Class;

/*
 * @author
 * @version 1.0
 *
 * 2022/12/30 17:51
 */
public class Curtain extends Rectangle{
    private String style = "未知";

    public Curtain() {
        super("窗帘");
    }

    public Curtain(double width, double height) {
        super(width, height, "窗帘");
    }

    public Curtain(double width, double height, String style) {
        this(width, height);
        this.style = style;
    }

    @Override
    public String toString() {
        return super.toString() + "风格：" + this.style + "\n";
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}

package com.classroom.Class;

/*
 * @author
 * @version 1.0
 *
 * 2022/12/30 17:28
 */
public class Lights extends Rectangle implements Switch{
    private int power;
    private String type;

    public Lights() {
        super("电灯");
    }

    public Lights(double width, double height) {
        super(width, height, "电灯");
    }

    public Lights(double width, double height, int power) {
        this(width, height);
        this.power = power;
    }

    public Lights(double width, double height, String type) {
        this(width, height);
        this.type = type;
    }

    public Lights(double width, double height, int power, String type) {
         this(width, height, power);
         this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "功率：" + this.power + "；类型：" + this.type + '\n';
    }

    @Override
    public void open() {
        System.out.println("电灯了......");
    }

    @Override
    public void close() {
        System.out.println("电灯灭了......");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

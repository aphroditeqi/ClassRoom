package com.classroom.Class;
/*
* @author
* @version 1.0
*
* 2022/12/30 17:21
*/
public class Fan extends Circle implements Switch{
    private int leafNum = 3;

    public Fan() {
        super();
    }

    public Fan(double radius){
        super("吊扇", radius);
    }

    public Fan(double radius, int leafNum){
        this(radius);
        this.leafNum = leafNum;
    }

    @Override
    public String toString() {
        return super.toString() + "扇叶数：" + this.leafNum + '\n';
    }

    @Override
    public void open() {
        System.out.println("吊扇开始转了......");
    }

    @Override
    public void close() {
        System.out.println("吊扇慢慢停了......");
    }

    public int getLeafNum() {
        return leafNum;
    }

    public void setLeafNum(int leafNum) {
        this.leafNum = leafNum;
    }
}

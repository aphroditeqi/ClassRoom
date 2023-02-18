package com.classroom.Class;

/*
 * @author
 * @version 1.0
 *
 * 2022/12/30 17:52
 */
public class Window extends Rectangle{
    private  String material = "玻璃";
    public Curtain curtain = null;

    public Window(){
        super("窗户");
    }

    public Window(double width, double height){
        super(width, height, "窗户");
    }

    public Window(double width, double height, String material) {
        this(width, height);
        this.material = material;
    }

    @Override
    public String toString() {
        String curtainInfo =
                this.curtain == null ? "没有安装窗帘" : "窗帘的材质如下：\n" + this.curtain;
        return super.toString() + "材质：" + this.material + "\n" + curtainInfo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Curtain getCurtain() {
        return curtain;
    }

    public void setCurtain(Curtain curtain) {
        this.curtain = curtain;
    }
}

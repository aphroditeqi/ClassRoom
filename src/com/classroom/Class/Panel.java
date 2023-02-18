package com.classroom.Class;

/*
 * @author
 * @version 1.0
 *
 * 2022/12/30 17:42
 */
public class Panel extends Rectangle{
    private Switch aSwitch = null;
    public Panel(){
        super("面板");
    }

    public Panel(double width, double height) {
        super(width, height, "面板");
    }

    @Override
    public String toString() {
        String panelInfo =
                this.aSwitch==null ? "没有任何控制设施" : "控制设施是：\n" + this.aSwitch;
        return super.toString() + panelInfo;
    }

    public void open(){
        if(aSwitch != null){
            this.aSwitch.open();
        }else {
            System.out.println("该面板没有连接控制的设施");
        }
    }

    public void close(){
        if(aSwitch != null){
            this.aSwitch.close();
        }else {
            System.out.println("该面板没有连接控制的设施");
        }
    }

    public Switch getaSwitch() {
        return aSwitch;
    }

    public void setaSwitch(Switch aSwitch) {
        this.aSwitch = aSwitch;
    }
}

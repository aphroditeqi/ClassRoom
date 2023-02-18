package com.classroom.Class;

import java.util.ArrayList;

/*
 * @author
 * @version 1.0
 *
 * 2022/12/30 17:51
 */
public class Test {
    public static void main(String[] args) {
        Wall frontWall = new Wall(10, 3.6);
        Board board = new Board(4, 2, "黑色");
        frontWall.setBoard(board);
        Wall backWall = new Wall(10, 3.6);
        Wall leftWall = new Wall(10, 3.6);
        ArrayList<Window> leftWindowList = new ArrayList<>();
        Window window1 = new Window(1, 3, "玻璃");
        window1.setCurtain(new Curtain(1.3, 3.2, "黄色花纹"));
        Window window2 = new Window(1, 3, "玻璃");
        window2.setCurtain(new Curtain(1.3, 3.2, "黄色花纹"));
        Window window3 = new Window(1, 3, "玻璃");
        window3.setCurtain(new Curtain(1.3, 3.2, "黄色花纹"));

        leftWindowList.add(window1);
        leftWindowList.add(window2);
        leftWindowList.add(window3);
        leftWall.setWindowList(leftWindowList);

        Wall rightWall = new Wall(12, 3.6);
        ArrayList<Panel> panelArrayList = new ArrayList<>();
        ArrayList<Shape> shapeArrayList = new ArrayList<>();
        ArrayList<Fan> fanArrayList = new ArrayList<>();
        ArrayList<Lights> lightsArrayList = new ArrayList<>();

        Panel panel = null;
        Switch aSwitch = null;
        Fan fan = null;
        for (int i = 0; i < 6; i++) {
            panel = new Panel(0.4, 0.4);
            fan = new Fan(1.5, 5);
            aSwitch = fan;
            panel.setaSwitch(aSwitch);
            panelArrayList.add(panel);
            fanArrayList.add(fan);
            shapeArrayList.add(fan);
        }

        Lights lights = null;
        for (int i = 0; i < 12; i++) {
            panel = new Panel(0.3, 0.3);
            lights = new Lights(0.8, 0.6, 15, "日光灯");
            aSwitch = lights;
            panel.setaSwitch(aSwitch);
            panelArrayList.add(panel);
            lightsArrayList.add(lights);
            shapeArrayList.add(lights);
        }

        ArrayList<Wall> wallArrayList = new ArrayList<>();
        wallArrayList.add(frontWall);
        wallArrayList.add(backWall);
        wallArrayList.add(leftWall);
        wallArrayList.add(rightWall);

        Classroom classroom = new Classroom();
        classroom.setWallList(wallArrayList);

        ArrayList<Wall> classWallList = classroom.getWallList();
        int iWall = 0;
        for (Wall wall : classWallList) {
            System.out.println("------第" + ++iWall + "面墙的信息开始输出-------");
            System.out.println(wall);
            System.out.println("------第" + iWall + "面墙的信息打印结束-------");
        }
        double sumFanArea = 0;
        double sumLightsArea = 0;
        double sumShapeArea = 0;

        for (Fan aFan : fanArrayList) {
            sumFanArea += aFan.getArea();
        }
        System.out.println("电扇面积和：" + sumFanArea);

        for (Lights aLights : lightsArrayList) {
            sumLightsArea += aLights.getArea();
        }
        System.out.println("电灯面积和：" + sumLightsArea);

        for (Shape shape : shapeArrayList) {
            sumShapeArea += shape.getArea();
        }
        System.out.println("所有设备面积和：" + sumShapeArea);

        System.out.println("");
    }
}

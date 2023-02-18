package com.classroom.Class;

import java.util.ArrayList;

/*
 * @author
 * @version 1.0
 *
 * 2022/12/30 17:53
 */
public class Wall extends Rectangle{
    private Board board = null;
    private ArrayList<Window> windowList = new ArrayList<>();
    private ArrayList<Panel> panelList = new ArrayList<>();

    public Wall(){
        super("墙");
    }

    public Wall(double width, double height){
        super(width, height, "墙");
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        int iWindow = 0, iPanel = 0;
        for (Window window : windowList) {
            sb.append("第" + ++iWindow + "扇窗户的信息：\n" + window);
        }

        for (Panel panel : panelList) {
            sb.append("第" + ++iPanel + "个面板的信息：\n" + panel);
        }

        if(this.board != null){
            sb.append(board);
        }
        return super.toString() + sb.toString();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Window> getWindowList() {
        return windowList;
    }

    public void setWindowList(ArrayList<Window> windowList) {
        this.windowList = windowList;
    }

    public ArrayList<Panel> getPanelList() {
        return panelList;
    }

    public void setPanelList(ArrayList<Panel> panelList) {
        this.panelList = panelList;
    }
}

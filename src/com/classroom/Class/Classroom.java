package com.classroom.Class;

import java.util.ArrayList;

/*
 * @author
 * @version 1.0
 *
 * 2022/12/30 17:53
 */
public class Classroom {
    private ArrayList<Wall> wallList = new ArrayList<>();
    private ArrayList<Board> boardArrayList = new ArrayList<>();
    private ArrayList<Curtain> curtainArrayList = new ArrayList<>();
    private ArrayList<Fan> fanArrayList = new ArrayList<>();
    private ArrayList<Lights> lightsArrayList = new ArrayList<>();
    private ArrayList<Panel> panelArrayList = new ArrayList<>();

    public ArrayList<Wall> getWallList() {
        return wallList;
    }

    public void setWallList(ArrayList<Wall> wallList) {
        this.wallList = wallList;
    }

    public ArrayList<Board> getBoardArrayList() {
        return boardArrayList;
    }

    public void setBoardArrayList(ArrayList<Board> boardArrayList) {
        this.boardArrayList = boardArrayList;
    }

    public ArrayList<Curtain> getCurtainArrayList() {
        return curtainArrayList;
    }

    public void setCurtainArrayList(ArrayList<Curtain> curtainArrayList) {
        this.curtainArrayList = curtainArrayList;
    }

    public ArrayList<Fan> getFanArrayList() {
        return fanArrayList;
    }

    public void setFanArrayList(ArrayList<Fan> fanArrayList) {
        this.fanArrayList = fanArrayList;
    }

    public ArrayList<Lights> getLightsArrayList() {
        return lightsArrayList;
    }

    public void setLightsArrayList(ArrayList<Lights> lightsArrayList) {
        this.lightsArrayList = lightsArrayList;
    }

    public ArrayList<Panel> getPanelArrayList() {
        return panelArrayList;
    }

    public void setPanelArrayList(ArrayList<Panel> panelArrayList) {
        this.panelArrayList = panelArrayList;
    }
}

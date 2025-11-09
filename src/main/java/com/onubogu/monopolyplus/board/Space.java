package com.onubogu.monopolyplus.board;

public abstract class Space {

    private String name;
    private int index;


    public Space(String name, int index){

    }



    //---------------------Getters-------------------------------
    public int getIndex() {
        return index;
    }

    //--------------------Setters-------------------------------------
    public void setIndex(int index) {
        this.index = index;
    }
}

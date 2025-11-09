package com.onubogu.monopolyplus.board;

public class Tax extends Space{

    private int value;

    //dynamic pricing


    public Tax (String name, int index, int value){
        super(name, index);
        this.value = value;

        Board.getBoard().addSpace(index, (Space) this);
    }





}

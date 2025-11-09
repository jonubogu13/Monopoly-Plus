package com.onubogu.monopolyplus.board.spaces;

import com.onubogu.monopolyplus.board.Board;
import com.onubogu.monopolyplus.board.Space;

public class Tax extends Space {

    private int value;



    public Tax (String name, int index, int value){
        super(name, index);
        this.value = value;

        Board.getBoard().addSpace(index, (Space) this);
    }





}

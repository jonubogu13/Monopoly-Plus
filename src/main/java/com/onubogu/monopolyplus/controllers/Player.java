package com.onubogu.monopolyplus.controllers;

import com.onubogu.monopolyplus.board.Property;

import java.util.HashSet;

public class Player {




    


    public Player(String name, String pieceName, int balance){

        this.name = name;
        this.piece = new Piece(pieceName, this);
        this.balance = balance;
        this.propertySet = new HashSet<Property>();

    }

    //buy
    //trade
    //mortgage
    //


    public void addProperty(Property prop){
        propertySet.add(prop);
    }
    public void removeProperty(Property prop){
        propertySet.remove(prop);
    }

}

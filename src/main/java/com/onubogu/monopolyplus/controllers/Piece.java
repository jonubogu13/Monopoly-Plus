package com.onubogu.monopolyplus.controllers;

public class Piece {

    private String name;
    private int index;
    private Player owner;


    public Piece(String name, Player owner){
        this.name = name;
        this.owner = owner;
        this.index = 0;

    }








    @Override
    public String toString(){
        return name;
    }
}

package com.onubogu.monopolyplus.board;

import com.onubogu.monopolyplus.controllers.Controller;

public class Property extends Space {

    private int value;
    private int mortgage;
    private int rent;
    private boolean mortgaged;
    private ColorGroup group;
    private Controller owner;
    public enum ColorGroup{
        BROWN(2),
        LIGHT_BLUE(3),
        PINK(3),
        ORANGE(3),
        RED(3),
        YELLOW(3),
        GREEN(3),
        DARK_BLUE(2),
        RAILROAD(4),
        UTILITY(2),
        ;
        private final int groupSize;
        ColorGroup(int groupSize){
            this.groupSize = groupSize;
        }
        public int getGroupSize() {
            return groupSize;
        }
    };

    public Property (String name, int index, ColorGroup group, int value, int mortgage, int rent) {
        super(name, index);
        this.group = group;
        this.value = value;
        this.mortgage = mortgage;
        this.rent = rent;
        this.mortgaged = false;
        this.owner = null;

        //lazy initialization of board spaces into the board; very unnecessary but good practice
        Board.getBoard().addSpace(index, (Space) this);
    }



    //--------------Getters------------------------
    public int getValue(){
        return value;
    }
    public int getMortgage(){
        return mortgage;
    }
    public int getRent(){
        return rent;
    }
    public Controller getOwner() {
        return owner;
    }
    public ColorGroup getGroup() {
        return group;
    }
    public boolean isMortgaged() {
        return mortgaged;
    }

    //--------------Setters------------------------
    public void setValue(int value){
        this.value = value;
    }
    public void setMortgage(int mortgage) {
        this.mortgage = mortgage;
    }
    public void setRent(int rent) {
        this.rent = rent;
    }
    public void setOwner(Controller owner) {
        this.owner = owner;
    }
    public void setMortgaged(boolean mortgaged) {
        this.mortgaged = mortgaged;
    }
}

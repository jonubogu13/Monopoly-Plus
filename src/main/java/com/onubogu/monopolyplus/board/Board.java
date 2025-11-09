package com.onubogu.monopolyplus.board;

import com.onubogu.monopolyplus.controllers.Controller;

import java.util.ArrayList;

public class Board {

    private static Board board;
    private ArrayList<Space> boardList;



    private Board(){
        boardList = new ArrayList<Space>();
    }

    public static Board getBoard(){

        if (board == null){
            board = new Board();
        }
        return board;
    }

    public void trade(Controller player1, Controller player2, ArrayList<Property> player1Send,
                      ArrayList<Property> player2Send, int cash, int jailCards){

        //player1 -> player 2
        for (Property prop: player1Send){

            if (prop.isMortgaged()){

                //tradeKeepMort(player2, prop);
                //tradeUndoMort(player2, prop);
            }

            prop.setOwner(player2);
            player1.getPropertySet().remove(prop);
            player2.getPropertySet().add(prop);
        }

        //player2 -> player1
        for (Property prop: player2Send){


            if (prop.isMortgaged()){

                //tradeKeepMort(player1, prop);
                //tradeUndoMort(player1, prop);
            }
            prop.setOwner(player1);
            player1.getPropertySet().add(prop);
            player2.getPropertySet().remove(prop);

        }
        player1.updateGroupSet();
        player2.updateGroupSet();

        //neg value for cash & jailCards is player2 -> player1
        player1.setBalance(player1.getBalance() - cash);
        player2.setBalance(player2.getBalance() + cash);

        player1.setJailCards(player1.getJailCards() - jailCards);
        player2.setJailCards(player2.getJailCards() + jailCards);
    }

    private void tradeUndoMort(Controller player, Property prop){

        player.setBalance(player.getBalance() - prop.getMortgage());
        prop.setMortgaged(false);
    }

    private void tradeKeepMort(Controller player, Property prop){

        player.setBalance((int) (player.getBalance() - (prop.getMortgage() * .1)));

    }


    public void buyProp(Controller player, Property prop){}




    public boolean canBuildHouse(Controller player, Property prop){
        /*
        1. Property type is Street
        2. Player owns the groupSet
        3. Streets in GroupSet is not Mortgaged
        4. Houses on all props are equal or curr prop is once less than max
        5. House doesn't have 4 on.
         */

        if (!(prop instanceof Street)) return false;
        if (!player.getGroupSet().contains(prop.getGroup())) return false;
        if (

    }
    public void buildHouse(){}

    public boolean canSellHouse(){}

    public void sellHouse(){}

    public boolean canBuildHotels(Controller player, Property prop) {
        /*
        1. No hotel has been built on prop
        2. Other houses in groupSet either have 4 houses or 1 hotel
         */


    }
    public void buildHotel(){}

    public boolean canSellHotel(){return false;}

    public void sellHotel(){}


    public void payRent(){}

    public void mortgageProperty(){}

    public void unmortgageProperty(){}

    public void auctionProperty(){}

    public void bankrupt(Controller player, Controller bankrupter){}
    public void bankrupt(Controller player){}












    public Space getSpace(Space space){

        return boardList.get(space.getIndex());

    }


    public ArrayList<Space> getBoardList() {
        return boardList;
    }

    public void addSpace(int index, Space space){
        boardMap.put(index,space);
    }
    public void removeSpace(int index, Space space){
        boardMap.remove(index,space);
    }





}

}
package org.takima;


import org.takima.utilities.EnumColor;
import org.takima.utilities.EnumValue;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    public ArrayList<Card> myDeck;
    public ArrayList<Card> hand;

    public Deck(){
        myDeck = new ArrayList<Card>
                (EnumColor.values().length * EnumValue.values().length);
        hand = new ArrayList<Card>
                (EnumColor.values().length * EnumValue.values().length);
            fillcard();
    }





    public void fillcard(){
        myDeck.clear();
        /* Creation des cartes*/
        for ( EnumColor s : EnumColor.values()){
            for (EnumValue v : EnumValue.values()){
                Card c = new Card(s , v);
                myDeck.add(c);
            }
        }
    }


    public void shuffle(){
        Deck deck = new Deck();
        Collections.shuffle(myDeck);
        
    }


}

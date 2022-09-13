 package org.takima.test;
import java.util.*; 
import org.takima.Card;
import org.takima.Deck;
import org.takima.utilities.EnumColor;
import org.takima.utilities.EnumValue;

import java.util.ArrayList;

public class Test {


    public static ArrayList<Card> createhand(ArrayList<Card> myDeck, int z) {
        int i;
        ArrayList<Card> hand = new ArrayList<Card>(5);
        hand.clear();
        
       
        
        for (i=z ; i < z+5 ; i++) {
            Card temp = myDeck.get(i);
             hand.add(temp);
             
            Collections.sort(hand, new Comparator<Card>() {

        @Override
        public int compare(Card o1, Card o2) {
            if ((int)o1.getValues().ordinal() < (int)o2.getValues().ordinal())
                return -1;
            else if ((int)o1.getValues().ordinal() > (int)o2.getValues().ordinal())
                return 1;
            else
                return 0;
        }
                                                                });
            
            
           
        }
        return hand;

    }
    
    public static  String getColor(String input) {
    return input.substring(input.lastIndexOf(" ") + 1);
}
    
    public static  String getValue(String input) {
       return input.substring(0, input.indexOf(' '));
    
}
   public static Integer GetNumber(String str) //function gets the int number of cards
   { 
       int N;
       switch(str) 
       {
               case "ACE": N=1; break;
               case "TWO": N=2; break;
               case "THREE": N=3; break;
               case "FOUR": N=4; break;
               case "FIVE": N=5; break;
               case "SIX": N=6; break;
               case "SEVEN": N=7; break;
               case "EIGHT": N=8; break;
               case "NINE": N=9; break;
               case "TEN": N=10; break;
               case "JACK": N=11; break;
               case "QUEEN": N=12; break;
               //King is the default here
                 default: N=13;
       
       
       }
       return N;
   }
   public static ArrayList<String> createrank(ArrayList<ArrayList> TenHands) 
   {
       ArrayList<String> AllRanks = new ArrayList<String>(10);
       int j=0;
       //for loop to iterate through all our hands
       outer:
       while(j<10) {
           //Royal Flush condition
            if(getColor(TenHands.get(j).get(0).toString()).equals(getColor(TenHands.get(j).get(1).toString())) && 
                    getValue(TenHands.get(j).get(0).toString()).equals("NINE") )
           { 
                if(getColor(TenHands.get(j).get(1).toString()).equals(getColor(TenHands.get(j).get(2).toString())) &&
                      getValue(TenHands.get(j).get(1).toString()).equals("TEN")  ) 
                {
                    if(getColor(TenHands.get(j).get(2).toString()).equals(getColor(TenHands.get(j).get(3).toString())) && 
                            getValue(TenHands.get(j).get(2).toString()).equals("JACK")) 
                    {
                        if(getColor(TenHands.get(j).get(3).toString()).equals(getColor(TenHands.get(j).get(4).toString())) &&
                                 getValue(TenHands.get(j).get(3).toString()).equals("QUEEN")  &&
                                     getValue(TenHands.get(j).get(4).toString()).equals("KING")) 
                        {
                           AllRanks.add("Royal Flush"); j=j+1; continue outer;
                        }
                    }
                }
           }  //end of Royal Flush condition
            //Start of Straight Flush Condition
            if(getColor(TenHands.get(j).get(0).toString()).equals(getColor(TenHands.get(j).get(1).toString())) &&
                   GetNumber(getValue(TenHands.get(j).get(0).toString())).equals(GetNumber(getValue(TenHands.get(j).get(1).toString()))-1))
           {   
                if(getColor(TenHands.get(j).get(1).toString()).equals(getColor(TenHands.get(j).get(2).toString())) &&
                        GetNumber(getValue(TenHands.get(j).get(1).toString())).equals(GetNumber(getValue(TenHands.get(j).get(2).toString()))-1)) 
                {
                    if(getColor(TenHands.get(j).get(2).toString()).equals(getColor(TenHands.get(j).get(3).toString())) &&
                        GetNumber(getValue(TenHands.get(j).get(2).toString())).equals(GetNumber(getValue(TenHands.get(j).get(3).toString()))-1  )  ) 
                    {
                        if(getColor(TenHands.get(j).get(3).toString()).equals(getColor(TenHands.get(j).get(4).toString())) &&
                              GetNumber(getValue(TenHands.get(j).get(3).toString())).equals(GetNumber(getValue(TenHands.get(j).get(4).toString()))-1 ) ) 
                        {
                           AllRanks.add("Straight Flush"); j=j+1; continue outer;
                        }
                    }
                }
           }  
            if(GetNumber(getValue(TenHands.get(j).get(0).toString())).equals( GetNumber(getValue(TenHands.get(j).get(1).toString()))) )
           {
               if(GetNumber(getValue(TenHands.get(j).get(1).toString())).equals(GetNumber(getValue(TenHands.get(j).get(2).toString()))))
               {
                   if(GetNumber(getValue(TenHands.get(j).get(2).toString())).equals(GetNumber(getValue(TenHands.get(j).get(3).toString()))))
                   {
                       if(!GetNumber(getValue(TenHands.get(j).get(3).toString())).equals(GetNumber(getValue(TenHands.get(j).get(4).toString()))))
                       {
                           AllRanks.add("Four of a kind"); j=j+1; continue outer;
                       }
                   }
               }
           }      
            if(GetNumber(getValue(TenHands.get(j).get(0).toString())).equals(GetNumber(getValue(TenHands.get(j).get(1).toString()))) )
           {
               if(GetNumber(getValue(TenHands.get(j).get(1).toString())).equals(GetNumber(getValue(TenHands.get(j).get(2).toString()))))
               {
                   if(!GetNumber(getValue(TenHands.get(j).get(2).toString())).equals(GetNumber(getValue(TenHands.get(j).get(3).toString()))))
                   {
                       if(GetNumber(getValue(TenHands.get(j).get(3).toString())).equals(GetNumber(getValue(TenHands.get(j).get(4).toString()))) &&
                          !GetNumber(getValue(TenHands.get(j).get(2).toString())).equals(GetNumber(getValue(TenHands.get(j).get(4).toString())))     )
                       {
                           AllRanks.add("Full House"); j=j+1; continue outer;
                       }
                   }
               }
           }  
            if(getColor(TenHands.get(j).get(0).toString()).equals(getColor(TenHands.get(j).get(1).toString())))
           {
                if(getColor(TenHands.get(j).get(1).toString()).equals(getColor(TenHands.get(j).get(2).toString()))) 
                {
                    if(getColor(TenHands.get(j).get(2).toString()).equals(getColor(TenHands.get(j).get(3).toString()))) 
                    {
                        if(getColor(TenHands.get(j).get(3).toString()).equals(getColor(TenHands.get(j).get(4).toString()))) 
                        {
                           AllRanks.add("Flush"); j=j+1; continue outer;
                        }
                    }
                }
           }  //end of Royal Flush Condition
              //Start of Straight condition
             if(GetNumber(getValue(TenHands.get(j).get(0).toString())).equals(GetNumber(getValue(TenHands.get(j).get(1).toString()))-1)) 
           {
               if(GetNumber(getValue(TenHands.get(j).get(1).toString())).equals( GetNumber(getValue(TenHands.get(j).get(2).toString()))-1))
               {
                   if(GetNumber(getValue(TenHands.get(j).get(2).toString())).equals(GetNumber(getValue(TenHands.get(j).get(3).toString()))-1)) 
                   {
                       if(GetNumber(getValue(TenHands.get(j).get(3).toString())).equals( GetNumber(getValue(TenHands.get(j).get(4).toString()))-1))
                       {
                           AllRanks.add("Straight"); j=j+1; continue outer;
                       }
                   }
               }
           }//end of straight condition and start of flush condition
           //end of flush condition and start of four of a kind
             //end of four of a kind and start of three of a kind
               if(GetNumber(getValue(TenHands.get(j).get(0).toString())).equals(GetNumber(getValue(TenHands.get(j).get(1).toString()))) )
           {
               if(GetNumber(getValue(TenHands.get(j).get(1).toString())).equals(GetNumber(getValue(TenHands.get(j).get(2).toString()))))
               {
                   if(!GetNumber(getValue(TenHands.get(j).get(2).toString())).equals(GetNumber(getValue(TenHands.get(j).get(3).toString()))))
                   {
                       if(!GetNumber(getValue(TenHands.get(j).get(3).toString())).equals(GetNumber(getValue(TenHands.get(j).get(4).toString()))) &&
                          !GetNumber(getValue(TenHands.get(j).get(2).toString())).equals(GetNumber(getValue(TenHands.get(j).get(4).toString())))    )
                       {
                           AllRanks.add("Three of a kind"); j=j+1; continue outer;
                       }
                   }
               }
           }    //end of three of a kind and start of two pair
                  if(GetNumber(getValue(TenHands.get(j).get(0).toString())).equals(GetNumber(getValue(TenHands.get(j).get(1).toString()))) ) 
           {
               if(!GetNumber(getValue(TenHands.get(j).get(1).toString())).equals(GetNumber(getValue(TenHands.get(j).get(2).toString()))))
               {
                   if(GetNumber(getValue(TenHands.get(j).get(2).toString())).equals(GetNumber(getValue(TenHands.get(j).get(3).toString()))))
                   {
                       if(!GetNumber(getValue(TenHands.get(j).get(3).toString())).equals(GetNumber(getValue(TenHands.get(j).get(4).toString()))) &&
                               !GetNumber(getValue(TenHands.get(j).get(0).toString())).equals(GetNumber(getValue(TenHands.get(j).get(4).toString()))))
                       {
                           AllRanks.add("Two Pair"); j=j+1; continue outer;
                       }
                   }
               } 
           }     //end of two pair start of one pair
                  if(GetNumber(getValue(TenHands.get(j).get(0).toString())).equals(GetNumber(getValue(TenHands.get(j).get(1).toString()))) || 
                      GetNumber(getValue(TenHands.get(j).get(1).toString())).equals(GetNumber(getValue(TenHands.get(j).get(2).toString())))  ||
                          GetNumber(getValue(TenHands.get(j).get(2).toString())).equals(GetNumber(getValue(TenHands.get(j).get(3).toString())))||
                          GetNumber(getValue(TenHands.get(j).get(3).toString())).equals(GetNumber(getValue(TenHands.get(j).get(4).toString())))
                          ) 
           {
               
                           AllRanks.add("One Pair"); j=j+1; continue outer;
                  
           } //end of one pair condition start of full house
             
                          AllRanks.add("High Card"); j=j+1; continue outer;
                 
            
     }

       
      return AllRanks;
      
   } 
    public ArrayList<Deck> Hands;
    
    public static ArrayList<ArrayList> drawHands() {
        ArrayList<ArrayList> TheTenHands = new ArrayList<ArrayList>(EnumColor.values().length * EnumValue.values().length );
        ArrayList<String> AllPrintedRanks = new ArrayList<String>(10);
        Deck deck = new Deck();
        deck.fillcard();
        
        deck.fillcard();
        deck.shuffle();
        ArrayList<Card> hand;
        
        int j,i = 0;
      for (j = 0; j < 10; j++) {
           hand = createhand(deck.myDeck, j*5);
           TheTenHands.add(hand);
        }
      AllPrintedRanks = createrank(TheTenHands);
      for(i=0; i<10;i++) 
      {
           System.out.print("hand "+(i+1)+": ");
            
           System.out.print(AllPrintedRanks.get(i)+": ");
           System.out.print(TheTenHands.get(i));
           System.out.print("\n");
      }
      /* System.out.print("\n");   
       System.out.print(getColor(TheTenHands.get(0).get(1).toString()));
       System.out.print("\n");
       System.out.print(getValue(TheTenHands.get(0).get(1).toString()));*/
      return TheTenHands;
    
    }
    

    public static void main(String[] args) {
        // ...
        /*Deck deck = new Deck();
        deck.fillcard();
        deck.shuffle();
        createhand(deck.myDeck);*/
        drawHands();
        System.out.print("\n");
        
        
        // System.out.println(deck.myDeck);

    }
} 

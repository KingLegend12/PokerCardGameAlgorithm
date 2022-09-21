/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.takima;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static org.takima.FourOfAKind.FourOfAKindChecker;
import static org.takima.OnePair.OnePairChecker;
import static org.takima.ThreeOfAKind.ThreeOfAKindChecker;
import static org.takima.TwoPair.TwoPairChecker;
import static org.takima.utilities.GetHandData.Data;
import static org.takima.utilities.HelpingUtilities.RankOrders;
import static org.takima.utilities.HelpingUtilities.getValue;


public class Rank {
    
    public static ArrayList<String> CreateRank(List<Card> hand) 
    {       Integer size = hand.size(); //hand size
            ArrayList<String> Cards_Of_Hand_Seperated= new ArrayList<String>(10);
            Integer[] Hand_Values = new Integer[size];
            ArrayList<String> Ranks = new ArrayList<String>(10);
            Hand_Values=Data(hand); //the hand data is fetched no matter how big the hand is
            Boolean One_Pair = OnePairChecker(size , Hand_Values);
            Boolean Two_Pair = TwoPairChecker(size , Hand_Values);
            Boolean Three_Of_A_Kind = ThreeOfAKindChecker(size , Hand_Values);
            Boolean Four_Of_A_Kind = FourOfAKindChecker(size , Hand_Values);
            
            IntStream.range(0, 5).forEach(index ->{
                Cards_Of_Hand_Seperated.add(hand.get(index)+"\n");
            });
            
                if(One_Pair) 
                {
                    Ranks.add("One_Pair "+"\n"+Cards_Of_Hand_Seperated);
                }
                else if(Two_Pair) 
                {
                    Ranks.add("Two_Pair "+"\n"+Cards_Of_Hand_Seperated);
                }
                else if(Three_Of_A_Kind) 
                {
                    Ranks.add("Three_Of_A_Kind "+"\n"+Cards_Of_Hand_Seperated);
                }
                else if(Four_Of_A_Kind) 
                {
                    Ranks.add("Four_Of_A_Kind "+"\n"+Cards_Of_Hand_Seperated);
                }
                  else Ranks.add("High_Card "+"\n"+Cards_Of_Hand_Seperated);
                                                     
             
           
            
            return Ranks;
    }
    public static ArrayList<String> sortranks(ArrayList<String> theranks)
    {
     
         String temp;
      
            for (int i = 0; i <10; i++) {     
             for (int j = i+1; j <10; j++) {
                 
              if(RankOrders(getValue(theranks.get(i))) < RankOrders(getValue(theranks.get(j)))) { 
                //swap elements if not in order
                 temp = theranks.get(i);    
                 theranks.set(i,theranks.get(j));    
                 theranks.set(j,temp); 
                 
               }     
            }     
        }    
      

       return  theranks;
    }
}

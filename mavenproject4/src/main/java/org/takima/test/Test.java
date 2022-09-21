package org.takima.test;

import org.takima.Card;
import org.takima.Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import org.takima.Rank;

import static org.takima.Rank.CreateRank;
import static org.takima.Rank.sortranks;

public class Test {

	public static void main(String[] args) {
		
		DrawHand();
		
		
	}
	
	public static List<Card> createHand()
	{
	   Deck deck = Deck.createNewShuffledDeck();
	   return Deck.pickupCardFromDeck(deck, 5);
		
		
	}
	
	public static void DrawHand()
	{
          ArrayList<String> Ranks = new ArrayList<String>(1);
          ArrayList<String> TenRanks = new ArrayList<String>(10);
	   for(int i=1;i<11;i++)
	   {
		   List<Card> hand = createHand();
                   
                   {/*this sort will be in another class to sort each hand*/}
                   Collections.sort(hand, new Comparator<Card>() {
                @Override
                public int compare(Card o1, Card o2) {
                    if ((int) o1.getValues().ordinal() < (int) o2.getValues().ordinal())
                        return -1;
                    else if ((int) o1.getValues().ordinal() > (int) o2.getValues().ordinal())
                        return 1;
                    else
                        return 0;
                }
            });
                         
                     Ranks = CreateRank(hand);
                     TenRanks.add(Ranks.get(0));
		  
	   }
		
                final ArrayList<String> Sorted_TenRanks_WithHands = sortranks(TenRanks); ;
                
           IntStream.range(0, 10).forEach(index ->{
                System.out.println("   ************************"); 
               System.out.print("Hand n°"+(index+1) + " Rank: "+Sorted_TenRanks_WithHands.get(index));
          
               System.out.println("   ************************"); 
                 System.out.println("\n"); 
            });
           
		
	}
	
	
}

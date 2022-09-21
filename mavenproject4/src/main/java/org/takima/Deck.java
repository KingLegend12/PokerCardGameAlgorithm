package org.takima;


import org.takima.utilities.CardColors;
import org.takima.utilities.CardValues;

import java.util.*;


public class Deck {


    private  List<Card> cards;

    
    public Deck(List<Card> cards) {
		super();
		this.cards = cards;
	}
     

    public static Deck createNewShuffledDeck ()
    {
    	List<Card> cards = new ArrayList<Card>();
    	  for (CardColors s : CardColors.values()) {
              for (CardValues v : CardValues.values()) {
                  Card c = new Card(s.getName(), v.getName(), v);
                  cards.add(c);
              }
          }
    	  Collections.shuffle(cards);
          
            
            
    	return new Deck(cards);
    	
    }
    
     public static List<Card> pickupCardFromDeck(Deck deck , int NumberOfCards)
     {
    	 if(Objects.isNull(deck)|| Objects.isNull(deck.getCards()))
    	        return null;
    	 
    	 List<Card> pickedCards=new ArrayList<Card>();
    	 Random rand = new Random();
    	 for (int i = 0; i < NumberOfCards; i++) {
    	        int randomIndex = rand.nextInt(deck.getCards().size());
    	        Card randomCard = deck.getCards().get(randomIndex);
    	        pickedCards.add(randomCard);
    	        deck.getCards().remove(randomIndex);
    	    }
    	 
    	 return pickedCards;
    	 
     }

  

	public List<Card> getCards() {
		return cards;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deck other = (Deck) obj;
		if (cards == null) {
			if (other.cards != null)
				return false;
		} else if (!cards.equals(other.cards))
			return false;
		return true;
	}

     
     
     

}

package org.takima;

import java.util.ArrayList;
import java.util.List;



public class Hand {
	
	private List<Card> cards ;
    public static  final String ONE_PAIR = "one_pair" ;
    public static  final String TWO_PAIR = "two_pair" ;
    public static  final String FOUR_OF_AKIND = "four_of_kind" ;
    public static  final String THREE_OF_AKIND = "three_of_kind" ;
    
	
	public Hand(List<Card> cards) {
		super();
		this.cards = cards;
	}

	public List<Card> getCards() {
		return cards;
	}
	
	 public static Integer[] getHandValues(Hand hand)
		{
	           
	            Integer Hand_Length = hand.getCards().size();
	            Integer[] Hand_Values = new Integer[Hand_Length];
	           
	            {/*Add here more card if you need have a larger hand*/}
	            for(int i=0; i<Hand_Length; i++)  
	            { 
	               Hand_Values[i]= hand.getCards().get(i).getValues().getValue();
	            } 
	        return Hand_Values;
	}
	
	public static  String  getHandRankName(Hand hand)
	{
		Integer size = hand.getCards().size(); //hand size
        Integer[] Hand_Values = new Integer[size];
        ArrayList<String> Ranks = new ArrayList<String>(10);
        Hand_Values=getHandValues(hand);
        
        Integer same_Cards=0;
        for(int i=0; i<size-1; i++ ) {
            if(Hand_Values[i].equals(Hand_Values[i+1])) 
            {   
                same_Cards++;
            }
        }
        
        switch(same_Cards){
        case 1 : 
        	return ONE_PAIR;
        case 2 :
        	return TWO_PAIR;
        case 3 :
        	return THREE_OF_AKIND ;
        case 4 :
        	return FOUR_OF_AKIND ;
        default :
        	return "NoRank";
    
        }
        
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cards == null) ? 0 : cards.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hand other = (Hand) obj;
		if (cards == null) {
			if (other.cards != null)
				return false;
		} else if (!cards.equals(other.cards))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}

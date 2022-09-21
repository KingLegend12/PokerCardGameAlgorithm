package org.takima;

import org.takima.utilities.CardValues;

public class Card {

	
	private String color ;
	private String value ;
	public CardValues values ;
	public Card(String color, String value, CardValues values) {
		super();
		this.color = color;
		this.value = value;
		this.values=values;
	}
        
	public Card() {
		super();
		
	}
	
	
        

	public String getColor() {
		return color;
	}
	public String getValue() {
		return value;
	}
	public CardValues getValues() {
        return values;
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		Card other = (Card) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Card [color=" + color + ", value=" + value + "]";
	}
	
	
	
	
	
	
	
	
}

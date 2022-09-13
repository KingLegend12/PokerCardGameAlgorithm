package org.takima;


import org.takima.utilities.EnumColor;
import org.takima.utilities.EnumValue;

public class Card {

        public Card( EnumColor color, EnumValue value){
            this.color = color ;
            this.values = value ;
        }

    private EnumColor color;
    private EnumValue values;


    public EnumColor getColor() {
        return color;
    }

    public void setColor(EnumColor color) {
        this.color = color;
    }

    public EnumValue getValues() {
        return values;
    }

    public void setValues(EnumValue values) {this.values = values;}

    @Override
    public String toString() {
        return getValues() + " of " + getColor();
    }


}

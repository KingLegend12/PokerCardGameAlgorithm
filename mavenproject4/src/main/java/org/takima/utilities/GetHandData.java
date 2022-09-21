/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.takima.utilities;

import org.takima.Card;

import java.util.List;




public class GetHandData {
        
         
	
    public static Integer[] Data(List<Card> hand)
	{
           
            Integer Hand_Length = hand.size();
            Integer[] Hand_Values = new Integer[Hand_Length];
           
            {/*Add here more card if you need have a larger hand*/}
            for(int i=0; i<Hand_Length; i++)  
            { 
               Hand_Values[i]= (hand.get(i).getValues().getValue()); //enum function used here
            } 
        return Hand_Values;
}
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.takima;


public class TwoPair {
    
    public static boolean TwoPairChecker(Integer size, Integer[] Hand_Values)
	{
            Integer Same_Cards_1=0;
            Integer Same_Cards_2=0;
       for(int i=0; i<size-2; i++ ) {
           if(Hand_Values[i].equals(Hand_Values[i+1]) && !Hand_Values[i+1].equals(Hand_Values[i+2]) && Same_Cards_1.equals(0)) 
           {
               Same_Cards_1++;
           }
           if(Hand_Values[i+1].equals(Hand_Values[i+2]) && Same_Cards_1.equals(1)) 
           {
               Same_Cards_2++;
           }
           
       }
           if(Same_Cards_1.equals(1) && Same_Cards_2.equals(1)) return true;
    
           return false; 
        }
}

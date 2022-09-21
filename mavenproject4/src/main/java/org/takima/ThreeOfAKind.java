/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.takima;


public class ThreeOfAKind {
    public static boolean ThreeOfAKindChecker(Integer size, Integer[] Hand_Values)
	{
            Integer Same_Cards=0;
       for(int i=0; i<size-1; i++ ) {
           if(Hand_Values[i].equals(Hand_Values[i+1])) 
           {
               Same_Cards++;
           }
       }
           if(Same_Cards.equals(2)) return true;
    
           return false; 
        }
}

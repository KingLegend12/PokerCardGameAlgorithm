/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.takima.utilities;


public class HelpingUtilities {
    public static String getColor(String input) {
        return input.substring(input.lastIndexOf(" ") + 1);
    }

    public static String getValue(String input) {
        return input.substring(0, input.indexOf(' '));

    }

   
    public static Integer RankOrders(String str) {
        Integer N;
        switch (str) {
            case "High_Card":
                N = 1;
                break;
            case "One_Pair":
                N = 2;
                break;
            case "Two_Pair":
                N = 3;
                break;
            case "Three_Of_A_Kind":
                N = 4;
                break;
            case "Straight":
                N = 5;
                break;
            case "Flush":
                N = 6;
                break;
            case "Full_House":
                N = 7;
                break;
            case "Four_of_a_kind":
                N = 8;
                break;
            case "Straight_Flush":
                N = 9;
                break;
            // Royal flush is the default here
            default:
                N = 10;

        }
        return N;
    }
    
}

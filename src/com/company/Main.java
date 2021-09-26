
//Question: Robots
//There are two kinds of bots A and B in a 1-D array. 'A' bot can only
//move left and while 'B' can only move right. There are also empty spaces
//in between represented by '#'. But it's also given that the bots cannot cross over each other.
//
//Given the initial state and final state, we should tell if the transformation is possible.
//Note: There can be many bots of the same type in a particular array.
//
//Example:-
//Input:
//S1 = #B#A#
//S2 = ##BA#
//Output: Yes
//Explanation: Because we can reach the final state by moving 'B' to the right one step.
//
package com.company;
import java.util.*;
public class Main
{
    public static void main(String [] argh)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter S1 and S2");
        String S1 = Sc.nextLine();
        String S2 = Sc.nextLine();
        String S1Copy="";
        String S2Copy="";
        for(int i = 0; i<S1.length(); i++){
            if(S1.charAt(i) == '#'){
                continue;
            }else{
                S1Copy = S1Copy+S1.charAt(i);
            }
        }
        for(int i = 0; i<S2.length(); i++){
            if(S2.charAt(i) == '#'){
                continue;
            }else{
                S2Copy = S2Copy+S2.charAt(i);
            }
        }
        if(S1Copy.equals(S2Copy)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
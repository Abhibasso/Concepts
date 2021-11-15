package com.practise.strings;

import java.util.HashSet;

//Implement an alogorithm to determine if string has all unique characters. Dont use additional datastructures
//TODO : Visit after bitwise operator
public class Unique {
    boolean uniqueBrute(String a){
        HashSet<Character> characters = new HashSet<>();
        for(int i = 0; i< a. length(); i++){
            if(!characters.contains(a.charAt(i))){
                characters.add(a.charAt(i));
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Unique unique = new Unique();
        System.out.println(unique.uniqueBrute("abc"));
        System.out.println(unique.uniqueBrute("aaa"));
    }
}

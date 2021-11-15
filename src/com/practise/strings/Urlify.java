package com.practise.strings;

import java.util.Arrays;

public class Urlify {
    String urilfy(String s, int truelength){
        char[] chars =  s.toCharArray();
        int count = 0;
        for ( int sp = 0 ; sp < truelength - 1 ; sp++){
            if(chars[sp] == ' '){
                count ++;
            }
        }
        char[] newChar = new char[truelength + count *2 ];
        int i = 0;
        int j = 0;
        while(i < truelength){
            if(chars[i] == ' '){
                newChar[j] = '%';
                newChar[j+1] = '2';
                newChar[j+2] = '0';
                j = j + 3;
            }
            else {
                newChar[j] = chars[i];
                j++;
            }
            i++;
        }
        return String.valueOf(newChar);
    }

    public static void main(String[] args) {
        Urlify urlify = new Urlify();
        System.out.println(urlify.urilfy("Mr John Smith      ",13));
    }
}

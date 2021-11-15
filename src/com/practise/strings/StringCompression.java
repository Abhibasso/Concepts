package com.practise.strings;

import java.util.HashMap;
import java.util.Map;
//aabcccccaaa
//a2b1c5a3
public class StringCompression {

    public String compressedString(String s) {
        //Check uniqueness for
       // aaab = 3
        int compression = 0;
        for (int l = 0; l <= s.length() - 1; l++) {
            int count = 1;
            while (count < s.length() &&  s.charAt(l) == s.charAt(l + 1)) {
                count++;
            }
            l = l + count - 1;
            compression = compression + 1 + String.valueOf(count).length();
        }

       if(compression + 1  < s.length()) {
           int i = 0;
           int k = 0;
           char[] newString = new char[s.length()];
           while (i <= s.length() - 1) { // i = 2, s.length = 4
               int j = i+1; // j = 3
               int count = 1; // count = 1
               char currChar = s.charAt(i); // b
               while(j <= s.length() - 1 && currChar == s.charAt(j)){
                   count ++; //2
                   j++; //4
               }
               newString[k] = Character.forDigit(count,10); //2
               newString[k+1] = currChar; //b
               i = i + count;
               k = k + 2;
           }
           return String.valueOf(newString).trim();
       }
       else {
           return s;
       }
    }

    public static void main(String[] args) {
        StringCompression compression = new StringCompression();
        System.out.println(compression.compressedString("aabbb"));
    }

}

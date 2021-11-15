package com.practise.strings;

public class OneWay {
    public boolean oneWay(String a , String b){
        if(Math.abs(a.length() - b.length()) > 1){
            return false;
        }
        int max = a.length();
        String maxString = a;
        String minString = b;
        if(b.length() > a.length()){
           max = b.length();
           maxString = b;
           minString = a;
        }
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < max - 1){
            if(maxString.charAt(i) != minString.charAt(j)){
                if(maxString.charAt(i+1) == minString.charAt(j)){
                    i = i + 2;
                    continue;
                }
                else{
                    count++;
                }
            }
            if(count > 1){
                return false;
            }
            j++;
            i++;
        }
      return true;
    }

    public static void main(String[] args) {
        OneWay oneWay = new OneWay();
        System.out.println(oneWay.oneWay("pale","ple"));
        System.out.println(oneWay.oneWay("pales","pale"));
        System.out.println(oneWay.oneWay("pale","bale"));
        System.out.println(oneWay.oneWay("pale","bake"));
    }
}

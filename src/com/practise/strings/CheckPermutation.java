package com.practise.strings;

import java.util.Arrays;

public class CheckPermutation {
    boolean checkPermutation(String a, String b){
        int[] flag = new int[128];
        if(a.length() != b.length()){
            return false;
        }
        for (int i = a.length() - 1; i>=0 ; i--){
            int pos = a.charAt(i);
            flag[pos] = flag[pos] + 1;
        }
        for (int i = a.length() - 1; i>=0 ; i--){
            int pos = b.charAt(i);
            flag[pos] = flag[pos] - 1;
            if(flag[pos] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPermutation permutation  = new CheckPermutation();
        System.out.println(permutation.checkPermutation("doog","godo"));
    }
}

package com.company;

class checkPalin{

    String reverse="";
    boolean palin(String x){

        for(int i=x.length()-1;i>=0;--i){
            reverse=reverse + x.charAt(i);
        }

        if(x.equals(reverse))
            return true;
        else
            return false;
    }
}
public class Palindrome {

    public static void main(String[]args){
        checkPalin cp=new checkPalin();
        System.out.println(cp.palin("racecar"));
    }
}

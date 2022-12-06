package com.company;
class reversal{

    String rev(String x){
        String r="";
        for(int i=x.length()-1;i>=0;i--){

            r=r+x.charAt(i);

        }
        return r;
    }

}
public class WordReverse {

    public static void main(String[]args){

        reversal r1=new reversal();
        String s=r1.rev("India is My Country");
        System.out.println(s);
    }
}

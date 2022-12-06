package com.company;

import java.io.*;
import java.util.Scanner;
class Fibonnaci{

    void series(){

        Scanner sc = new Scanner(System.in);
        int n, t1 = 0, t2 = 1, nextTerm;
        System.out.println("Enter the no of Terms \n");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println(t1);

            nextTerm=t1+t2;
            t1=t2;
            t2=nextTerm;
        }
    }
}
public class FibonnaciSeries {

    public static void main(String[]args) {
        Fibonnaci f=new Fibonnaci();
        f.series();
    }
}


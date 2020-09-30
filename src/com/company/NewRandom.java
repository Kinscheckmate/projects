package com.company;

public class NewRandom {

    public static void main(String[] args){
        //double r = Math.random();                     //[0.0,1.0]
        //double r = Math.random() *10;                 //[0.0,9.0]
        //int r = (int)(Math.random() * 10);            //[0, 9]
        //int r = (int)(Math.random() * 10 + 1);          //[1,10]
        //int r = (int)(Math.random() * 11);
        //int r = (int)(Math.random() * 2 + 1);
        //int r = (int)(Math.random() * 12 + 1);\
        int r = (int)((Math.random() * 6 + 1) + (Math.random() * 6 + 1));
        System.out.println(r);

    }
}

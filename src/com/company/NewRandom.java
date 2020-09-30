package com.company;

public class NewRandom {

    public static void main(String[] args){
        //double r = Math.random();                     //[0.0,1.0]
        //double r = Math.random() *10;                 //[0.0,9.0]
        //int r = (int)(Math.random() * 10);            //[0, 9]
        int r = (int)(Math.random() * 10 + 1);          //[1,10]
        System.out.println(r);

    }
}

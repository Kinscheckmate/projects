package com.company;

public class MathEx {

    public static int digitSwapper(int input)
    {
        int tens = (input%100/10);
        int ones = (input%10/1);
        int hundreds = (input-(ones+tens*10));
        int result = (hundreds+ones*10+tens);
        return result;
    }

    public static void timeLeft(int currHour, int currMin, int depHour, int depMin)
    {
        int hour = (depHour - currHour);
        int hourinmin = (hour*60);
        int min = (depMin-currMin);
        int totaltime = (hourinmin+min);
        int waithour = (totaltime/60);
        int waitmin = (totaltime%60);
        System.out.println("You will have to wait " + waithour + " hours and " + waitmin + " minutes." );
    }
    public static int dayOfWeek(int daysOfWeek1, int day)
    {
        int result = (daysOfWeek1+day-1)%7;
        return result;
    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input = 123;
        int output = digitSwapper(input);
        System.out.println(input +" " + output);

        input = 6;
        output = digitSwapper(input);
        System.out.println(input +" " + output);

        input = 381;
        output = digitSwapper(input);
        System.out.println(input +" " + output);

        timeLeft(1,34, 8, 20);
        timeLeft(1,15, 4, 36);

        System.out.println(dayOfWeek(0,1));
        System.out.println(dayOfWeek(0,14));
        System.out.println(dayOfWeek(6, 22));
        System.out.println(dayOfWeek(5, 4));
        System.out.println(dayOfWeek(1,24));
        System.out.println(dayOfWeek(2,1));

    }

}

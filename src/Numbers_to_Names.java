/*
 *  UCF COP3330 Fall 2021 Assignment 1.21 Solution
 *  Copyright 2021 Ronald Lemus
 */



import java.util.Scanner;

public class Numbers_to_Names {
    public static void main(String [] arg){
        System.out.print("Please enter the number of the month: ");
        Scanner monthInp = new Scanner(System.in);
        int month = monthInp.nextInt();
        String monthName = ("month");

        switch (month){
            case 1: monthName = "January";
            break;
            case 2: monthName = "February";
            break;
            case 3: monthName = "March";
            break;
            case 4: monthName = "April";
            break;
            case 5: monthName = "May";
            break;
            case 6: monthName = "June";
            break;
            case 7: monthName = "July";
            break;
            case 8: monthName = "August";
            break;
            case 9: monthName = "September";
            break;
            case 10: monthName = "October";
            break;
            case 11: monthName = "November";
            break;
            case 12: monthName = "December";
            break;

        }
        System.out.printf("The name of the month is %s.", monthName);

}}


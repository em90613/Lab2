

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int userNum;
        String userName;


        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        userName = scnr.nextLine();

        System.out.println("Hey " + userName + ", please enter a number from 1 to 100.");
        userNum = scnr.nextInt();
        while (userNum > 100 | userNum < 1) {
            System.out.println("Please enter a number between 1 and 100: ");
            userNum = scnr.nextInt();
        }

        if ((userNum % 2) != 0 & userNum < 60) {
            System.out.println(userName + ", your number is odd.");
        }

        else if ((userNum % 2) == 0 & userNum >= 2 & userNum <= 25) {
            System.out.println(userName + ", your number is even and less than 25.");
        }

        else if ((userNum % 2) == 0 & userNum >=26 & userNum <= 60) {
            System.out.println(userName + ", your number is even.");
        }

        else if ((userNum % 2) == 0 & userNum > 60) {
            System.out.println(userName + ", your number is even and over 60.");
        }

        else if ((userNum % 2) != 0 & userNum > 60) {
            System.out.println(userName + ", your number is odd and over 60.");
        }

        System.out.println("");
        System.out.println("Goodbye.");













    }








}

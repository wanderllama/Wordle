package wordle;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> index = new ArrayList<>();

        String apb0 = "abcdefghijklmnopqrstuvwxyz";
        String apb1 = "abcdefghijklmnopqrstuvwxyz";
        String apb2 = "abcdefghijklmnopqrstuvwxyz";
        String apb3 = "abcdefghijklmnopqrstuvwxyz";
        String apb4 = "abcdefghijklmnopqrstuvwxyz";

        index.add(apb0);
        index.add(apb1);
        index.add(apb2);
        index.add(apb3);
        index.add(apb3);
        index.add(apb4);

        Pattern ptn = Pattern.compile("[" + apb0 + "]" + "[" + apb1 + "]" + "[" + apb2 + "]" + "[" + apb3 + "]" + "[" + apb4 + "]");

        char option = 'r';

        while(option != x) {
            System.out.println("did you guess letter in correct spot: Y/N\nEnter 'x' to exit");
            String in = input.nextLine().trim().toLowerCase();
            if (in.equals("y")) {
                System.out.println("enter the letter");
                String letter = input.nextLine();

                System.out.println("enter index of letter");
                int pos = input.nextInt();

                switch (pos) {
                    case 0:
                        apb0 = apb0.replace(letter , "");
                        break;
                    case 1:
                        apb1 = apb1.replace(letter , "");
                        break;
                    case 2:
                        apb2 = apb2.replace(letter , "");
                        break;
                    case 3:
                        apb3 = apb3.replace(letter , "");
                        break;
                    case 4:
                        apb4 = apb4.replace(letter , "");
                        break;
                }

                Dictionary.dictionary(ptn);
            }




        }
    }
}

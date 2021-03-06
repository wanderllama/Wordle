
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

        System.out.println(index);

        int count = 5;

        while(count-- > 0) {
            //ask user to enter if they guessed letter in correct spot
            System.out.println("did you guess letter in correct spot: Y/N\nEnter 'x' to exit");
            String in = input.nextLine().trim().toLowerCase();
            //if user guessed letter in correct spot
                //ask how many letters in correct spot and  what index
            if (in.equals("y")) {
                System.out.println("how many did you get correct?");
                int correct = input.nextInt();
                input.nextLine();
                while (correct-- > 0) {
                    System.out.println("enter the letter");
                    String letter = input.nextLine();

                    System.out.println("enter index of letter");
                    int pos = input.nextInt();
                    input.nextLine();

                    //replace apb's string with only the letter so regex will search only for words with that letter in that index
                    switch (pos) {
                        case 0:
                            apb0 = letter;
                            break;
                        case 1:
                            apb1 = letter;
                            break;
                        case 2:
                            apb2 = letter;
                            break;
                        case 3:
                            apb3 =letter;
                            break;
                        case 4:
                            apb4 = letter;
                            break;
                    }
                }
            }
            //ask user how many letters to remove from each apb to search only for words that dont include them
            System.out.println("how many letters did you guess that are not included in the word\nenter '-1' to exit");
            int notCorrect = input.nextInt();
            input.nextLine();
            if (notCorrect == -1) {
                break;
            }
            //create arraylist to store these letters
            ArrayList<String> notCorrectList = new ArrayList<>();
            //get user input until and add to list untill all invalid letters are collected
            while(notCorrect-- > 0) {
                System.out.println("enter letter not correct");
                String letterNot = input.nextLine();
                notCorrectList.add(letterNot);
            }
            //remove each letter from variables used to construct the regex
            for (String element : notCorrectList) {
                apb0 = apb0.replace(element, "");
                apb1 = apb1.replace(element, "");
                apb2 = apb2.replace(element, "");
                apb3 = apb3.replace(element, "");
                apb4 = apb4.replace(element, "");
            }

            //need to write code that will accept user input for letters guessed correctly but in wrong spot
            //remove the letter from apb's corresponding index so regex changes and doesn't return any words that have the letter in the specified index
            System.out.println("enter how many letters were correct but in wrong index\nenter '-1' to exit");
            int wrongIndexCount = input.nextInt();
            input.nextLine();
            if (wrongIndexCount == -1) {
                break;
            }
            while (wrongIndexCount-- > 0) {
                System.out.println("Enter the letter");
                String correctWrongIndex = input.nextLine();

                System.out.println("enter index you guess it was at");
                int indexOfGuess = input.nextInt();
                input.nextLine();

                switch (indexOfGuess) {
                    case 0:
                        apb0 = apb0.replace(correctWrongIndex , "");
                        break;
                    case 1:
                        apb1 = apb1.replace(correctWrongIndex , "");
                        break;
                    case 2:
                        apb2 = apb2.replace(correctWrongIndex , "");
                        break;
                    case 3:
                        apb3 = apb3.replace(correctWrongIndex , "");
                        break;
                    case 4:
                        apb4 = apb4.replace(correctWrongIndex , "");
                        break;
                }
            }
            Pattern ptn = Pattern.compile("[" + apb0 + "]" + "[" + apb1 + "]" + "[" + apb2 + "]" + "[" + apb3 + "]" + "[" + apb4 + "]");
            //run dictionary search using new regex against a single string of all these words
            Dictionary.dictionaryCheck(ptn);
        }
    }
}


package wordle;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dictionary {

    public static void dictionary(Pattern ptn) {

//dont touch start
        try {
//dont touch stop
            //next line will read first line and assign it to a variable and then run the code. reads next line and assigns it to same variable and runs code
            FileInputStream fis = new FileInputStream("C:\\Users\\Jawal\\OneDrive\\Desktop\\CYDEO\\demo.txt"); //enter file path for txt file between " "
//dont touch start
            Scanner sc = new Scanner(fis);

            while (sc.hasNextLine()) { //code goes in this while loop
//dont touch stop
                //enter code below. variable that gets assigned use sc.nextLine() as seen in next line
                String strIn = sc.nextLine();      //assign lines from text file to variable


                //code to be tested below
                Matcher matcher = ptn.matcher(strIn);
                System.out.println(strIn);


//end of test code
//dont touch below
            }
            sc.close();     //closes the scanner
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


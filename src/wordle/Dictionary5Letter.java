package wordle;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Dictionary5Letter {

    public static void main(String[] args) {

        try {
//dont touch stop
            //next line will read first line and assign it to a variable and then run the code. reads next line and assigns it to same variable and runs code
            FileInputStream fis = new FileInputStream("C:\\Users\\Jawal\\OneDrive\\Desktop\\CYDEO\\dicend2.txt"); //enter file path for txt file between " "
//dont touch start
            Scanner sc = new Scanner(fis);

            while (sc.hasNextLine()) { //code goes in this while loop
//dont touch stop
                //enter code below. variable that gets assigned use sc.nextLine() as seen in next line
                String strIn = sc.nextLine().trim().toLowerCase();      //assign lines from text file to variable

                //add words that satisfy these conditions to new dictionary file
                //original file had words that contained these invalid characters and i only want to add words of length five
                if (!strIn.contains("/") && !strIn.contains("-") && !strIn.contains(".") && !strIn.contains(",") && !strIn.contains("'") && strIn.length() == 5) {

                    //output file path
                    Path filePath = Paths.get("C:\\Users\\Jawal\\OneDrive\\Desktop\\CYDEO\\dicend.txt");
                    try {
                        //Write content to file
                        Files.writeString(filePath, strIn, StandardOpenOption.APPEND);
                        Files.writeString(filePath, "\n", StandardOpenOption.APPEND);

                        //Verify file content
                        String content = Files.readString(filePath);

                        System.out.println(content);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

//end of test code
//dont touch below
            }
            sc.close();     //closes the scanner
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

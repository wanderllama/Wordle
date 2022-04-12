package wordle;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {

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


    }
}

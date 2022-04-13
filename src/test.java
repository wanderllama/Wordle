import wordle.Dictionary;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {

        ArrayList<String> index = new ArrayList<>();

        String apb0 = "abc";
        String apb1 = "st";
        String apb2 = "st";
        String apb3 = "aeinopqrstuvwxyz";
        String apb4 = "abcdefghijklmnopqrstuvwxyz";

        index.add(apb0);
        index.add(apb1);
        index.add(apb2);
        index.add(apb3);
        index.add(apb3);
        index.add(apb4);

        Pattern ptn = Pattern.compile("[" + apb0 + "]" + "[" + apb1 + "]" + "[" + apb2 + "]" + "[" + apb3 + "]" + "[" + apb4 + "]");


        Dictionary.dictionaryCheck(ptn);
    }
}

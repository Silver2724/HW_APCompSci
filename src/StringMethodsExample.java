import java.util.ArrayList;

public class StringMethodsExample {
    public static void main(String[] args) {
        abcTest("a.abc"); // should return false
        abcTest("abc.123"); // should return true

        alternateStrings("abc", "xyz");   // -> "axbycz"
        alternateStrings("Hi", "There");  // -> "HTihere"
        alternateStrings("xxxx", "Thereee"); // -> "xTxhxexreee"
        alternateStrings("Thereee", "xxxx"); // -> "Txhxexrxeee"
    }

    public static boolean abcTest (String testForabcWithoutDotBefore) {
        for(int i = 0; i < testForabcWithoutDotBefore.length(); i++) {
            if (testForabcWithoutDotBefore.contains(".abc")) {
                System.out.println("FALSE");
                return false;
            }
        }
        System.out.println("TRUE");
        return true;
    }


    public static String alternateStrings(String alternatingLettersOfTwoStrings1, String alternatingLettersOfTwoStrings2 ) {
        String output = "";
        String newWord;
        if(alternatingLettersOfTwoStrings1.length() > alternatingLettersOfTwoStrings2.length()){
            newWord = alternatingLettersOfTwoStrings1;
        } else {
            newWord = alternatingLettersOfTwoStrings2;
        }
        for (int i = 0; i < newWord.length(); i++){
            if(alternatingLettersOfTwoStrings1.length() > i){
                output += alternatingLettersOfTwoStrings1.substring(i, i + 1);
            }

            if(alternatingLettersOfTwoStrings2.length() > i){
                output += alternatingLettersOfTwoStrings2.substring(i, i + 1);
            }
        }
        System.out.println(output);
        return output;
    }
}






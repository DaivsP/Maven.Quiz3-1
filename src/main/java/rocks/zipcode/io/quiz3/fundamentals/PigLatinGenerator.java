package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] split = str.split(" ");
        String answer = "";
        for (String string: split) {
            if (VowelUtils.startsWithVowel(string)){
                answer += singleWordStartsWithVowel(str);
            }
            else if (!VowelUtils.startsWithVowel(string)){
                answer += singleWordDoesNotStartWithVowel(str);
            }
        }
        return answer;
    }

    private String singleWordStartsWithVowel(String str) {
        if (VowelUtils.startsWithVowel(str)){
            str = str + "way";
        }
        return str;
    }

    public String singleWordDoesNotStartWithVowel(String str){
        String answer = "";
        if (!VowelUtils.startsWithVowel(str)){
            String substring1 = str.substring(VowelUtils.getIndexOfFirstVowel(str));
            String subString2 = str.substring(0, VowelUtils.getIndexOfFirstVowel(str));
            answer = substring1 + subString2 + "ay";
        }
        if (!VowelUtils.hasVowels(str)){
            answer = str + "ay";
        }
        return answer;
    }
}

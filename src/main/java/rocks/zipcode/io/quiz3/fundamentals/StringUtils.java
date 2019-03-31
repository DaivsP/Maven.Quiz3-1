package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String firstHalf = str.substring(0,indexToCapitalize);
        String letterToCapitalize = str.substring(indexToCapitalize, indexToCapitalize + 1);
        String secondHalf = str.substring(indexToCapitalize + 1);
        return firstHalf + letterToCapitalize.toUpperCase() + secondHalf;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
//        String substring = baseString.substring(indexOfString, indexOfString + 1);
////        String character = characterToCheckFor.toString();
////        if (substring.equals(character)){
////            return true;
////        }
////        return false;
        return characterToCheckFor.equals(baseString.charAt(indexOfString));
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> answer = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                answer.add(string.substring(i, j));
            }
        }
        return answer.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
//        Integer counter = 0;
//        Set<String> answer = new HashSet<>();
//        for (int i = 0; i < input.length(); i++) {
//            for (int j = i + 1; j <= input.length(); j++) {
//                answer.add(input.substring(i, j));
//            }
//        }
//        return answer.size();
        return getAllSubStrings(input).length;
    }
}

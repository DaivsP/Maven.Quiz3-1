package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        Boolean answer = false;
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) == 'a') ||
                    (word.charAt(i) == 'e') ||
                    (word.charAt(i) == 'i') ||
                    (word.charAt(i) == 'o') ||
                    (word.charAt(i) == 'u')) {
                answer = true;
            }
        }
        return answer;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(String.valueOf(word.charAt(i)))) {
                return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        String firstLetter = word.substring(0, 1);
        return getVowel(firstLetter);
    }

    public static Boolean isVowel(Character character) {
        String characterToString = character.toString();
        return getVowel(characterToString);
    }

    private static Boolean getVowel(String characterToString) {
        if (characterToString.equalsIgnoreCase("a") ||
                characterToString.equalsIgnoreCase("e") ||
                characterToString.equalsIgnoreCase("i") ||
                characterToString.equalsIgnoreCase("o") ||
                characterToString.equalsIgnoreCase("u")){
            return true;
        }
        else {
            return false;
        }
    }
}

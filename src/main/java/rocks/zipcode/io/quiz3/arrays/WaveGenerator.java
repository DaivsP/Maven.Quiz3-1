package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        List<String> answer = new ArrayList<>();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                answer.add(StringUtils.capitalizeNthCharacter(str, i));
            }
        }
        return answer.toArray(new String[0]);
    }
}
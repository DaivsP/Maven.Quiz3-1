package rocks.zipcode.io.quiz3.generics;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (Object object : array) {
            if (getNumberOfOccurrences((SomeType) object) % 2 != 0){
                return (SomeType) object;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (Object object : array) {
            if (getNumberOfOccurrences((SomeType) object) % 2 == 0){
                return (SomeType) object;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer counter = 0;
        for (Object object : array) {
            if (object.equals(valueToEvaluate)){
                counter++;
            }
        }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}

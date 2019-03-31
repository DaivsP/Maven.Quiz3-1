package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
//        for (SomeType object : array) {
////            if (getNumberOfOccurrences(object) % 2 != 0){
////                return object;
////            }
////        }
////        return null;
        return filter((SomeType element) -> getNumberOfOccurrences(element) % 2 != 0)[0];
    }

    public SomeType findEvenOccurringValue() {
//        for (SomeType object : array) {
//            if (getNumberOfOccurrences(object) % 2 == 0){
//                return object;
//            }
//        }
//        return null;
        return filter((SomeType element) -> getNumberOfOccurrences(element) % 2 == 0)[0];
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
//        Integer counter = 0;
//        for (Object object : array) {
//            if (object.equals(valueToEvaluate)){
//                counter++;
//            }
//        }
//        return counter;
        return Collections.frequency(Arrays.asList(array), valueToEvaluate);
    }


    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> list = Stream
                .of(array)
                .filter((SomeType element) -> predicate.apply(element))
                .collect(Collectors.toList());

        int arrayLength = list.size();
        Class<?> arrayClass = array.getClass().getComponentType();
        Object newArrayInstanceAsObject = Array.newInstance(arrayClass, arrayLength);
        SomeType[] newArrayInstanceAsSomeType = (SomeType[]) newArrayInstanceAsObject;
        SomeType[] populatedArray = list.toArray(newArrayInstanceAsSomeType);
        return populatedArray;
    }
}
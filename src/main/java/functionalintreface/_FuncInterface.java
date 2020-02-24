package functionalintreface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _FuncInterface {
    public static void main(String[] args) {
        //Function 1 argument and produce 1 result
        //int res = increment(3);
        // System.out.println(res);

        int incremRes = integerByOneFunction.apply(6);
        System.out.println(incremRes);

        int multiplyRes = multiplyByOneFunction.apply(incremRes);
        System.out.println(multiplyRes);

        Function<Integer, Integer> addByOneAndThenMultiply = integerByOneFunction.andThen(multiplyByOneFunction);
        System.out.println(addByOneAndThenMultiply.apply(2));

        //Function 2 argument and produce 1 result
        System.out.println(biFunctionPlusAndMultiply.apply(8, 100));


    }

    static Function<Integer, Integer> integerByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyByOneFunction = number -> number * 10;

    static int increment(int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> biFunctionPlusAndMultiply =
            (numberByIncrementByOne, numberByMultiply) -> (numberByIncrementByOne + 1) * numberByMultiply;

    static int incrementPlusByOneAndMultiply(int number, int multiply) {
        return (number + 1) * multiply;
    }
}

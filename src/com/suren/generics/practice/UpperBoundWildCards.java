package com.suren.generics.practice;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Surendirababu Janarthanan on 6/24/2017.
 */
public class UpperBoundWildCards {

    public static void main(String a[])
    {

        List<Integer> integerList = Arrays.asList(1,2,3);
        System.out.println("sum = " + sumOfList(integerList));

        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + sumOfList(ld));

    }

    /*Upper bound is the Number class and the lower bound is the child class of the Number i.e Integer,Double.
     *Since you have defined your upper bound , it is known as upper bound wildcard
     */
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }


}

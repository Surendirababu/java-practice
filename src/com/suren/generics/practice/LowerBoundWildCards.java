package com.suren.generics.practice;

import javax.jnlp.IntegrationService;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Surendirababu Janarthanan on 6/24/2017.
 */
public class LowerBoundWildCards {
    public static void main(String a[]) {

        List<Integer> integerList = new CopyOnWriteArrayList<>(Arrays.asList(90, 91, 92));
        List<? super Integer> returnList = sumOfList(integerList);
        returnList.stream().forEach(ino -> System.out.println(ino.toString()));


    }
    /*Lower bound is the Integer class and the upper bound is the parent classes of the Integer i.e Number,Object.
     *Since you have defined your lower bound , it is known as Lower bound wildcard
     */
    public static List<? super Integer> sumOfList(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        return list;
    }

}

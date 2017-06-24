package com.suren.generics.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Surendirababu Janarthanan on 6/24/2017.
 */
public class BoxMain {

    public static void main(String a[]) {

    Box<Number> integerBox = new Box<Number>();
    integerBox.set(new Integer(10));
    Box<Number> doubleBox = new Box<Number>();
    doubleBox.set(new Double(28));

    List<Box<Number>> boxList = new ArrayList<>();
    boxList.add(integerBox);
    boxList.add(doubleBox);

    boxList.stream().forEach(numberBox -> System.out.println(numberBox.get()));

    }

}

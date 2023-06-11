package ru.geekbrains.lesson4;

public class ArrayUtils {

    public static Object[] replaceTwoElements(Object[] array, int index1, int index2){
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length)
            throw new IndexOutOfBoundsException();
        Object[] buffArray = array.clone();
        Object buffElement = buffArray[index1];
        buffArray[index1] = buffArray[index2];
        buffArray[index2] = buffElement;
        return buffArray;

    }

    public static <T> T[] replaceTwoElementsV2(T[] array, int index1, int index2){
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length)
            throw new IndexOutOfBoundsException();
        T[] buffArray = array.clone();
        T buffElement = buffArray[index1];
        buffArray[index1] = buffArray[index2];
        buffArray[index2] = buffElement;
        return buffArray;

    }

}

package com.chanse.code.arrays_as_list;

import java.util.AbstractList;

public class ArrayUtil {

    public static <T> ArrayList<T> asList(T... elements) {
        return new ArrayList<>(elements);
    }

    private static class ArrayList<E> extends AbstractList<E> {

        private final E[] arr;

        ArrayList(E[] arr) {
            this.arr = arr;
        }

        @Override
        public E get(int index) {
            return arr[index];
        }

        @Override
        public E set(int index, E element) {
            E old = arr[index];
            arr[index] = element;
            return old;
        }

        @Override
        public int size() {
            return arr.length;
        }
    }
}

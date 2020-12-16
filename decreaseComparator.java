package com.bsu;

import java.util.Comparator;

public class decreaseComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
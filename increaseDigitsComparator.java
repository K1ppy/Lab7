package com.bsu;

import java.util.Comparator;

public class increaseDigitsComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        int some  = Integer.compare(o1.toString().length(), o2.toString().length());
        if(some == 0){
            return o1.compareTo(o2);
        }
        else return some;
    }
}
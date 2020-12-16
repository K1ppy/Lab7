package com.bsu;

import java.util.Comparator;

public class decreaseDigitsComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        int some  = Integer.compare(o2.toString().length(), o1.toString().length());
        if(some == 0){
            return o2.compareTo(o1);
        }
        else return some;
    }
}
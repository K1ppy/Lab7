package com.bsu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyThread extends Thread{
    private int sortWay;
    List<Integer> sortMas = new ArrayList<>();
    MyThread(int a,int[] b){
        sortWay = a;
        for(int i = 0;i<b.length;i++){
            sortMas.add(b[i]);
        }
    }
    public void run(){
        switch (sortWay) {
            case 0:
                sortMas = sortMas.stream()
                        .sorted(new increaseComparator()).collect((Collectors.toList()));
                break;
            case 1:
                sortMas = sortMas.stream().sorted(new decreaseComparator()).collect(Collectors.toList());
                break;
            case 2:
                sortMas = sortMas.stream().sorted(new increaseDigitsComparator()).collect(Collectors.toList());
                break;
            case 3:
                sortMas = sortMas.stream().sorted(new decreaseDigitsComparator()).collect(Collectors.toList());
                break;
        }
    }

    public List<Integer> getSortMas() {
        return sortMas;
    }
}

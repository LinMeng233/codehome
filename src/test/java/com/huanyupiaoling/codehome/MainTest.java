package com.huanyupiaoling.codehome;



import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class MainTest {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(10);
        for (Integer integer : list) {
            if (null != integer) {
                System.out.println(integer);
            }
        }

    }
}

package com.kodilla.testing;

import com.kodilla.testing.forum.statistics.StatisticsForum;
import com.kodilla.testing.forum.statistics.StatisticsImpl;

public class TestingMain {
    public static void main(String[] args) {
        int abc = 5;
        String test = "asdasdas";

        for (int i = 0; i < 5; i++) {
            abc += i;
        }

        System.out.println(abc);
    }
}

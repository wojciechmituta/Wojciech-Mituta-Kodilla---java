package com.kodilla.patterns.hashmapy;

import java.time.LocalTime;
import java.util.LinkedList;

public class Clock {
    private LocalTime time;

    public Clock(LocalTime time) {
        this.time = time;
    }

    public LocalTime getTime() {
        return time;
    }

    public String toString() {
        return "The time is: " + time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}

class Program {
    public static void main(String[] args) throws java.lang.Exception {
        Clock clock1 = new Clock(LocalTime.of(12, 0));
        Clock clock2 = new Clock(LocalTime.of(13, 0));
        Clock clock3 = new Clock(LocalTime.of(14, 0));
        Clock clock4 = new Clock(LocalTime.of(16, 0));

        LinkedList<Clock> clockList = new LinkedList<Clock>();

        clockList.add(clock1);
        clockList.add(clock2);
        clockList.add(clock3);
        clockList.add(clock4);

        for (int i = 0; i < clockList.size(); i++) {
            clockList.get(i).setTime(clockList.get(i).getTime().plusMinutes(1));
            System.out.println(clockList.get(i));

        }
    }
}

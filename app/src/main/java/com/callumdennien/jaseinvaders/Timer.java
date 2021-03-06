package com.callumdennien.jaseinvaders;

import androidx.annotation.NonNull;

public class Timer {
    private int seconds;

    Timer() {
        seconds = 0;
    }

    void tick() {
        ++seconds;
    }

    @NonNull
    @Override
    public String toString() {
        return seconds + " Seconds";
    }

    public int getScore() {
        return seconds;
    }

    public void set(int i) {
        seconds = i;
    }
}

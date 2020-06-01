package com.example.fivequestswithoop.message.request;

import org.springframework.web.bind.annotation.RequestBody;

public class FindFirst {
    private String[] Name;
    private int[] time;

    public FindFirst() {
    }

    public FindFirst(String[] name, int[] time) {
        Name = name;
        this.time = time;
    }

    public String[] getName() {
        return Name;
    }

    public void setName(String[] name) {
        Name = name;
    }

    public int[] getTime() {
        return time;
    }

    public void setTime(int[] time) {
        this.time = time;
    }
}

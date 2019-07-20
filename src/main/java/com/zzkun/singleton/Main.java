package com.zzkun.singleton;

import com.zzkun.singleton.dev1.Emperor;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; ++i) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}

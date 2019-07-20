package com.zzkun.singleton.dev2;

/**
 * 懒汉式单利实现
 */
public class Emperor {

    private static Emperor instance = null;

    private Emperor() {

    }

    public static Emperor getInstance() {
        if (instance == null) {
            instance = new Emperor();
        }
        return instance;
    }

    public void say() {
        System.out.println("我就是皇帝某某某...");
    }
}

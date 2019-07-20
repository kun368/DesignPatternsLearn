package com.zzkun.singleton.dev1;

/**
 * 最普通的模式，饿汉式单利实现
 */
public class Emperor {

    private static final Emperor instance = new Emperor();

    private Emperor() {

    }

    public static Emperor getInstance() {
        return instance;
    }

    public void say() {
        System.out.println("我就是皇帝某某某...");
    }
}

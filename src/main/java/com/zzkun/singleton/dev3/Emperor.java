package com.zzkun.singleton.dev3;

/**
 * 内部类实现方式
 */
public class Emperor {

    private Emperor() {

    }

    private static class Holder {
        private static final Emperor emperor = new Emperor();
    }

    public static Emperor getInstance() {
        return Holder.emperor;
    }

    public void say() {
        System.out.println("我就是皇帝某某某...");
    }
}

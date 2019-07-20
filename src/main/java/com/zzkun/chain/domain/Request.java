package com.zzkun.chain.domain;


public class Request {

    private int level;

    private String content;

    public Request(int level, String content) {
        this.level = level;
        this.content = content;
    }

    public int getLevel() {
        return level;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Request{" +
                "level=" + level +
                ", content='" + content + '\'' +
                '}';
    }
}

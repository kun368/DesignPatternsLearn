package com.zzkun.chain.domain;

public class Response {

    private String content;

    public Response(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Response{" +
                "content='" + content + '\'' +
                '}';
    }
}

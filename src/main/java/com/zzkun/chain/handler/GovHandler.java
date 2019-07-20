package com.zzkun.chain.handler;

import com.zzkun.chain.domain.Request;
import com.zzkun.chain.domain.Response;

public abstract class GovHandler {

    private GovHandler nextHandler;

    protected GovHandler(GovHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final Response run(Request request) {
        if (canHandle(request)) {
            return handle(request);
        } else if (nextHandler != null) {
            return nextHandler.run(request);
        }
        return new Response("您的请求市长省长部长都搞不定...");
    }

    protected abstract boolean canHandle(Request request);

    protected abstract Response handle(Request request);
}

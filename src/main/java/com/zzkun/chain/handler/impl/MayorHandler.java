package com.zzkun.chain.handler.impl;

import cn.hutool.core.util.RandomUtil;
import com.zzkun.chain.domain.Request;
import com.zzkun.chain.domain.Response;
import com.zzkun.chain.handler.GovHandler;

/**
 * 市长处理器
 */
public class MayorHandler extends GovHandler {

    public MayorHandler(GovHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected boolean canHandle(Request request) {
        return request.getLevel() <= 10;
    }

    @Override
    protected Response handle(Request request) {
        String content = "市长处理您的请求：+ " + request.getContent() + ", 结果为：" + (RandomUtil.randomBoolean() ? "同意" : "拒绝");
        return new Response(content);
    }
}

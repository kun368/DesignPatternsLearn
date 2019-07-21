package com.zzkun.visitor.domain;

import com.zzkun.visitor.visitor.ICashMarketVisitor;
import lombok.Getter;
import lombok.Setter;

/**
 * 货币
 */
@Getter
@Setter
public class Cash {

    /**
     * 标志
     */
    private String code;

    /**
     * 开始流通的年份
     */
    private long startYear;

    /**
     * 现价，对美元汇率
     */
    private double currentPrice;

    /**
     * 一周的汇率变化
     */
    private double priceChangeWeek;

    public double accept(ICashMarketVisitor visitor) {
        return visitor.visit(this);
    }
}

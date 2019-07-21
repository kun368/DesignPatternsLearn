package com.zzkun.visitor.domain;

import com.zzkun.visitor.visitor.ICashMarketVisitor;
import lombok.Getter;
import lombok.Setter;

/**
 * 数字货币
 */
@Getter
@Setter
public class DigitalCash extends Cash {

    /**
     * 一周交易量
     */
    private double getTradingVolumeWeek;

    @Override
    public double accept(ICashMarketVisitor visitor) {
        return visitor.visit(this);
    }
}

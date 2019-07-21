package com.zzkun.visitor.domain;

import com.zzkun.visitor.visitor.ICashMarketVisitor;
import lombok.Getter;
import lombok.Setter;

/**
 * 主板虚拟货币
 */
@Getter
@Setter
public class MainDigitalCash extends DigitalCash {

    @Override
    public double accept(ICashMarketVisitor visitor) {
        return visitor.visit(this);
    }
}

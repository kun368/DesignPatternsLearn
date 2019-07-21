package com.zzkun.visitor.visitor;

import com.zzkun.visitor.domain.Cash;
import com.zzkun.visitor.domain.DigitalCash;
import com.zzkun.visitor.domain.MainDigitalCash;

public class CashMarketVisitor implements ICashMarketVisitor {

    public double visit(Cash cash) {
        System.out.println("CashMarketVisitor.visit(Cash cash)");
        return cash.getPriceChangeWeek();
    }

    public double visit(DigitalCash cash) {
        System.out.println("CashMarketVisitor.visit(DigitalCash cash)");
        return cash.getPriceChangeWeek() * Math.log10(10 + cash.getGetTradingVolumeWeek());
    }

    public double visit(MainDigitalCash cash) {
        System.out.println("CashMarketVisitor.visit(CashMarketVisitor.visit)");
        return cash.getPriceChangeWeek() * Math.log10(10 + cash.getGetTradingVolumeWeek()) + 10;
    }
}

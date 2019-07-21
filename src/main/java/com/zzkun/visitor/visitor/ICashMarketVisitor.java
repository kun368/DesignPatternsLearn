package com.zzkun.visitor.visitor;

import com.zzkun.visitor.domain.Cash;
import com.zzkun.visitor.domain.DigitalCash;
import com.zzkun.visitor.domain.MainDigitalCash;

public interface ICashMarketVisitor {

    double visit(Cash cash);

    double visit(DigitalCash cash);

    double visit(MainDigitalCash cash);
}

package com.iiht.fsd04.model.report;

public class DeductionRow extends Row {

    @Override
    public Object[] getRepresentation() {
        return new Object[]{
                this.getYear(), formatMoney(this.getSalary()), this.getTimes(), this.getPercent(), formatMoney(this.getAmount())
        };
    }
}

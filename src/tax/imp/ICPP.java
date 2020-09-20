package tax.imp;

import model.Budget;

public class ICPP extends ConditionalTaxTemplate {

    @Override
    public double minimumRate(Budget budget) {
        return  budget.getValue() * 0.07;
    }

    @Override
    public double maximumRate(Budget budget) {
        return  budget.getValue() * 0.05;
    }

    @Override
    public boolean mustUseTheMaximumRate(Budget budget) {
        return budget.getValue() > 500;
    }
}

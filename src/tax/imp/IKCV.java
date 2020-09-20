package tax.imp;

import model.Budget;

public class IKCV extends ConditionalTaxTemplate {


    private boolean haveAnyItemGreaterThanOneGundredCash(Budget budget) {
        return budget.getItems()
                .stream()
                .anyMatch(item -> item.getValue() > 100);

    }

    @Override
    public double minimumRate(Budget budget) {
        return budget.getValue() * 0.06;
    }

    @Override
    public double maximumRate(Budget budget) {
        return budget.getValue() * 0.1;
    }

    @Override
    public boolean mustUseTheMaximumRate(Budget budget) {
        return budget.getValue() > 500 && haveAnyItemGreaterThanOneGundredCash(budget);
    }
}

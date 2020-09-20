package tax.imp;

import model.Budget;
import tax.Tax;

public abstract class ConditionalTaxTemplate implements Tax {
    @Override
    public double calculate(Budget budget) {
        if (mustUseTheMaximumRate(budget)) {
            return maximumRate(budget);
        }else {
            return minimumRate(budget);
        }
    }

    public abstract double minimumRate(Budget budget);

    public abstract  double maximumRate(Budget budget);

    public abstract  boolean mustUseTheMaximumRate(Budget budget);
}

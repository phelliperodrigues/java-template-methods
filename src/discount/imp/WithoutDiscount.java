package discount.imp;

import discount.Discount;
import model.Budget;

public class WithoutDiscount implements Discount {
    @Override
    public double calculate(Budget budget) {
        return 0;
    }

    @Override
    public void nextDiscount(Discount discount) {

    }
}

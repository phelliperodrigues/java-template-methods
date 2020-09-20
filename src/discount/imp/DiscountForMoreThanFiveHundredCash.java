package discount.imp;

import discount.Discount;
import model.Budget;

public class DiscountForMoreThanFiveHundredCash  implements Discount {

    private Discount next;

    public double calculate(Budget budget){
        return budget.getValue() > 500?
                budget.getValue() * 0.07 :
                next.calculate(budget);
    }

    @Override
    public void nextDiscount(Discount discount) {
        this.next = discount;
    }
}

package calculator;

import discount.Discount;
import discount.imp.DiscountDorFiveItems;
import discount.imp.DiscountForMoreThanFiveHundredCash;
import discount.imp.WithoutDiscount;
import model.Budget;

public class CalculatorDiscount {

    public double calculate(Budget budget){
        Discount d1 = new DiscountDorFiveItems();
        Discount d2 = new DiscountForMoreThanFiveHundredCash();
        Discount d3 = new WithoutDiscount();

        d1.nextDiscount(d2);
        d2.nextDiscount(d3);

        return d1.calculate(budget);
    }
}

package discount.imp;

import discount.Discount;
import model.Budget;

public class DiscountDorFiveItems implements Discount {

    private Discount next;

    public double calculate(Budget budget){
       return  budget.getItems().size() > 5 ? budget.getValue() * 0.1 :
             next.calculate(budget);
    }

    @Override
    public void nextDiscount(Discount discount) {

        this.next = discount;
    }
}

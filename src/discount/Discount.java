package discount;

import model.Budget;

public interface Discount {

    double calculate(Budget budget);

    void nextDiscount(Discount discount);

}

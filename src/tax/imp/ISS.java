package tax.imp;

import model.Budget;
import tax.Tax;

public class ISS implements Tax {


    @Override
    public double calculate(Budget budget) {
        return  budget.getValue() * 0.06;
    }
}

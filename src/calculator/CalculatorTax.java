package calculator;

import model.Budget;
import tax.Tax;

public class CalculatorTax {

    public void calculate(Budget budget, Tax tax){
            double valueTax = tax.calculate(budget);
            System.out.println("TAX VALUE: " + valueTax);
    }


}

package main;

import calculator.CalculatorDiscount;
import model.Budget;
import model.Item;

public class Main {
    public static void main(String[] args) {
        CalculatorDiscount discount = new CalculatorDiscount();

        Budget budget = new Budget(600);
        budget.addItem(new Item("Laptop", 250.00));
        budget.addItem(new Item("Mouse", 250.00));

        double finalDiscount = discount.calculate(budget);

        System.out.println(finalDiscount);
    }
}

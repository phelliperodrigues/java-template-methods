package tax;

import model.Budget;

public interface Tax {
    double calculate(Budget budget);
}

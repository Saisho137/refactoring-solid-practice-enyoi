package exercise2_orders.refactored.validator;

import java.util.ArrayList;
import java.util.List;

public class ValidationResult {
    private boolean valid;
    private final List<String> errors;

    public ValidationResult() {
        this.valid = true;
        this.errors = new ArrayList<>();
    }

    public void failure(String error) {
        this.errors.add(error);
        this.valid = false;
    }

    public boolean isValid() {
        return valid;
    }

    public List<String> getErrors() {
        return new ArrayList<>(errors);
    }

}

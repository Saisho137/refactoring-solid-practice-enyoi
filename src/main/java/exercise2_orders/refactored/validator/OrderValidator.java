package exercise2_orders.refactored.validator;

import exercise2_orders.refactored.model.OrderItem;

import java.util.List;

public class OrderValidator {
    public ValidationResult validate(List<OrderItem> items) {
        ValidationResult result = new ValidationResult();

        if (items == null || items.isEmpty()) {
            result.failure("Order must have at least one item");
        } else {
            for (OrderItem item : items) {
                if (item.getName().isEmpty()) {
                    result.failure("Each item must have a name");
                }

                double price = item.getPrice().doubleValue();
                int quantity = item.getQuantity();

                if (price <= 0 || quantity <= 0) {
                    result.failure("Price and Quantity must be positive");
                }
            }
        }

        return result;
    }
}

package e_commerceApp.checkout;

import e_commerceApp.Customer;

public interface CheckoutService {
    boolean checkout(Customer customer, Double totalAmount);
}

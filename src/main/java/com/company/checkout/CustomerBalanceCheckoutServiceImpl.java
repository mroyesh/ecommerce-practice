package com.company.checkout;

import com.company.Customer;
import com.company.balance.CustomerBalance;

public class CustomerBalanceCheckoutServiceImpl implements CheckoutService{
    @Override
    public boolean checkout(Customer customer, Double totalAmount) {
        CustomerBalance customerBalance = CustomerBalance.findCustomerBalance(customer.getId());
        double finalBalance = customerBalance.getBalance() - totalAmount;
        if (finalBalance > 0){
            customerBalance.setBalance(finalBalance);
            return true;
        }
        return false;
    }

}

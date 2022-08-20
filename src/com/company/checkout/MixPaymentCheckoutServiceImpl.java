package com.company.checkout;

import com.company.Customer;
import com.company.balance.CustomerBalance;
import com.company.balance.GiftCardBalance;

public class MixPaymentCheckoutServiceImpl implements CheckoutService {
    @Override
    public boolean checkout(Customer customer, Double totalAmount) {
        try {
            GiftCardBalance giftCardBalance = GiftCardBalance.findGiftCardBalance(customer.getId());

            // 300 giftcard balance
            // 450 customer balance
            // 600 cart

            // 300 - 600 = -300

            // 300 + 450 - 600 = 150

            final double giftBalance = giftCardBalance.getBalance() - totalAmount;
            if (giftBalance > 0) {
                giftCardBalance.setBalance(giftBalance);
                return true;    // added after live session
            } else {
                CustomerBalance customerBalance = CustomerBalance.findCustomerBalance(customer.getId());
                final double mixBalance = giftCardBalance.getBalance() + customerBalance.getBalance() - totalAmount;
                if (mixBalance > 0) {
                    giftCardBalance.setBalance(0d);
                    customerBalance.setBalance(mixBalance);
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

}

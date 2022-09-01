package e_commerceApp.balance;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static e_commerceApp.StaticConstants.CUSTOMER_BALANCE_LIST;

public class CustomerBalance extends Balance{

    public CustomerBalance(UUID customerId, Double balance) {
        super(customerId, balance);
    }

    @Override
    public Double addBalance(Double additionalBalance) {
        setBalance(getBalance() + additionalBalance + 10);    // modified from setBalance(getBalance() + additionalBalance);
        return getBalance();
    }

    public static CustomerBalance findCustomerBalance(UUID customerId) {
        // todo convert this block to stream
        List<Balance>balanceList= new ArrayList<>();
        balanceList.stream().map(Balance::getCustomerId).forEach(System.out::println);

        for (Balance customerBalance : CUSTOMER_BALANCE_LIST) {
            if (customerBalance.getCustomerId().equals(customerId)) {
                return (CustomerBalance) customerBalance;
            }
        }

        CustomerBalance customerBalance = new CustomerBalance(customerId, 0d);
        CUSTOMER_BALANCE_LIST.add(customerBalance);

        return customerBalance;
    }
}

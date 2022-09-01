package e_commerceApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static e_commerceApp.StaticConstants.CUSTOMER_LIST;

public class Main {

    public static void main(String[] args) {

        DataGenerator.createCustomer();
        DataGenerator.createCategory();
        DataGenerator.createProduct();
        DataGenerator.createBalance();
        DataGenerator.createDiscount();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Customer:");
        // todo convert for loop to forEach()
        List<Customer>customerList= new ArrayList<>();
        customerList.stream().map(Customer::getUserName).forEach(System.out::println);

//        for (int i = 0; i < CUSTOMER_LIST.size(); i++) {
//            System.out.println("Type " + i + " for customer:" + CUSTOMER_LIST.get(i).getUserName());
//        }

        Customer customer = CUSTOMER_LIST.get(scanner.nextInt());

        MainMenu.mainMenu(customer);




    }

}

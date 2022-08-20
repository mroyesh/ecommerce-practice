package com.company.discount;

import com.company.Cart;

import java.util.Scanner;
import java.util.UUID;

import static com.company.StaticConstants.DISCOUNT_LIST;

public abstract class Discount {

    private UUID id;
    private String name;
    private Double thresholdAmount;

    public Discount(UUID id, String name, Double thresholdAmount) {
        this.id = id;
        this.name = name;
        this.thresholdAmount = thresholdAmount;
    }

    public boolean decideDiscountIsApplicableToCart(Cart cart){
        return cart.calculateCartTotalAmount() > thresholdAmount;
    }

    public abstract Double calculateCartAmountAfterDiscountApplied(Double amount);

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getThresholdAmount() {
        return thresholdAmount;
    }

    public static Discount findDiscountById(String discountId) throws Exception {
        for (Discount discount : DISCOUNT_LIST) {
            if (discount.getId().toString().equals(discountId)) {
                return discount;
            }
        }
        throw new Exception("Discount couldn't applied because couldn't found");
    }

    public static void checkDiscount(Scanner scanner, Cart cart){
        System.out.println("seems there are discount options. Do you want to see and apply to your cart if it is applicable. " +
                "For no discount, type 'no' ");
        for (Discount discount : DISCOUNT_LIST) {
            System.out.println("discount id " + discount.getId() + " discount name: " + discount.getName());
        }
        String discountId = scanner.next();

        if (!discountId.equals("no")) {
            try {
                Discount discount = Discount.findDiscountById(discountId);
                if (discount.decideDiscountIsApplicableToCart(cart)) {
                    cart.setDiscountId(discount.getId());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

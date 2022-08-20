package com.company;

import com.company.category.Category;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

import static com.company.StaticConstants.PRODUCT_LIST;

public class Product {

    private UUID id;
    private String name;
    private Double price;
    private Integer stock;
    private Integer remainingStock;
    private UUID categoryId;

    public Product(UUID id, String name, Double price, Integer stock, Integer remainingStock, UUID categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.remainingStock = remainingStock;
        this.categoryId = categoryId;
    }


    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getRemainingStock() {
        return remainingStock;
    }

    public void setRemainingStock(Integer remainingStock) {
        this.remainingStock = remainingStock;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() throws Exception {

        for (Category category : StaticConstants.CATEGORY_LIST) {
            // if(getCategoryId().toString().equals(category.getId().toString())){
            if (getCategoryId().equals(category.getId())) {
                return category.getName();
            }
        }
        throw new Exception("Category not found," + getName());
    }

    public LocalDateTime getDeliveryDueDate() throws Exception {
        for (Category category : StaticConstants.CATEGORY_LIST) {
       //     if (getCategoryId().toString().equals(category.getId().toString())) {
            if (getCategoryId().equals(category.getId())) {
                return category.findDeliveryDueDate();
            }
        }
        throw new Exception("Category could not find");
    }

    public static void updateProductStock(Map<Product, Integer> map) {
        for (Product product : map.keySet()) {
            product.setRemainingStock(product.getRemainingStock() - map.get(product));
        }
    }

    public static Product findProductById(String productId) throws Exception {
        for (Product product : PRODUCT_LIST) {
            if (product.getId().toString().equals(productId)) {
                return product;
            }
        }
        throw new Exception("Product not found");
    }

    @Override
    public String toString() {
        try {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", available stock=" + remainingStock +
                    ", product delivery due=" + getDeliveryDueDate() +
                    ", category=" + getCategoryName() +
                    '}';
        } catch (Exception e) {
           return e.getMessage() + " for : " + name;
        }
    }
}













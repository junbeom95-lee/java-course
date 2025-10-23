package chapter3.collection.ex;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Product product = new Product();

        list.add("양파");
        list.add("사과");
        list.add("생선");
        list.add("두부");

        product.addProduct("양파", 3);
        product.addProduct("양파", 7);


        product.addProduct("사과", 7);

        product.addProduct("생선", 4);

        product.printCart();

        product.removeProduct("사과");
        product.removeProduct("김치");

        product.removeProduct("양파", 3);

        int total = product.calculateTotalPrice();
        System.out.println("total = " + total);
    }
}

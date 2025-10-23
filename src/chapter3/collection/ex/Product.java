package chapter3.collection.ex;

import java.util.HashMap;
import java.util.Map;

public class Product {
    //속성
    Map<String, Integer> cart = new HashMap<>();
    private final int 양파price = 1000;
    private final int 사과price = 2000;
    private final int 생선price = 500;
    private final int 두부price = 1400;


    //생성자


    //기능
    public void addProduct(String product, int count) {

        if (cart.containsKey(product)) {

            int cnt = cart.get(product);
            cart.computeIfPresent(product, (key, value) -> cnt + count);
            System.out.println(product + "에 추가로 " + count + "개 넣어서 " + (cnt + count) + "개 되었습니다.");
        } else {
            cart.put(product, count);
            System.out.println(product + "에 " + count + "개 넣었습니다.");
        }
    }

    public void printCart() {

        System.out.println(" [ 카트 상품 목록 장 바 구 니 ] ");
        for (String key : cart.keySet()) {
            System.out.println("key = " + key + " 개수: " + cart.get(key));
        }
    }

    public void removeProduct(String s) {

        if (cart.containsKey(s)) {
            System.out.println("상품 " + s + "를 삭제합니다.");
            cart.remove(s);
        } else {
            System.out.println(s + "상품이 존재하지 않습니다.");
        }
    }

    public void removeProduct(String s, int cnt) {
        cart.computeIfPresent(s, (key, value) -> {
            int i = value - cnt;
            System.out.println("상품 " + s + "의 수량을 " + value + "에서 " + cnt + "를 뺏습니다. 남은 수량 : " + i);
            return i;
        });
    }

    public int calculateTotalPrice() {
        int total = 0;
        for (String key : cart.keySet()) {
            if("양파".equals(key)) total += cart.get("양파") * 양파price;
            if("사과".equals(key)) total += cart.get("사과") * 사과price;
            if("두부".equals(key)) total += cart.get("두부") * 두부price;
            if("생선".equals(key)) total += cart.get("생선") * 생선price;
        }

        return total;
    }
}

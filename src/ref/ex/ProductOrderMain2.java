package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 상품 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[3];
        // createOrder()를 여러 번 사용해 상품 주문정보들을 생성해 배열에 저장
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        // printOrders()를 사용해 상품 주문 정보 출력
        printOrders(orders);

        // getTotalAmount()를 사용해 총 결제 금액 계산
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);

        // 총 결제금액 출력
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}

/*

상품명: 두부, 가격: 2000, 수량: 2
상품명: 김치, 가격: 5000, 수량: 1
상품명: 콜라, 가격: 1500, 수량: 2
총 결제 금액: 12000

* */
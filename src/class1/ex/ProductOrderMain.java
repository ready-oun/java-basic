package class1.ex;
// ProductOrder 클래스 활용.
// 여러 상품의 주문 정보를 배열로 관리하고, 그 정보들을 출력하고, 최종 결제 금액을 계산하여 출력하자
public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];


        // 상품 정보를 'ProductOrder' 타입의 변수로 받아 저장
        ProductOrder order1 = new ProductOrder();

        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();

        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();

        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        orders[2] = order3;


        // 여러 상품 주문 정보를 담는 배열 생성
//        ProductOrder orders[] = {order1, order2, order3};

        int totalAmount = 0;
        // 상품 주문 정보와 최종 금액 출력
        for (ProductOrder o : orders) {
            System.out.println("상품명: " + o.productName + ", 가격: " + o.price + ", 수량: " + o.quantity);
            totalAmount += o.price * o.quantity;
        }

        System.out.println("총 결제금액: " + totalAmount);
    }
}


/*
상품명: 두부, 가격: 2000, 수량: 2
상품명: 김치, 가격: 5000, 수량: 1
상품명: 콜라, 가격: 1500, 수량: 2
총 결제 금액: 12000
* */
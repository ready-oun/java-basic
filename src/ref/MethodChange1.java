package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a); // x에 변수 a의 값 전달. => 메서드 안에서 int x = a;
        // 메서드 종료 후 a는 10 그대로 출력
        System.out.println("메서드 호출 후: a = " + a); // x에 a값을 복사해서 대입하여 a, x 값 둘다 존재.
    } //  메서드가 종료되면 매개변수 x는 제거된다.

    static void changePrimitive(int x) {
        x = 20;
    }
}

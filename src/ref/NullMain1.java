package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data(); // 새 객체 생성해 그 참조값을 data 변수에 할당함.
        // data 변수가 참조할 객체가 존재함.
        System.out.println("2. data = " + data);
        data = null; // 다시 null을 할당함 -> 기존 Data 인스턴스를 더는 참조 안 함.

        System.out.println("3. data = " + data);
    }
}
/*GC - 아무도 참조하지 않는 인스턴스의 최후
        인스턴스를 참조하지 않게 되면 참조값을 다시 구할 방법이 없게 됨.
        -> 아무도 참조하지 않는 인스턴스는 사용되지 않고 메모리 용량만 차지함.
        -> 자바가 메모리 부족 오류 발생 예방 위해 자동으로 이런 인스턴스를 삭제해줌.
        : JVM의 GC(가비지 컬렉션)
객체는 해당 객체를 참조하는 곳이 있으면, JVM이 종료할 때 까지 계속 생존한다.
그런데 중간에 해당 객체를 참조하는 곳이 모두 사라지면
그때 JVM은 필요 없는 객체로 판단하고 GC(가비지 컬렉션)를 사용해서 제거한다.
*/
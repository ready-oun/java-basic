package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 10
        changeReference(dataA);
        // 메서드 호출 때 매개변수 dataX에 변수 dataA `참조값` 복사해서 전달. => Data dataX = dataA
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // 10 => 20
        // 메서드 종료 후 dataA.value 값은 20으로 변경된 것을 확인.
    }

    static void changeReference(Data dataX) {
        dataX.value = 20; // 메서드 안에서 20으로 새로운 값 대입했음.
        // 참조값 통해 같은 인스턴스에 접근하여 그 안의 value 값을 20으로 변경함.
        // dataA, dataX 모두 같은 인스턴스를 참조하므로 dataA.value와 dataX.value는 둘다 20이라는 값을 가짐.
    }
}

/* 자바에서 변수에 값을 대입하는 것은 항상 값을 복사해서 대입한다.
변수 dataA, dataX 둘다 같은 참조값을 갖게 됨.
이제 dataX 통해서도 같은 Data 인스턴스에 접근할 수 있음.
*/
package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
//        data.value = 10; // NPE : Cannot assign field "value" because "data" is null
        System.out.println("data = " + data.value);
    }

}
/*
* 예외가 발생했으므로 그 다음 로직은 수행되지 않음.
* */
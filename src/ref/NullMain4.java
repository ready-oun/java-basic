package ref;
// NullMain3 해결방법
public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 객체를 생성해줌.


        System.out.println("bigData.count=" + bigData.count); // 여기서는 0
        System.out.println("bigData.data=" + bigData.data); // null 출력
        // null 출력하던 게 객체 참조값을 출력함.
        System.out.println("bigData.data.value=" + bigData.data.value);
        // 여기서 NPE 발생했었는데 0을 출력함.
    }
}

/*
package ref;

    public class Data {
        int value;
    }

    Data 멤버변수는 int 라서 초기값이 0임.
    BigData에서 Data data 를 멤버변수로 가짐.
    여기 main()에서 bigData.data = new Data(); 로 객체를 생성했음.
    객체를 생성했으므로 Data의 초기값을 담음.
    따라서 bigData.data가 객체 생성 전에는 null 출력하다가, 객체 생성하니 참조값을 가짐.
    멤버변수 Data data가 bigData.data = new BigData(); 로 객체 생성해서 참조값을 담을 수 있게 된 것임.
*
*
* */

package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count=" + bigData.count); // 여기서는 0
        System.out.println("bigData.data=" + bigData.data); // null 출력

        System.out.println("bigData.data.value=" + bigData.data.value); // 여기서 NPE
        // data는 BigData에서 멤버변수인데, Data의 참조형 객체임. 근데 null이라 참조형 객체로 접근할 때 NPE가 발생.
        // null에 .(dot)을 찍은 것임. => NullPointer => Exception 발생.
    }
}

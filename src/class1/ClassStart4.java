package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2]; // 객체 생성. 아직 대입한 참조값이 없어 배열 내 변수 공간에 null 값으로 초기화된 상태.
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);

    }
}

/* 자바에서 대입(`=`)은 항상 변수에 들어 있는 값을 복사한다.
 `student1` `student2` 에는 참조값이 보관되어 해당 참조값이 배열에 저장됨.
 == `student1` student2`에 보관된 참조값을 읽고 복사해서 배열에 대입함.

 변수에는 인스턴스 자체가 들어있는 것이 아니다!
 인스턴스의 위치를 가리키는 참조값이 들어있을 뿐이다!
 그래서 대입(=) 시, 인스턴스가 복사되는 것이 아니라 참조값만 복사된다.
 */
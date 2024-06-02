package ref;
// import class1.Student;이 선언되어 있으면 안된다.
public class Method1 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1); // student1, 2에 return한 객체 참조값 대입
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // `Student` 객체 참조변수를 반환함.
        // initStudent와 다른 점:
        // 새로운 `Student` 객체를 생성하고, 해당 객체 필드를 초기화한 후 이를 반환함.
        // 메서드 안에서 객체를 생성했기 때문에 만들어진 객체를 메서드 밖에서 사용할 수 있게 돌려주어야 한다.
        // 그래야 메서드 밖에서 이 객체를 사용할 수 있다.
        // 그래서 호출 결과인 객체의 참조값을 반환(return)하여 메서드 밖으로 반환할 수 있도록 함.
    }

//    static void initStudent(Student student, String name, int age, int grade) {
//        // 이미 존재하는 `student` 객체를 받아 해당 객체의 필드를 초기화함.
//        // 새로운 객체를 생성하지 않고, 매개변수로 전달된 객체 상태를 변경함.
//        student.name = name;
//        student.age = age;
//        student.grade = grade;
//        // 반환값이 없으므로 리턴 타입이 `void`로 명시.
//    }

    static void printStudent(Student student1) {
        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
    }
}

// 참조형은 메서드를 호출할 때 참조값을 전달한다.
// 따라서 메서드 내부에서 전달된 참조값을 통해 객체의 값을 변경하거나, 값을 읽어서 사용할 수 있다.


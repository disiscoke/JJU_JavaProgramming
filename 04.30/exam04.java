/**
 * Person 클래스는 사람의 이름과 ID를 저장하는 클래스입니다.
 */
class Person {
    String name;
    String id;

    /**
     * Person 클래스의 생성자입니다.
     * @param name 사람의 이름
     */
    public Person(String name) {
        this.name = name;
    }
}

/**
 * Student 클래스는 Person 클래스를 상속받아 학생의 학년과 학과를 저장하는 클래스입니다.
 */
class Student extends Person{
    String grade;
    String department;
    
    /**
     * Student 클래스의 생성자입니다.
     * @param name 학생의 이름
     */
    public Student(String name) {
        super(name);
    }
}

/**
 * exam02 클래스는 main 메소드를 포함하고 있으며, Person과 Student 클래스를 사용하는 예제입니다.
 */
public class exam04 {
    public static void main(String[] args) {
        Person p;
        Student s = new Student("홍길동");  // Person 클래스의 생성자를 호출
        s.grade = "A";  // Student 클래스의 멤버 변수에 접근

        p = s;

        System.out.println(s.name); // Person 클래스의 멤버 변수에 접근
        System.out.println(s.grade); // Student 클래스의 멤버 변수에 접근
        System.out.println(p.name); // Person 클래스의 멤버 변수에 접근

        // System.out.println(p.grade); // 컴파일 오류
        
        System.out.println(((Student)p).grade); // 형변환을 통해 접근 가능

    }
}
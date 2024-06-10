class person3 {
    String name;

    public person3(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}

class student3 extends person3 {
    String grade;

    public student3(String name,String grade) {
        super(name);
        this.grade = grade;
    }
}

class professor3 extends person3 {
    String major;

    public professor3(String name,String major) {
        super(name);
        this.major = major;
    }
}

public class exam05 {

    static void print (person3 p) {
        System.out.println(p.name);

        if (p instanceof student3) {
            System.out.println(((student3)p).grade);
        }
        else if (p instanceof professor3) {
            System.out.println(((professor3)p).major);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        person3 p1 = new student3("홍길동","A");
        person3 p2 = new professor3("이순신","컴퓨터 공학");

    }
    
}

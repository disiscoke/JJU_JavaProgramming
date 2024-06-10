package exam04;

import java.util.*;

public class app {

    public static void main(String[] args) {
        HashMap<String, student> _mapDB = new HashMap<>();

        _mapDB.put("leeyang", new student(1, "0000-1111"));
        _mapDB.put("leekoon", new student(2, "2222-3333"));
        _mapDB.put("kimkoon", new student(3, "5555-8888"));

        student _stu = _mapDB.get("leeyang");
        System.out.println(_stu.id + " " + _stu.pNum);
        
        student _stu2 = _mapDB.get("kimkoon");
        System.out.println(_stu2.id + " " + _stu2.pNum);
    }
}

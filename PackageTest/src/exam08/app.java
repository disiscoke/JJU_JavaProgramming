package exam08;

public class app {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");    // StringBuffer 객체 sb를 생성하고 "hello"로 초기화

        StringBuffer _sb = sb.append(" world");  // sb에 " world"를 추가하여 _sb에 저장

        System.out.println(_sb);    // hello world
        System.out.println(_sb == sb);   // true
    }
}

package exam06;


public class app {
    
    public static void main(String[] args) {
        
        myClass<String> _s = new myClass<>();   // This is a generic class
        myClass<Integer> _n = new myClass<>();  // This is a generic class

        _s.set("hello");    // This is a generic method

        _n.set(378);    // This is a generic method

        System.out.println(_s.get());   // This is a generic method
        System.out.println(_n.get());   // This is a generic methodㄴ
    }
}

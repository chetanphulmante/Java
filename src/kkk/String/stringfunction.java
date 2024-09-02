package kkk.String;

public class stringfunction {
    public static void main(String[] args) {
//        String message=new1();
//        System.out.println(message);
        
        String person=mygreet("chh");
        System.out.println(person);
        
    }

     static String mygreet(String name) {
        String msg="hlo "+name;
        return msg;
    }

    static String new1() {
        String greeting="heyyy";
        return greeting;
    }
}

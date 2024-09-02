package kkk.String;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder("dfdsf");
        s.append(" gehf");
        char k=s.charAt(3);
        System.out.println(s);
        System.out.println(k);
        s.setCharAt(3,'y');
        System.out.println(s);
        s.append("fdsfd");
        System.out.println(s);
        s.insert(3,"hello");
        System.out.println(s);
        s.deleteCharAt(0);
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        s.delete(3,8);
        System.out.println(s);
    }
}

package kkk.String;

public class string {
    public static void main(String[] args) {
        String name="cheatn chitnu";
        double a=123222.32334235576;
        System.out.printf(" %.8f",a);
        StringBuilder variable1=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            char ch=(char) ('a'+i);
            variable1.append(ch);

        }
        System.out.println(variable1.toString());
    }
}

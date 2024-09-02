package kkk.recusrsion.sub;
import java.util.*;
public class permutaion {
    public static void main(String[] args) {
//        String str="abc";


        ArrayList<String> ans = permutations2("", "abc");
        System.out.println(ans);
        System.out.println(permutaions3("","abc"));
    }

    static void permutaions(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutaions(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permutations2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutations2(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int permutaions3(String p, String up) {
        if (up.isEmpty()) {
//            System.out.println(p);
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutaions3(f + ch + s, up.substring(1));
        }
        return count;
    }
}

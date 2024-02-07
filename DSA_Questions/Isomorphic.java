import java.util.Arrays;
import java.util.Scanner;

public class Isomorphic {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String t=in.next();

        if (isIsomorphic(s, t)) {
            System.out.println("The strings are isomorphic");
        } else {
            System.out.println("The strings are not isomorphic");
        }
    }

    public static boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        Arrays.fill(m1, -1);
        Arrays.fill(m2, -1);

        for (int i = 0; i < s.length(); i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i;
            m2[t.charAt(i)] = i;
        }

        return true;
    }
}
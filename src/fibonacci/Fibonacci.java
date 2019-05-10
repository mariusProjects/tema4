package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static int showIteratively(int n) {
        int f[] = new int [n + 2];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 2] + f[i - 1];

        }
        return f[n];

    }

    public static int showRecursively(int n) {
        int c = 0;
        for(int i = 2; i <= n; i++) {
            while(c <= n){
                c = (i - 1) + (i - 2);
                i++;
            }

        }
        return c;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("introduceti numarul");
        int n = s.nextInt();
        System.out.println(showIteratively(n));
        System.out.println(showRecursively(n));


    }
}

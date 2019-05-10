package operations;

import java.util.Scanner;

public class MyMathematicalOperations {
    private static int result;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("indroduceti operatia");
        String operation = s.nextLine();
        String[] mySplit = operation.split(" ");
        int termen1 = Integer.valueOf(mySplit[0]);
        String operator = String.valueOf(mySplit[1]);
        int termen2 = Integer.valueOf(mySplit[2]);
        System.out.println(termen1);
        System.out.println(operator);
        System.out.println(termen2);
        if (operator.equals("+")) {
            result = termen1 + termen2;
        }else if (operator.equals("*")) {
            result = termen1 * termen2;
        }else if (operator.equals("/")){
            result = termen1 / termen2;
        }else if (operator.equals("-")){
            result = termen1 - termen2;
        }else if(operator.equals("%")){
            result = termen1 % termen2;
        }
        System.out.println(result);


    }
}

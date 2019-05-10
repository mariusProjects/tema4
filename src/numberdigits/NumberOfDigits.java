package numberdigits;
//import java.util.Scanner;

public class NumberOfDigits {
    public static int getNumberOfDigits(Integer n) {

//        Scanner s = new Scanner(System.in);
//        System.out.println("introducere Integer");
//        Integer input = s.nextInt();
        String str = n.toString();
//        String transform = input.toString();
//        System.out.println(transform.length());
        return str.length();
    }

    public static void main(String[] args) {
        System.out.println(getNumberOfDigits(1234567));


    }
}

package datacounter;

public class StringDataCounter {

    public static int countWords(String input) {
        int counter = 0;
        int i = 0;
        String[] mySplit = input.split(" ");
        while (mySplit[i] != null) {
            String cuvinte = String.valueOf(mySplit[i]);
            i++;
            counter = counter + 1;
//            System.out.println(cuvinte);
            System.out.println(counter);

        }
        return counter;

    }


    public static void main(String[] args) {
        countWords("Notre Dame is a very old cathedral in Paris");


    }
}



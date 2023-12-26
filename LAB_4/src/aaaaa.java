import java.util.Scanner;

public class aaaaa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String positiveNumberInput;
        int IntAt, __oddNumber = 0, __evenNumber = 0, __zeroNumber = 0;
        // int LenghtOfInput;

        System.out.print("Enter positive number : ");
        positiveNumberInput = scan.nextLine();
        // LenghtOfInput = positiveNumberInput.length();

        // System.out.println("This is Lenght of Text [" + LenghtOfInput+ "]");

        for (int i = 0; i < positiveNumberInput.length(); i++) {
            // System.out.println("at ["+i+"] "+positiveNumberInput.charAt(i));
            IntAt = positiveNumberInput.charAt(i);

            if (IntAt == 0) {
                __zeroNumber++;
            } else {
                if (IntAt % 2 != 0) {
                    __oddNumber++;
                } else if (IntAt % 2 == 0) {
                    __evenNumber++;
                }
            }

        }
        System.out.println(" ");
        System.out.println("Odd digit = " + __oddNumber);
        System.out.println("Even digit = " + __evenNumber);
        System.out.println("Zero digit = " + __zeroNumber);

        scan.close();
    }
}

package se.lnu.Exercise1;

public class PrintRecursive {
    private static void printReverse(String str, int i) {
        if (str.isEmpty()) {
            return;
        }
        System.out.print(str.charAt(str.length() - 1));
        printReverse(str.substring(0, str.length() - (i + 1)), i);

    }

    private static void print(String str, int i) {
        if (str.isEmpty()) {
            return;
        }
        System.out.print(str.charAt(i));
        print(str.substring(i + 1), i);
    }

    public static void main(String[] args) {
        String str = "Hello Everyone!";

        print(str, 0);
        System.out.println(); // Line break
        printReverse(str, 0);
    }

}

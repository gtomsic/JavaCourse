import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello world!");
        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);
        System.out.println(Arrays.toString(splitStrings));
        System.out.println("-".repeat(20));
        printText("Hello");
        printText("Hello", "World", "again!");

        String[] sArray = {"first", "second", "third", "fourth"};
        System.out.println(String.join(",", sArray));
    }

    private static void printText(String... textList){
        for (String t : textList){
            System.out.println(t);
        }
    }
}
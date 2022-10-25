import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws Exception {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
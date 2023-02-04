import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var reader = new Scanner(System.in);
        var a = Integer.parseInt(reader.nextLine());
        var b = Integer.parseInt(reader.nextLine());
        System.out.println(Math.sqrt(a * a + b * b));
    }
}
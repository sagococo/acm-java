import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;

        while ((name = scanner.nextLine()) != null)
            System.out.println(name.replace(": [编程入门]", "").replace(" ", ""));
    }
}

import java.util.Scanner;

public class HelloWorld {
    public static void main( String[] args ) {
        System.out.println("Hello World!");
        System.out.println("What would you like to say?");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("You said: " + input);
        s.close();
    }
}
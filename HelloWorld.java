import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("What would you like to say?");
        Scanner s = null;
        try {
            s = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String input = s.nextLine();
        System.out.println("You said: " + input);
        s.close();
    }
}

import java.util.Scanner; // ← Only needed once

public class GreetMe {
	public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.print(" Whats ur name: ");
         String name = scanner.nextLine();
        		 
         System.out.print(" whats ur age: ");
         int age = scanner.nextInt();
         
         System.out.print(" whats ur favourite color :");
         String color = scanner.nextLine();
         
         System.out.println(" hello!! "+ " you are "+ name + " and you are " + age +" years old " + " and ur fav color is " + color);
         
         scanner.close();


    }
}
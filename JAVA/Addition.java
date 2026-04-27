import java.util.Scanner;

public class Addition{
    public static void main(String[] args){
         Scanner sc = new Scanner (System.in);

         System.out.print("First Number: ");
         int a = sc.nextInt();

         System.out.print("+\n");

         System.out.print("Second Number: ");
         int b = sc.nextInt();
         int c = a + b;
         System.out.print("=\n");
         System.out.print("ANSWER: " + c + "\n");

         sc.close();
    }
}
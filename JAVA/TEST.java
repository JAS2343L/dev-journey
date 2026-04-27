import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.print("Enter Your Name: ");
            name = input.nextLine();
            System.out.print("PLEASE\n");
        }


        input.close();
    }
}
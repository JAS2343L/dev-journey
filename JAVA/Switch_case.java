import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner ah = new Scanner(System.in);

        System.out.print("hello: ");
        int a = ah.nextInt();
        switch(a){
            case 1:
                System.out.print("Sunday!!");
                break;
            default:
                System.out.println("WHATA??");    

        }
        ah.close();
    }   
}

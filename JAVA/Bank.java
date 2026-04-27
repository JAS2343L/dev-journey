import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank{
    static String cl = "\033[H\033[2J";
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        
        double bal = 0;
        boolean run = true;
        int choose;
        System.out.println(cl);

        while(run){
            System.out.println(" ======BANK======");
            System.out.println("1. Show Balance \n2.  Withdraw \n3.   Deposit \n4.    Exit");
            System.out.print("\nChoose Any Option (1-4): ");
            try{
                choose = scan.nextInt();  

                switch(choose){
                    case 1 -> showbal(bal);
                    case 2 -> bal -= withd(bal);
                    case 3 -> bal += depo();
                    case 4 -> run = false;
                    default -> System.out.println(cl+" ==Wrong Choice==");  
                }
            }catch(InputMismatchException e){
                System.out.println(cl+" ==Wrong Choice==");
                scan.nextLine();
            }
        }


        scan.close();
    }




    static void showbal(double bal){
        System.out.println(cl + " ==Your Balance==");
        System.out.printf("  ₹%.2f\n", bal);
    }





    static double depo(){
        double amount;
        System.out.print(cl+" =Enter Your Amount:= ");
        //amount = scan.nextDouble();
        try{
            amount = scan.nextDouble();
            if(amount <= 0){
                System.out.println(cl+" Amount Can't Be 0 OR Negative ! \n");
                return 0;
            }else{
                System.out.println(cl+" =Your Amount Is Deposited into Bank=");
                return amount;
            }
        }catch(InputMismatchException e){
            System.out.println(cl+" =WRONG Type Of Amount!!=");
            scan.nextLine();
            return 0;
        }
    }




    static double withd(double bal){
        double amount;
        System.out.print(cl+"=Enter The Amount To Be Withdrawn:= ");
        try{
            amount = scan.nextDouble();
            if (amount > bal){
                System.out.print(cl+" =INSUFFICIENT AMOUNT!!=\n");
                return 0;
            }else if(amount <= 0){
                System.out.print(cl+" =Amount Can't Be 0 OR Negative != \n");
                return 0;
            }else{
                System.out.println(cl+" =Amount Withdrawed=");
                return amount;
            }
        }catch(InputMismatchException e){
            System.out.println(cl+" =WRONG Type Of Amount!!=");
            scan.nextLine();
            return 0;
        }
    }
}
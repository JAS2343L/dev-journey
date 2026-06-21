import java.util.Scanner;

public class challenge1 {
    public static void main(String[] args) {
        Scanner bandaISpuching = new Scanner(System.in);
        int bal = 5001;

        String cls = "\033[H\033[2J";
        System.out.print(cls);
        
        while(true){
            if(bal != 0){
                System.out.println("Money You Have in lakshmi-chit-fund Bank: "+bal+"$");
            }else if(bal == 0){
                System.out.println("YOU LEFT WITH 0$. For more withdrawal add cash!");
            }
            System.out.print("How Much To Withdraw (or type \"exit\"): ");
            String chose = "";
            chose = bandaISpuching.nextLine();
            if(chose.equalsIgnoreCase("exit")){
                System.out.println(cls + "Have a nice day!");
                break;
            }else{
                try{
                    int num = Integer.parseInt(chose);
                    if(num < 0){
                        System.out.println(cls+"YOU CANT WITHDRAW NEGATIVE!\n");
                    }else if(num > bal){
                        System.out.println(cls+"YOU DONT HAVE ENOUGH MONEY TO WITHDRAW!\n");
                    }else{
                        if(num == 0){
                            System.out.println(cls + "DEDUCTED NOTHING FROM YOUR ACCOUNT, wait ZERO ?\n");
                        }else{
                            bal = bal - num;
                            System.out.println(cls + "DEDUCTED -"+num+"$ FROM YOUR ACCOUNT SUCCESSFULLY\n");
                        }

                    }
                    
                }catch(NumberFormatException e){
                    System.out.println(cls+"WHAT, I CANT FIND ANYNUMBER TO WITHDRAW ???\n");
                }

            }

        }
        
        bandaISpuching.close();
    }
}
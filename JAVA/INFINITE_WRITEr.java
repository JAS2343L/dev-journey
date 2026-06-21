import java.util.InputMismatchException;
import java.util.Scanner;

public class INFINITE_WRITEr {
    INFINITE_WRITEr(){
        final String cls = "\033[H\033[2J";

        Scanner AAsak = new Scanner(System.in);
        System.out.print(cls+"Enter the text: ");
        String ask = AAsak.nextLine();
        System.out.print("How Many Times:");
        try{
            int times = AAsak.nextInt();
            System.out.print("\033[H\033[2J");
            for(int i = 0; i < times ; i++ ){
                System.out.println(ask);
            }
        }catch(InputMismatchException e){
            System.out.println("Wrong Number!");
        }
        AAsak.close();

        

        


        
    }
    public static void main(String[] args) {
        new INFINITE_WRITEr();
    }
}
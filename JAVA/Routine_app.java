import java.util.Scanner;
public class Routine_app{
    public static void main(String[] args) {
        Scanner rou = new Scanner(System.in);

        String day;
        System.out.println("What is the day ?");
        System.out.print("It's : ");
        day = rou.next();
        
        switch(day.toLowerCase()){
            default:
                System.out.println("INVALID DAY " + day + "??");
            
        }
        rou.close();       
    }
}
import java.util.Scanner;

public class rowss {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int row;
        int col;
        String cha = "";

        System.out.print("\033[H\033[2JEnter # of rows(vertical): ");
        row = scn.nextInt();
        System.out.print("Enter # of columns(Horizontal): ");
        col = scn.nextInt();
        System.out.print("Enter Anything to use: ");
        cha = scn.next();

        for(int i = 1; i <= row; i++){
           System.out.println();
           for(int j = 1; j <= col; j++){
               System.out.print(cha);
           }
        }
        scn.close();
    }
}

import java.io.*;
import java.util.Scanner;
public class timepaas {
    timepaas(){

        Scanner aasak = new Scanner(System.in);
        final String clar = "\033[H\033[2J";
        System.out.print(clar);

        while(true){
            String writ = "";
            System.out.println("File name \"FILE.txt\"\n1) Read\n2) Write\nOr Type Exit: ");
            String chek = aasak.nextLine();
            boolean heck  = chek.matches(".*\\d.*");
            if (heck){
                int leck = Integer.parseInt(chek);
                if (leck == 1){
                    try{
                        File rd = new File("FILE.txt");
                        Scanner red = new Scanner(rd);
                        while (red.hasNextLine()){
                            red.nextLine();
                        }
                        red.close();
                    }catch(FileNotFoundException e){
                        System.out.print(clar + "==File Not Found!==\n");
                    }
                }else if(leck == 2){
                    FileWriter wt = new FileWriter("FILE.txt");
                }else{
                    System.out.print(clar + "Wrong input\n");
                }
                
            }else{
                if(chek.equalsIgnoreCase("exit")){
                    System.out.println(clar);break;
                }else{
                    System.out.print(clar + "Wrong input\n");
                }
            }
            
        }
        aasak.close();
    }

    public static void main(String[] args) {
        new timepaas();
    }
}
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
                        System.out.print(clar);
                        File rd = new File("FILE.txt");
                        Scanner red = new Scanner(rd);
                        while (red.hasNextLine()){
                            String radingggggggggggggggggggggggggggggggggg = red.nextLine();
                            System.out.println(radingggggggggggggggggggggggggggggggggg);
                        }
                        red.close();
                        System.out.print("\nPress Enter To COntinue ././..");
                        aasak.nextLine();System.out.print(clar);
                    }catch(FileNotFoundException e){
                        System.out.print(clar + "==File Not Found!==\n");
                    }
                }else if(leck == 2){
                    try{
                    FileWriter wt = new FileWriter("FILE.txt");
                    System.out.println(clar + "Type:->>");
                    writ = aasak.nextLine();
                    wt.write(writ);
                    wt.close();
                    System.out.print(clar + "File Saved!\n");

                    }catch(IOException e){
                        System.out.print(clar+"Error!\n");
                    }
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

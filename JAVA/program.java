import java.util.Scanner;
import java.io.*;


public class program {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("\033[H\033[2J"+"1.read\n2.write\nchoose: ");
        String b = a.nextLine();
        boolean lock = false;

        while(!lock){
            switch (b){
                case "1":
                    File ab = new File("nall.txt");
                    if (ab.exists()){
                        try{
                        Scanner rad = new Scanner(ab);
                        while(rad.hasNextLine()){
                            rad.nextLine();
                            rad.close();
                        }}catch(FileNotFoundException e){
                            System.out.println("File Not Found");
                            e.printStackTrace();                          
                        }lock = true;
                    }break;
                    

                case "2":
                    try{
                        FileWriter c = new FileWriter("nall.txt");
                        c.write(b);
                        System.out.print("SAVED!!");
                        lock = true;
                        c.close();
                    }catch(IOException e){
                        e.printStackTrace();
                    }a.close();
                    break;
                default:
                    System.out.println("Wrong ");
                    lock = true;

                
            }

        }
    }    
}
import java.util.*;
import java.io.*;

public class fileio {
    fileio() {
        Scanner scn = new Scanner(System.in);
        String clear = "\033[H\033[2J";
        System.out.print(clear);
        boolean run = true;

        while(run){
            int i = 0;
            System.out.println("1. Read File");
            System.out.println("2. Write File");
            System.out.println("3. Exit");
            System.out.print("Choose With Number -> ");

            try{
                i = scn.nextInt();
                scn.nextLine();
            }catch(InputMismatchException e){
                scn.nextLine();
            }

            switch(i){
                case 1:
                    try{
                        System.out.print(clear);
                        File r = new File("fileiotext.txt");
                        Scanner readthat = new Scanner(r);
                        while (readthat.hasNextLine()){
                            String rrrr = readthat.nextLine();
                            System.out.println(rrrr);
                            }
                        readthat.close();
                        System.out.print("\nPress Enter To COntinue../.   ");
                        scn.nextLine();
                        System.out.print(clear);
                        break;
                    }catch(FileNotFoundException e){
                        System.out.println(clear+"File Not Found!!, first create that file by selecing 2nd option");
                        break;
                    }

                case 2:
                    System.out.println(clear+"1. Overwrite Existed File");
                    System.out.println("2. Add Another Line to that File");
                    System.out.println("3. Back");
                    System.out.print("Choose With Number -> ");
                    i = 0;
                    try{
                        i = scn.nextInt();
                        scn.nextLine();
                    }catch(InputMismatchException e){
                        System.out.println(clear+"Wrong input!!");
                        scn.nextLine();
                    }

                    switch(i){
                        case 1:
                            try{
                                System.out.println(clear+"Type->\n");
                                FileWriter w = new FileWriter("fileiotext.txt");
                                String writinglol = scn.nextLine();
                                w.write(writinglol);
                                System.out.println(clear+"File Saved!!");
                                w.close();
                                break;
                            }catch(IOException e){
                                System.out.print(clear+"CANT ABLE TO SAVE!!!");
                                break;
                            }
                        case 2:
                            try{
                                System.out.println(clear+"Type->\n");
                                FileWriter w = new FileWriter("fileiotext.txt", true);
                                String writinglol = scn.nextLine();
                                w.write(System.getProperty("line.separator")+writinglol);
                                System.out.println(clear+"File Saved!!");
                                w.close();
                                break;
                            }catch(IOException e){
                                System.out.print(clear+"CANT ABLE TO SAVE!!!");
                                break;
                            }
                        case 3:
                            System.out.print(clear);
                            break;
                    }
                    break;
                case 3:
                    run = false;
                    System.out.print(clear);
                    break;
                default:
                    System.out.println(clear+"Wrong input!!");
                    
            }
        }
        scn.close();
    }
    public static void main(String[] args) {
        new fileio();
    }
}

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Base64;



public class SecrectDiary {

    SecrectDiary(){


        Scanner ask = new Scanner(System.in);
        String password = "1";
        int passattempts = 3;
        boolean exitpass = true;
        boolean working = true;
        boolean chosing = true;
        String clear = "\033[H\033[2J";
        int choose;
        String encode = "";
        byte[] decode;
        System.out.println(clear);



        while(exitpass){
            System.out.print("\nEnter Your Password For Diary: ");
            String pass = ask.nextLine();



                if(pass.equals(password)){
                    System.out.println(clear+"Welcome To Your Diary\n");

                    while(working){
                        try{                                       //TIMER
                            TimeUnit.MILLISECONDS.sleep(500);
                        }catch(InterruptedException e){
                            Thread.currentThread();
                        }


                        System.out.println("-----DIARY-----");
                        System.out.println("1. Write A New Note");
                        System.out.println("2. View Your Previous Note");
                        System.out.println("3. Delete Your Note");
                        System.out.println("4. EXIT");
                        chosing = true;
                        choose = 0;



                        try{
                            System.out.print("\nChoose by Entering Numbers: ");
                            choose = ask.nextInt();
                            ask.nextLine();
                        }catch(InputMismatchException e){
                            ask.nextLine();
                        }

                        switch(choose){
                            case 1:
                                System.out.println(clear);
                                while(chosing){                       
                                    System.out.println("-----Write A New Note-----"); 
                                    System.out.println("1. New Note");
                                    System.out.println("2. Overwrite Existing Note");
                                    System.out.println("3. Open and Edit Existing Note");
                                    System.out.println("4. BACK");

                                    choose = 0;

                                    try{
                                        System.out.print("\nChoose By Entering Numbers: ");
                                        choose = ask.nextInt();
                                        ask.nextLine();
                                    }catch(InputMismatchException e){
                                        ask.nextLine();
                                    }
                                    
                                    switch(choose){

                                        case 1:
                                            System.out.print(clear+"You Can Write: \n\n");
                                            String temporarynote = ask.nextLine();
                                                System.out.println("\033[H\033[2J"+"Your Note Is Saved In data.txt file\n");
                                                
                                                try{
                                                    FileWriter writing = new FileWriter("data.txt");
                                                    encode = Base64.getEncoder().encodeToString(temporarynote.getBytes());
                                                    writing.write(encode);
                                                    writing.close();
                                                    chosing = false;
                                                }catch(IOException e){
                                                    System.out.println("Error Saving!!\n");
                                                }


                                            break;
                                        case 2:
                                            System.out.println(clear+"COMING SOON!!\n");
                                            break;
                                        case 3:
                                            System.out.println(clear+"COMING SOON!!\n");
                                            break;
                                        case 4:
                                            chosing = false;
                                            System.out.println(clear);
                                            break;

                                        default:
                                            System.out.println(clear+"INLAVID CHOICE!!\n");
                                            try{                                       //TIMER
                                            TimeUnit.MILLISECONDS.sleep(500);
                                            }catch(InterruptedException e){
                                                Thread.currentThread();
                                            }
                                    }       
                                }
                                break;


                            case 2:
                                try{
                                    File dir = new File("data.txt");
                                    if(dir.exists()){
                                        Scanner reading = new Scanner(dir);
                                        System.out.println(clear+"Reading:\n");
                                        while(reading.hasNextLine()){
                                            String encodeline = reading.nextLine();
                                            try{
                                            decode = Base64.getDecoder().decode(encodeline);
                                            String decode2 = new String(decode);
                                            System.out.println(decode2);

                                            }catch(IllegalArgumentException e){
                                                System.out.println(clear + "FILE HAS BEEN ALTERED!!, Not able to Read That File!!\n\n");
                                            }
                                            
                                        }reading.close();
                                        System.out.println();
                                        
                                    } else {
                                        System.out.println(clear + "File Not Found!\n");
                                    }
                                }catch(FileNotFoundException e){
                                    System.out.println();
                                }
                                break;

                            case 3:
                                File del = new File("data.txt");

                                if (del.delete()){
                                    System.out.print(clear);
                                    System.out.println("File Removed!\n");
                                }else{
                                    System.out.println(clear + "File Not Found!\n");
                                }
                                break;


                            case 4:
                                System.out.println(clear+"EXITING... BYE BYE!!\n");
                                working=false;
                                exitpass=false;
                                ask.close();
                                break;
                            default:
                                System.out.println(clear + "INVALID CHOICE!!\n");                       
                            }
                    }

                }else{
                    System.out.println("Wrong Password");
                    passattempts--;
                    System.out.println("\nAttemps: "+passattempts);
                    if(passattempts == 0){
                        System.out.println("\n\nNO More Attempts!");
                        exitpass = false;
                        ask.close();
                    }
                }
        }
    }



    public static void main(String[] args) {
        new SecrectDiary();
    }
}
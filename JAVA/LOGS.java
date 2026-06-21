import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.io.*;

public class LOGS {

    LOGS(){
        Scanner userloggh = new Scanner(System.in);


        final String cls = "\033[H\033[2J";
        System.out.print(cls);

        ArrayList<String> errorr = new ArrayList<>();


        
        while(true){
            String thelog = "";
            int chose = 0;
                System.out.print("========LOG=MAKER========\n");
                System.out.println("1.Write New Log");
                System.out.println("2.Show Logs");
                System.out.println("3.Clear All Logs");
                System.out.println("4.Exit");
                System.out.print("choose: ");

                try{
                    chose = userloggh.nextInt();
                    userloggh.nextLine();
                }catch(InputMismatchException e){
                    System.out.print(cls + "Wrong Number Selected!\n");
                    userloggh.nextLine();
                }


                if(chose == 1){
                    LocalDateTime timedate1 =  LocalDateTime.now();     
                    DateTimeFormatter timedate2 = DateTimeFormatter.ofPattern("MMM dd HH:mm:ss");
                    String timedate3 = timedate1.format(timedate2);     
                    String td = "[" + timedate3 + "]";

                    System.out.print(cls + "Type Your Log (or type \"xit\" to go back)\n-> ");
                    thelog = userloggh.nextLine();
        
                    if(thelog.equalsIgnoreCase("xit")){
                        System.out.print(cls);
                    }else if(thelog.equalsIgnoreCase("")){
                        System.out.print(cls + "You Written Nothing? then, nothing will save!\n");
                    }else{
                        try{
                            System.out.println(cls + "=====Choose=The=Level=====");
                            System.out.println("1.INFO");
                            System.out.println("2.ERROR");
                            System.out.println("3.BACK");
                            System.out.print("Choose: ");
                            chose = userloggh.nextInt();
                            userloggh.nextLine();
                            System.out.print(cls);
                            if (chose == 1){
                                try{
                                    String info = "[INFO] - ";
                                    FileWriter wlog = new FileWriter("Log.txt", true);
                                    wlog.write("\n" +td + info + thelog);
                                    wlog.close();
                                }catch(IOException e){
                                    System.out.print(cls + "CAN'T ABLE TO SAVE the LOG!");
                                }
                            }else if(chose == 2){
                                try{
                                    String error = "[ERROR] - ";
                                    FileWriter wlog = new FileWriter("Log.txt", true);
                                    String elog = "\n" +td + error + thelog;
                                    wlog.write(elog);
                                    errorr.add(elog);
                                    wlog.close();
                                }catch(IOException e){
                                    System.out.print(cls + "CAN'T ABLE TO SAVE the LOG!");
                                }
                            }else if(chose == 3){
                                System.out.print(cls);
                            }else{
                                System.out.print(cls + "Wrong Number Selected! can't able to save the log../.\n");
                            }
        
    
                            
                        }catch(InputMismatchException e){
                            System.out.print(cls + "Wrong Number Selected!\n");
                            userloggh.nextLine();
                        }
                    }

                }else if(chose == 2){
                    try{
                        System.out.println(cls + "1.Show ALL The Logs");
                        System.out.println("2.Show All The Logs [ERRO ONLY]");
                        System.out.println("3.Show Latest Log (recent ERRORS only)");
                        System.out.println("4.Back");
                        System.out.print("choose:");
                        chose = userloggh.nextInt();
                        userloggh.nextLine();

                        switch(chose){
                            case 1:
                                try{
                                    System.out.print(cls);
                                    File r = new File("Log.txt");
                                    Scanner rr = new Scanner(r);
                                    while(rr.hasNextLine()){
                                        String rrr = rr.nextLine();
                                        System.out.println(rrr);
                                    }
                                    rr.close();
                                    System.out.print("\n\nPress Enter to continue../.");
                                    userloggh.nextLine();
                                    System.out.print(cls);
                                }catch(IOException e){
                                    System.out.print(cls + "CAN't ABLE TO READ FILE!\n");
                                }
                                break;
                            case 2:
                                String line;
                                System.out.print(cls + "LOGS:\n");
                                try (BufferedReader eror = new BufferedReader(new FileReader("Log.txt"))){
                                    while((line = eror.readLine()) != null){
                                        if(line.contains("[ERROR]")){
                                            System.out.println(line);
                                        }
                                    }
                                    System.out.print("\n\nPress Enter to continue../.");
                                    userloggh.nextLine();
                                    System.out.print(cls);                                    
                                }catch(IOException e){
                                    System.out.print(cls + "CAN't ABLE TO READ FILE!\n");
                                }
                                break;
                            case 3:
                                System.out.println(cls + "Your Recent Logs(Error)");
                                if(errorr.isEmpty()){
                                    System.out.print("Nothing....");
                                }else{
                                    for(String theerror : errorr){
                                        System.out.println(theerror);
                                    }
                                }
                                System.out.print("\n\nPress Enter to continue../.");
                                userloggh.nextLine();
                                System.out.print(cls);
                                break;
                            case 4:
                                System.out.print(cls);
                                break;
                            default:
                                System.out.print(cls + "Wrong Number Selected!\n");
                        }

                    }catch(InputMismatchException e){
                        System.out.print(cls + "Wrong Number Selected!\n");
                        userloggh.nextLine();
                    }
                }else if(chose == 3){
                    System.out.print(cls + "Are You Sure!(y or n)\n:");
                    String arusure = userloggh.nextLine();
                    if(arusure.equalsIgnoreCase("y")){
                        System.out.print(cls + "Are You REALLY Sure!(y or n)\n:");
                        String arusure2 = userloggh.nextLine();
                        if(arusure2.equalsIgnoreCase("y")){
                            System.out.print(cls + "Are You SERIOUSLY sure!(y or n)\n:");
                            String arusure3 = userloggh.nextLine();
                            if(arusure3.equalsIgnoreCase("y")){
                                try{
                                    FileWriter wlog = new FileWriter("Log.txt");
                                    wlog.write("LOGS:");
                                    wlog.close();
                                    System.out.print(cls + "All logs cleared!\n");
                                }catch(IOException e){
                                    System.out.print(cls + "CAN'T ABLE TO CLEAR ALL THE LOG's!");
                                }
                            }else{
                                System.out.print(cls);
                            }

                        }else{
                            System.out.print(cls);
                        }
                    }else{
                        System.out.print(cls);
                    }
                }
                else if(chose == 4){
                    System.out.print(cls);
                    break;

                }else{
                    System.out.print(cls + "Wrong Number Selected!\n");

                }

            
            
        }
        userloggh.close();


    }
    
    public static void main(String[] args) {
        new LOGS();
    }
}
//made by jasmeet with no use of ai anywhere!
//challenge completed!
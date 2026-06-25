package Terminal;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.io.*;
public class TERMINAL {
    final Map<String, Runnable> cmd = new HashMap<>();
    final String clear = "\033[H\033[2J";
    final String user = "[KINGG@JAVA]$ ";
    private boolean exit = false;
    Scanner inp = new Scanner(System.in);
    String uin;

    TERMINAL(){
        System.out.println(clear + "TERMINAL Made By Jasmeet in JAVA\n");
        commands();
        wloop();
    }

    public void usr(){
        System.out.print(user);
        uin = inp.nextLine().trim();
    }

    public void wloop(){
        while(!exit){

            uin = "";
            usr();

            if(uin.equals("exit")){
                exit = true;
                inp.close();
            }else if(cmd.containsKey(uin)){
                cmd.get(uin).run();
            }else if(uin.equals("")){
                //nothing../.
            }else{
                System.out.print(uin + " : Command Not Found!\n");
            }

        }
    }

    public void commands(){
        cmd.put("clear", () -> System.out.print(clear));
        cmd.put("ls", () -> Com("ls"));
        cmd.put("fastfetch", () -> Com("fastfetch"));
        cmd.put("q", ()->Com("htop"));
        cmd.put("info", () -> System.out.println("\nTERMINAL Made By Jasmeet in JAVA\n"));
    }

    public void Com(String comand){
        
    }
    

    
    public static void main(String[] args) {
        new TERMINAL();
    }
    
}

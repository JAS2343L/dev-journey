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
        System.out.println(clear + "TERMINAL\n");
        wloop();
    }

    public void usr(){

        System.out.print(user);
        uin = inp.nextLine().trim();
    }

    public void wloop(){
        while(!exit){
            commands();

            uin = "";
            usr();

            if(uin.equals("exit")){
                exit = true;
                inp.close();
            }else if(cmd.containsKey(uin)){
                cmd.get(uin).run();
            }else{
                System.out.print(uin + " : Command Not Found!\n");
            }

        }
    }

    public void commands(){
        cmd.put("clear", () -> System.out.print(clear));
        cmd.put("ls", () -> ls());
        cmd.put("fastfetch", () -> fastfetch());
    }

    public void ls(){
        ProcessBuilder PB = new ProcessBuilder();
        PB.command("bash", "-c", "ls");
        try{
            Process P = PB.start();
            BufferedReader BR = new BufferedReader(new InputStreamReader(P.getInputStream()));
            String i;
            while((i = BR.readLine()) !=null ){
                System.out.println(i);
            }
        }catch(IOException e){
            System.out.println("ERROR RUNNING COMMAND!");
        }
    }

    public void fastfetch(){
        try(BufferedReader ff = new BufferedReader(new FileReader("JAVA/Terminal/fastfetch.txt"))){
            String i;
            while((i = ff.readLine()) != null){
                System.out.println(i);
            }
        }catch(IOException e){
            System.out.println("ERROR RUNNING COMMAND!");
        }
    }
    
    public static void main(String[] args) {
        new TERMINAL();
    }
    
}

package Terminal;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.io.*;
public class TERMINAL {
    final Map<String, Runnable> cmd = new HashMap<>();
    final String clear = "\033c";
    final String user = "❯ ";
    private boolean exit = false;
    private boolean catt = false;
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
            catt = false;

            uin = "";
            usr();

            if(uin.equals("exit")){
                exit = true;
                inp.close();
            }else if(cmd.containsKey(uin)){
                cmd.get(uin).run();
            }else if(uin.equals("")){
                //////////will do nothing../../
            }else{
                System.out.print(uin + " : Command Not Found!\n");
            }

        }
    }

    public void commands(){
        cmd.put("clear", () -> System.out.print(clear));
        cmd.put("ls", () -> list());
        cmd.put("fastfetch", () -> Com("fastfetch"));
        cmd.put("q", ()->Com("htop"));
        cmd.put("info", () -> System.out.println("\nTERMINAL Made By Jasmeet in JAVA\n"));
        cmd.put("cat", ()-> cat());
    }

    public void Com(String comand){

    }
    public void list(){
            File f = new File("JAVA/Terminal");
            String[] files = f.list();
            for(String i : files){
                System.out.println(i);
            }
    }
    public void cat(){
        while(!catt){
            System.out.print("cat"+user);
            uin = "";
            uin = inp.nextLine().trim();
            if(uin.equals("exit")){
                catt = true;
            }else{
                try(BufferedReader br = new BufferedReader(new FileReader("JAVA/Terminal/"+uin))){
                    String i;
                    while((i = br.readLine())!=null){
                        System.out.println(i);
                    }
                }catch(IOException e){
                    System.out.print(uin + " File not Found!\n");
                }
            }
        }
    }

    
    public static void main(String[] args) {
        new TERMINAL();
    }
    
}

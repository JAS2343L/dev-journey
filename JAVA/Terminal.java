import java.util.Scanner;

public class Terminal {
    Scanner scan = new Scanner(System.in);
    final String cls = "\033[H\033[2J";
    boolean exit = false;
    String uin = "";

    Terminal(){
        System.out.print(cls + "Terminal 1.0 made by Jasmeet\n\n");
        while(!exit){
            uin = "";
            theusr();
            if(uin.equals("exit")){
                exit = true;
            }else if(uin.equals("clear")){
                System.out.print(cls);
            }else{
                System.out.println(uin+"Command Not Found !" );
            }
        }
    }

    public void theusr(){
        System.out.print("[Kingg@JAVA]$ ");
        uin = scan.nextLine();
    }


    public static void main(String[] args) {
        new Terminal();
    }
}

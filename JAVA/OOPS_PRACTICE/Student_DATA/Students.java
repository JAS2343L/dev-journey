package OOPS_PRACTICE.Student_DATA;
import java.text.BreakIterator;
import java.util.*;

public class Students {

    Students(){

        Scanner scn = new Scanner(System.in);
        ArrayList<SINFO> stdd = new ArrayList<>();
        String clr = "\033[H\033[2J";
        boolean o = true;
        System.out.println(clr);

        while(o){
            int choice = 0;
            System.out.println(clr+"=====/SCHOOL DATABSE/=====");
            System.out.println("1. New Student");
            System.out.println("2. View Existing Student's");
            System.out.println("3. Exit");
            System.out.print("Your Choice: ");
            choice = scn.nextInt();
            scn.nextLine();

            switch(choice){
                case 1:
                    System.out.print(clr+"Name Of the student: ");
                    String n = scn.nextLine();
                    System.out.print("Declare The Roll.no for the student: ");
                    int r = scn.nextInt();
                    scn.nextLine();
                    System.out.print("How the student is perfoming in class: ");
                    String gb = scn.nextLine();
                    stdd.add(new SINFO(n, r, gb));
                    break;

                case 2:
                    System.out.println(clr+"Name, Roll.no, How-he-is-performing");
                    for(SINFO m : stdd){
                        m.INtro();
                    }
                    System.out.print("press Enter to continue.../.");
                    scn.nextLine();
                    break;
                case 3:
                    System.out.println(clr);
                    o = false;
                    break;
            }
            
        }

        /*stdd.add(new SINFO("ABC", 122));
        stdd.add(new SINFO("DEF", 244));
        stdd.add(new SINFO("GHI", 365));

            for(SINFO sh : stdd){
                sh.INtro();
            }*/
        }

    public static void main(String[] args) {
        new Students();
    }

}

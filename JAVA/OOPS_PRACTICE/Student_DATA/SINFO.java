package OOPS_PRACTICE.Student_DATA;

public class SINFO {
    String name;
    int rollno;
    String goodorbad;

    public SINFO(String n, int r, String gb){
        this.name = n;
        this.rollno = r;
        this.goodorbad = gb;
    }

    public void INtro(){
        System.out.println(name +" | "+rollno+" | "+goodorbad);
    }
}

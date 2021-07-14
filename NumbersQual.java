import java.util.*;
public class main{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("MATRIC NUM:- CS2019020XXX");
        System.out.println("NAME :- OLADEXXXXXXX");
        
        int FirstNum, SecondNum;
        System.out.println("ENTER YOUR FIRST NUMBER");
        FirstNum = input.nextInt();
        
        System.out.println("ENTER YOUR SECOND NUMBER");
        SecondNum = input.nextInt();
        
        if(FirstNum == SecondNum){
            System.out.println("NUMBERS ARE EQUAL");
        }
        else {
            System.out.println("NUMBERS ARE NOT EQUAL");
        }
    }
}

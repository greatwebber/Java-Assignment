import java.util.*;
public class main{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("MATRIC NUM:- CS20190201238");
        System.out.println("NAME :- OLADELE BAROKAH MORENIKEJI");
        
        double Bmi;
        
        System.out.println("ENTER YOUR BMI :-");
        Bmi = input.nextDouble();
        
        System.out.println("Your BMI = "+ Bmi);
        
        if (Bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (Bmi >= 18.5 && Bmi <= 24.9){
            System.out.println("Healthy");
        }
        else if (Bmi > 24.9){
            System.out.println("Overweight");
        }
    }
}
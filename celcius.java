import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner input = new Scanner (System.in);
      System.out.println("MATRIC NUM:- CS20190201238");
      System.out.println("NAME :- OLADELE BAROKAH MORENIKEJI");
      
      float F, C;
      System.out.println("Enter F Value ");
      F = input.nextFloat();
      C = (( F - 32 ) * 100) / (212 - 32);
      
      System.out.println("C celcius = "+ C);
    }
}

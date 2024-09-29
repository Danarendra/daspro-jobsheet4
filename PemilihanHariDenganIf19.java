import java.util.Scanner;
public class PemilihanHariDenganIf19 {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("insert day: ");
    int day = sc.nextInt();

   
    if (day<6){
      System.out.println("The day is weekday");
    }else if (day == 6){
      System.out.println("The day is weekend");
    }else if (day == 7){
      System.out.println("The day is weekend");
    }else if (day>7){
      System.out.println("Error");
    }

    




    
 }   

    
}

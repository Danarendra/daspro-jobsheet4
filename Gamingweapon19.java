import java.util.Scanner;

public class Gamingweapon19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert shooting range: ");
        int range = sc.nextInt();

        if (range <= 5) {
            System.out.println( "use melee weapons.");
        } else if (range >= 5) {
            System.out.println("use long range weapons.");
        }
    }
}

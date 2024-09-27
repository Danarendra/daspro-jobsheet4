import java.util.Scanner;
public class MemilahHari19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName, dayType;
        System.out.println("Input day name: ");
        dayName = sc.nextLine();
        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursdsay":
            case "friday": 
                dayType = "weekday";
                System.out.println(dayName + " is a " + dayType);
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                System.out.println(dayName + " is a " + dayType);
                break;
            default:
                dayType = "invalid day name";
                System.out.println(dayName + " is a " + dayType);
        
        }
    }

}
    


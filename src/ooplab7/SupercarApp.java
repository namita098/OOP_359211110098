package ooplab7;
import java.util.Scanner;
public class SupercarApp {
    public static void main(String[] args) {
        //create object as Supercar
        //default constructor
        Supercar s4 = new Supercar();
        s4 = inputData(s4);
        System.out.println(s4.toString());
    }
    private static Supercar inputData(Supercar s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a saudent info");
        System.out.print("mySuperCar");
        s.setCarbrand(scanner.nextLine());
        System.out.print("Carbrand:");
        s.setCarcolor(scanner.nextLine());
        System.out.print("Carcolor:");
        s.setCarenginesize(scanner.nextLine());
        System.out.print("Carenginesize:");
        s.setMaxspeed(scanner.nextLine());
        System.out.print("Maxspeed:");
        s.setCountryoforigin(scanner.nextLine());
        return s;
    }//inputData
}

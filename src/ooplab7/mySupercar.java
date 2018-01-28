package ooplab7;

import java.util.ArrayList;
import java.util.Scanner;


public class mySupercar {
    public static void main(String[] args) {
        ArrayList<Supercar> myCarList = new ArrayList<Supercar>();

        myCarList = inputData(myCarList);
        System.out.println("== Show Super Car Info ==");
        for (int i=0;i<myCarList.size();i++){
            System.out.println(myCarList.get(i).getSuperCarInfo());
        }
    }//main

    private static ArrayList inputData(ArrayList myCarList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your Supercar info: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Super car: "+(i+1));
            System.out.print("Brand: ");
            String Carbrand =scanner.nextLine();
            System.out.print("Color: ");
            String Carcolor = scanner.nextLine();
            System.out.print("Engine Size: ");
            String EngineSize = scanner.nextLine();
            System.out.print("Max Speed: ");
            String Maxspeed = scanner.nextLine();
            System.out.print("Country of origin: ");
            String Countryoforigin = scanner.nextLine();
            Supercar car  = new Supercar(Carbrand,Carcolor,EngineSize,Maxspeed,Countryoforigin);
            myCarList.add(car);
        }
        return myCarList;
    }//inputData
}//class
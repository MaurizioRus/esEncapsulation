/*
Achieve encapsulation using getters/setters for a class House that has the following instance variables:
an int floorsNumber
a string address
an array of strings residentsNames
use a tester class to:
set the values by asking the user to input them
for the residentsNames, the user will have to input a list of names separated by a comma (e.g. John,Lucy,Peter)
prints the house details using the getters and String.format()
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        House house = new House();

        System.out.println("insert the number of floors : ");
        int numOfFloors1 = scanner.nextInt();
        house.setFloorsNumber(numOfFloors1);

        System.out.println("insert the address : ");
        scanner.nextLine(); // qui per consumare il carattere di fine stringa ,senza causa problemiin input
        String address1 = scanner.nextLine();
        house.setAddess(address1);

        System.out.println("insert the resident names separated by comma (,) : ");
        String residentsIn = scanner.nextLine();
        String[] residentNames = residentsIn.split(",");
        house.setResidentsNames(residentNames);

        System.out.println(String.format("Floors : %d" , house.getFloorsNumber()));

        System.out.println(String.format("Address : %s" , house.getAddess()));

        for(String residentTmp : house.getResidentsNames()){
            System.out.println(String.format("-- %s" , residentTmp.trim()));
        }
    }
}
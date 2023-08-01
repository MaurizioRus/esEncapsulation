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


public class Main {
    public static void main(String[] args) {

        System.out.println("User please insert the value");

        House house = new House();

        house.setFloorsNumber(3);
        house.setAddess("via Tarquinio 21");

        String[] residentNames = {"Aldo" , "Giovanni" , "Giacomo"};

        house.setResidentsNames(residentNames);

        System.out.println(String.format("Floors : %d" , house.getFloorsNumber()));

        System.out.println(String.format("Address : %s" , house.getAddess()));

        for(String residentTmp : house.getResidentsNames()){
            System.out.println(String.format("-- %s" , residentTmp.trim()));
        }
    }
}
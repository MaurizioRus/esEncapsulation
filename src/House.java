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
public class House {

    private int floorsNumber;
    private String addess;
    private String[] residentsNames;


    public void setFloorsNumber(int floorsNumber){
        this.floorsNumber = floorsNumber;
    }

    public void setAddess(String addess){
        this.addess = addess;
    }

    public void setResidentsNames(String[] residentsNames){
        this.residentsNames = residentsNames;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public String getAddess(){
        return addess;
    }

    public String[] getResidentsNames(){
        return residentsNames;
    }
}



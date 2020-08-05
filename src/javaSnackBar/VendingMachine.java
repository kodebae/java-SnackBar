package javaSnackBar;

public class VendingMachine {
    private static int maxId = 0;
    private int vMId;
    private String vName;


    // Consturctor
    public VendingMachine(String vName){
        maxId++;
        this.vMId = maxId;
        this.vName = vName;
    } // closes constructor


    //Getters 
    public int getVMId(){ //food.getVMId
        return vMId;
    }
    public String getVName(){
        return vName;
    } // last getter



    // Setters 
    public void setVMId(int vMId){
        this.vMId = vMId;
    }
    public void setVName(String vName){
        this.vName = vName;
    } // last setter

}// closes Vending Machine Class
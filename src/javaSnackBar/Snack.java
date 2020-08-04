package javaSnackBar;

public class Snack {
    private static int maxId = 0;
    private int snackId;
    private String snackName;
    private int snackQuantity;
    private int snackCost;
    private int vMId;

    //Constructor 
    public Snack(String snackName, int snackQuantity, int snackCost, int vMId) {
        maxId++;
        snackId = maxId;
        this.snackName = snackName;
        this.snackQuantity = snackQuantity;
        this.snackCost = snackCost;
        this.vMId = vMId;

    } // close constructor


    //Getters
    public int getSnackId(){
        return snackId;
    }
    public String getSnackName(){
        return snackName;
    }
    public int getSnackQuantity(){
        return snackQuantity;
    }
    public int getSnackCost(){
        return snackCost;
    }
    public int getVMId(){
        return vMId;
    } // last Getter


    //Setters
    public void setSnackId(int snackId){
        this.snackId = snackId;
    }
    public void setSnackName(String snackName){
        this.snackName = snackName;
    }
    public void setSnackQuantity(int snackQuantity){
        this.snackQuantity = snackQuantity;
    }
    public void setSnackCost (int snackCost){
        this.snackCost = snackCost;
    }
    public void setVMId(int vMId){
        this.vMId = vMId;
    } // last Setter

} // closes Snack class
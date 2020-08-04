package javaSnackBar;

public class Customer {
    private static int maxId = 0;
    private int customerId;
    private String fname;
    private String snacks;
    private String sodas;
    private int pocketChange;

    // Constructor
    public Customer(String fname, String snacks, String sodas, int pocketChange) {

        maxId++;
        customerId = maxId;
        this.fname = fname;
        this.snacks = snacks;
        this.sodas = sodas;
        this.pocketChange = pocketChange;
    }


    // Getters
    public int getCustomerId() {
        return customerId;
    }
    public String getFname() {
        return fname;
    }
    public String getSnacks() {
        return snacks;
    }
    public String getSodas() {
        return sodas;
    }
    public int getPocketChange() {
        return pocketChange;
    }

    // Setters 
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void  setSnacks(String snacks) {
        this.snacks = snacks;
    }
    public void setSodas(String sodas) {
        this.sodas = sodas;
    }
    public void setPocketChange(int pocketChange) {
        this.pocketChange = pocketChange; 
    }
}
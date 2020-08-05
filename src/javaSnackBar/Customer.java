package javaSnackBar;

public class Customer {
    private static int maxId = 0;
    private int customerId;
    private String fname;
    private double pocketChange;

    // Constructor
    public Customer(String fname, double pocketChange) {

        maxId++;
        customerId = maxId;
        this.fname = fname;
        this.pocketChange = pocketChange;
    } //close constructor


        // Getters
        public int getCustomerId() {
            return customerId;
        }
        public String getFname() {
            return fname;
        }
        public double getPocketChange() {
            return pocketChange;
        } // last Getter

        // Setters 
        public void setFname(String fname) {
            this.fname = fname;
        }
        public void setPocketChange(double pocketChange) {
            this.pocketChange = pocketChange; 
        }// last Settter

        //Other Methods
        public void addPocketChange(double addPocketChange){
            this.pocketChange += addPocketChange;
            //this.pocketChange = this.pocketChange + addPocketChange;
        }
        public void buySnacks(int quantity, Snack snack){
            snack.buyASnack(quantity);
           this.pocketChange -= snack.getTotalCost(quantity);
        }

} // closes Customer class
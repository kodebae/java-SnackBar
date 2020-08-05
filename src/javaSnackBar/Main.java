package javaSnackBar;
//imports go below here 
// import Customer;
//      System.out.println(c1);



public class Main {
    private static void workWithData(){
        // all of my variables go here ex Customer c1 = new Customer('Jane, $43.50') this is how you instantiate an object
       Customer jane = new Customer("Jane", 45.25);
       Customer bob = new Customer("Bob", 33.14);
       VendingMachine food = new VendingMachine("Food");
       VendingMachine drink = new VendingMachine("Drink");
       VendingMachine office = new VendingMachine("Office");
       Snack chips = new Snack("Chips", 36, 1.75, food.getVMId());
       Snack chocolate = new Snack("Chocolate", 36, 1.00, food.getVMId());
       Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getVMId());
       Snack soda = new Snack("Soda", 24, 2.50, drink.getVMId());
       Snack water = new Snack("Water", 20, 2.75, drink.getVMId());

        jane.buySnacks(3, soda);
        System.out.println(jane.getPocketChange());
        System.out.println(soda.getSnackQuantity());
        System.out.println();
        
        jane.buySnacks(1, pretzel);
        System.out.println(jane.getPocketChange());
        System.out.println(pretzel.getSnackQuantity());
        System.out.println();

        bob.buySnacks(2, soda);
        System.out.println(bob.getPocketChange());
        System.out.println(soda.getSnackQuantity());
        System.out.println();

        jane.addPocketChange(10.00);
        System.out.println(jane.getPocketChange());
        System.out.println();

        jane.buySnacks(1, chocolate);
        System.out.println(jane.getPocketChange());
        System.out.println(chocolate.getSnackQuantity());
        System.out.println();

        pretzel.addQuantity(12);
        System.out.println(pretzel.getSnackQuantity());
        System.out.println();

        bob.buySnacks(3, pretzel);
        System.out.println(bob.getPocketChange());
        System.out.println(pretzel.getSnackQuantity());
    }
        public static void main(String[] args) {
        workWithData();
    }
}

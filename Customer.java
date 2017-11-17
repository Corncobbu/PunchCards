public class Customer {
    
    private String name;
    private int saladPunches;
    private int coffeePunches;
   
    public Customer(String n){
        name =n;
    }
    public Customer (String n, int saladCount, int coffeeCount){
        name = n;
        saladPunches = saladCount;
        coffeePunches = coffeeCount;
    }

    public String getName() {
        return name;
    }

    public int getSaladPunchCount() {
        return saladPunches;
    }

    public int getCoffeePunchCount() {
        return coffeePunches;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void subtractSalad(int num){
        saladPunches -= num;
        System.out.println("New salad punches: "+saladPunches);
    }
    
    public void subtractCoffee(int num){
        coffeePunches -= num;
        System.out.println("New coffee punches: "+coffeePunches);
    }

    public void addSaladPunch (int inc) {
        saladPunches += inc;
        if (saladPunches >=12){
            saladPunches -= 12;
            System.out.println(name + " has completed their salad card!");
            System.out.println(name + " has " + saladPunches + " salad card punches.");
        }
        else{
            System.out.println(name + " has " + saladPunches + " salad card punches.");
        }
    }
    public void addCoffeePunch (int inc) {
        coffeePunches += inc;
        if (coffeePunches >=12){
            coffeePunches -= 12;
            System.out.println(name + " has completed their coffee card!");
            System.out.println(name + " has " + coffeePunches + " coffee card punches.");
        }
        else{
            System.out.println(name + " has " + coffeePunches + " coffee card punches.");
        }
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Salad punch count: " + saladPunches + ", Coffee punch count: "+ coffeePunches;
    }
    
}

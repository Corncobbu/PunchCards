import java.util.ArrayList;
import java.util.Scanner;

public class CardDatabase {
    public static void main(String[] args) {
        ArrayList<Customer> cards = new ArrayList();
        boolean running = true;
        
        Customer Bob = new Customer("Bob", 5, 7);
        Customer Anna = new Customer("Anna", 0, 0);
        Customer PickleRick= new Customer ("Pickle Rick", 11, 11);
        
        cards.add(Bob);
        cards.add(Anna);
        cards.add(PickleRick);
        
        Scanner input = new Scanner(System.in);
        
        while(running){
            
            System.out.println("Enter the name of a customer. Press X to close");
            String name = input.nextLine(); 
            //System.out.println(name);
            //insert inner while loop
            if (containsName(name, cards)> -1 && !name.equalsIgnoreCase("X")){
                int index = containsName(name,cards);
                System.out.println(cards.get(index));
                
                System.out.println("Press 1 to add coffee punches, press 2 to add salad punches"); 
                int ans = input.nextInt();
                switch (ans) {
                    case 1:
                        {
                            System.out.println("How many coffee punches would you like to add?");
                            int inc = input.nextInt();
                            cards.get(index).addCoffeePunch(inc);
                            name = input.nextLine(); //new line buffer
                            break;
                        }
                    case 2:
                        {
                            System.out.println("How many salad punches would you like to add?");
                            int inc = input.nextInt();
                            cards.get(index).addSaladPunch(inc);
                            name = input.nextLine(); //new line buffer
                            break;
                        }
                    default:
                        System.out.println("Invalid input");
                        name = input.nextLine(); //new line buffer
                        break;
                }
            }
            
            else if (containsName(name,cards)==-1 &&!name.equalsIgnoreCase("X")){
                System.out.println("Customer not found.");
            }
            
            else{
                System.out.println("Bye!");
                running = false;
            }
        }
        
        
    }
    
    public static int containsName(String n, ArrayList<Customer> list){
        for(Customer c: list){
            if (c.getName().equals(n)){ 
                return list.indexOf(c);
            }
        }
        return -1;
    }
    
}

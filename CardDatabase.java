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
            System.out.println("Enter the name of a customer.");
            String name = input.nextLine(); //Doesn't work. Find way to store input to use .contain
            if (cards.contains(name)){ //customer array isn't strings hnng
                //int index = name.getIndex() or smth
                System.out.println("Press 1 to add coffee punches, press 2 to add salad punches, press 3 to close"); 
                int ans = input.nextInt();
                switch (ans) {
                    case 1:
                        {
                            System.out.println("How many coffee punches would you like to add?");
                            int inc = input.nextInt();
                            break;
                        }
                    case 2:
                        {
                            System.out.println("How many salad punches would you like to add?");
                            int inc = input.nextInt();
                            break;
                        }
                    case 3:
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
            }
            //implement close program later
            //else if(input == close){
            //  running = false;
            //}
            else{
                System.out.println("Customer not found.");
            }
        }
        
        
    }
    
    
}

package cart;

import java.io.Console;
import java.util.List;
import java.util.LinkedList;

public class ShoppingCart {
    
    public static void main(String[] args) {
        // print entry line and prompt input
        Boolean continueLoop = true;
        Console cons = System.console();

        // initialising List
        List<String> shoppingCart = new LinkedList<>();

        // introduction statement
        System.out.println("Welcome to your shopping cart");

        // while loop to get user input 
        while (continueLoop) {
            // obtain user input (functions: add, remove, list)
            String userInput = cons.readLine();
            // cleaning input string
            userInput = userInput.replaceAll(",", "");
            String[] inputArray = userInput.split(" ");
            String userAction = inputArray[0];
            
            // execute relevant command based on detected userAction
            switch (userAction) {
                case "exit": 
                    continueLoop = false;
                    break;
                
                // checks for duplicate and adds if not existing in linkedlist
                case "add":
                    for (int i = 1; i < inputArray.length; i++) {
                        if (shoppingCart.contains(inputArray[i])) {
                            System.out.printf("You have %s in your cart\n", inputArray[i]);
                        } else {
                            shoppingCart.add(inputArray[i]);
                            System.out.printf("%s added to cart\n", inputArray[i]);
                        }
                    }
                    break;

                // checks if index is valid and delete specific index item
                case "delete":
                    int index = Integer.parseInt(inputArray[1]) - 1;
                    if ((index + 1) > shoppingCart.size()) {
                        System.out.println("Incorrect item index");
                    } else {
                        System.out.printf("%s removed from cart\n", shoppingCart.get(index));
                        shoppingCart.remove(index);
                    }
                    break;
                
                // prints out list items
                case "list":
                    if (shoppingCart.size() == 0) {
                        System.out.println("Your cart is empty");
                    } else {
                        for (int i = 0; i < shoppingCart.size(); i++) {
                            System.out.printf("%d. %s\n", i + 1, shoppingCart.get(i));
                        }
                    }
                    break;

                // for any other action detected 
                default:
                    System.out.println("unknown action detected");
                    break;
            }
        }
    }
}

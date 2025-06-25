
/**
 * Driver for ShoppingCart to test out program
 */
public class Driver{
    public static void main(String[] args){
        System.out.println("Welcome to Trader Joe's!\n ");
        //create  items to add to cart
        Item[] anItem = {new Item("Chocolate Bar",399),
                         new Item("Salad", 899),
                         new Item("Cereal", 1099),
                         new Item("Dozen Eggs", 1299)};
                         
        //create a shopping cart
        ShoppingCart cart = new ShoppingCart();
        //add items to cart 
        for (int i = 0; i< anItem.length; i++){
            Item nextItem = anItem[i];
            cart.add(nextItem);
        }
        
        //check budget
        cart.checkBudget(3000);
        
        //checkout
        //just call method since we did the calculations in the ShoppingCart Class
        cart.Checkout();
        
    }
}

/**
 * ShoppingCart 
 * Miriam Shamsiev
 * 09.26.2023
 */
public class ShoppingCart
{
    private BagInterface<Item> bag;
    private int totalPrice;
    
    //constructor 
    public ShoppingCart(){
    
        totalPrice = 000;
        
        bag = new ResizableArrayBag();
        
    }
    //another constructor
    public ShoppingCart(BagInterface<Item> InitialBag){
    
        totalPrice = 000;
        
        bag = InitialBag;

    }
    //method add
    public boolean add(Item itemToAdd){
        
        totalPrice += itemToAdd.getPrice();
        
        return bag.add(itemToAdd);//call method
    }
    //method addMultiple
    public boolean addMultiple(Item itemToAdd, int AmountItems){
        
        boolean name = false;
        
        for(int i = 0; i < AmountItems; i++){
            name = add(itemToAdd);
        }
        return(name); 
    }
    //method to remove an item from shoppingcart
    public Item removeUnspecItem(){
        
        Item tempItem;
        tempItem = bag.remove();//removes an item 
        totalPrice -= tempItem.getPrice();//updates the price by subracting the item price from budget price
        return (tempItem); 

    }
    //method to remove specified item
    public boolean removeSpecItem(Item anItem){
        boolean tempBoolean;
        tempBoolean = bag.remove(anItem);
        totalPrice -= anItem.getPrice();
        return tempBoolean;
        
    }
    //method check budget
    public int checkBudget(int budget){
        System.out.println("Total Budget: " + budget/100 + "." + budget%100);
        System.out.println("Total price of Items in bag: \n" + "\t$" + totalPrice/100 + "." + totalPrice%100 +"\n");
        
        while (totalPrice > budget){ 
            Item tempItem;
            tempItem = bag.remove();//removes an item 
            System.out.println("This item is over budget | removing item: \n" + tempItem.toString() + "\n");
            totalPrice -= tempItem.getPrice(); 

        }
        
        System.out.println("Total price of Items in bag after checking budget: \n\t$" 
        + totalPrice/100 + "." + totalPrice%100 + "\n");
        return totalPrice;
        
        
    }
    //method checkout 
    public int Checkout(){
        System.out.println("Checking out shopping cart: ");
        while(!bag.isEmpty()){
            Item tempItem = bag.remove();
            System.out.println(tempItem.toString());
        }
        System.out.println("\n Total price of items in bag at Checkout: \n" 
        + "\t$" + totalPrice/100 + "." + totalPrice%100);
        return (totalPrice);
    }
}

// Class for a sale of one item with discount
// expressed as a percent of the price but no
// other adjustments.
// Class invariants: the price is non-negative,
//                   the name is a nonempty string
//                   the discount is non-negative

public class DiscountSale extends Sale {
  private double discount; // A percent of the
                           // price
                           // Cannot be negative
  // DiscountSale() - a default constructor
  public DiscountSale() {
    super();
    discount = 0;
  }
  
  // DiscountSale() - a conversion constructor
  // Preconditions: theName is a nonempty string,
  //                thePrice is non-negative/
  //                theDiscount is a percent of
  //                price and is non-negative
  public DiscountSale(String theName,
                      double thePrice,
                      double theDiscount) {
    super(theName, thePrice);
    setDiscount(theDiscount);
  }

  // DiscountSale() - A copy constructor
  public DiscountSale(DiscountSale originalObject) {
    super(originalObject);
    discount = originalObject.discount;
  }
  
  public static void announcement() {
    System.out.println("This is the DiscountSale class.");
  }

  // bill() - Returns the discounted price of the
  //          item
  public double bill() {
    double fraction = discount / 100;
    return (1 - fraction) * getPrice();
  }

  // getDiscount() - An accessor
  public double getDiscount() {
    return discount;
  }

  // setDiscount() - A mutator
  // Precondition: Discount is a non-negative
  //               percent
  public void setDiscount(double newDiscount) {
    if (newDiscount >= 0)
      discount = newDiscount;
    else {
      System.out.println("Error: Negative discount.");
      System.exit(0);
    }
  }

  // toString() - returns the name and formatted
  //              price and discount as a string
  public String toString() {
    return (getName() + " Price $ "
              + String.format("%4.2f", getPrice())
              + " Discount = " + discount + "%\n"
              + "Total cost = $"
              + String.format("%4.2f", bill()));
  }
  

  // equals() - Returns true if the objects are
  //            equal
  public boolean equals(Object otherObject) {
    // If otherObject is null, they can't be
    // equals
    if (otherObject == null)
      return false;

    // getClass() returns a representation of the
    // object's class. We can use it to compare
    // two object to see if they are of the same
    // class. If they aren't, they can't be
    // equal.
    else if (getClass() != otherObject.getClass())
      return false;
    else {
      DiscountSale otherSale = (DiscountSale)otherObject;
      return (getName().equals(otherSale.getName())
                && (getPrice() == otherSale.getPrice())
                && discount == otherSale.discount);
    }
  }
}
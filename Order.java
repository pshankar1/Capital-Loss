public class Order {
  private char version; 

  private int unitPrice, quantity; 
 
  /*****
   * Creates Purchases of how much can be bought 
   and whether or not something is bought or sold
   ***********/
  public Order(int quantity, int unitPrice, char version) {
    this.unitPrice = unitPrice;
    this.quantity = quantity;
    this.version = version;
  }

  public void assignUnitPrice(int unitPrice) {
    this.unitPrice = unitPrice;
  }

  
  public int getUnitPrice() {
    return unitPrice;
  }

  public void assignversion(char version) {
    this.version = version;
  }
  public void assignQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getQuantity() {
    return quantity;
  }

 
  


  public char getversion() {
    return version;
  }

  public String toString() {
    return (version == 'B') ? "Purchased " + quantity + " quantitiy at " + unitPrice : "Vend " + quantity + " amt at " + unitPrice ;
  }

}
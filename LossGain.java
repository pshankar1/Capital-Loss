import java.util.ArrayList;
import java.util.Iterator;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;

import java.io.InputStreamReader;


class LossGain {
  Q purchase;
  Q vendor;

  public LossGain(Q purchase, Q vendor) {
    this.purchase = purchase;
    this.vendor = vendor;
  }
/************
how much was ordered money
made and 
the loss of money 
all initialized

it will iteratre until theere are no values left
******/
  public int moneyMadeCalc() {
    int purchaseamt = 0,vendoramt = 0,vendorPrice = 0,purchasePrice = 0,moneyMade = 0,vendorValue = 0,purchaseValue = 0;


/*********

loop will check if vendor sale vvalues are done
it will iterate and check how much was each price
and once a purchase is made it applies
new stored calues to get the loss of money 
*********/
    while (!vendor.isEmpty()) {
      // extract the oldest vendor order.
      Order vendorOrder = vendor.dequeue();
      if (vendorOrder != null) {
        vendoramt = vendorOrder.getQuantity();
        vendorPrice = vendorOrder.getUnitPrice();
        vendorValue = vendoramt * vendorPrice; 
      }
      moneyMade = vendorValue;
/*********

loop will find the oldest purchased order 
and will have an if statements that statement means that
it will keep tracking the loss from purchase until there
are no values left to be calculating the loss
moneyMade is the final total of the money increased or lost from sale
*********/    
      while (vendoramt >= 0 && !purchase.isEmpty()) {
        // extract the oldest purchase order.
        Order purchaseOrder = purchase.dequeue();
        if (purchaseOrder != null) {
          purchaseamt = purchaseOrder.getQuantity();
          purchasePrice = purchaseOrder.getUnitPrice();
          vendoramt -= purchaseamt; 
          purchaseValue = (vendoramt < 0) ? (vendoramt + purchaseamt) * purchasePrice : purchaseamt * purchasePrice;
        }
        moneyMade -= purchaseValue;
      }
    }
    return moneyMade;
  }

}

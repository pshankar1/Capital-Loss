class Q {
  private Order[] queue;
  private int size,biggest,first,last;

/*********

finds the biggest value to compare
and then it sees if entered values are full or empty to compare
initializes and sets enqueu and dequeue then prints it with 2 strings 
***********/
  public Q(int biggest) {
    this.biggest = biggest;
    queue = new Order[this.biggest];
    size = 0;
    first = 0;
    last = 0;
  }
public boolean enqueue(Order order) {
    if (this.isFull()) {
      return false;
    }
    queue[last] = order;
    this.size++;
    last = (last + 1) % biggest;
    return true;
  }
  

  public boolean isFull() {
    return this.size == this.biggest;
  }

  

  public Order dequeue() {
    Order order = null;
    if (this.isEmpty()) {
      return order;
    }
    order = queue[first];
    this.size--;
    first = (first + 1) % biggest;
    return order;
  }
public boolean isEmpty() {
    return this.size == 0;
  }
  public String toString() {
    String fullAmt = "";
    for (int i = 0; i < this.size; i++) {
      fullAmt += (queue[i].toString() + " ");
    }
    return fullAmt;
  }
}

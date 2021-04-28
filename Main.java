class Main {
  public static void main(String[] args){
    Order one = new Order(100, 20, 'B');
    Order two = new Order(20, 24, 'B');
    Order three = new Order(200, 36, 'B');
    Order four = new Order(150, 30, 'S');

    Q buy = new Q(3);
    buy.enqueue(one);
    buy.enqueue(two);
    buy.enqueue(three);
      
    Q sell = new Q(1);
    sell.enqueue(four);

    LossGain calc = new LossGain(buy,sell);
    System.out.println("----------HOW MUCH CAPITOL LOSS----------");
    System.out.println("--------------$ "+calc.moneyMadeCalc()+" -----------------");

   }
}
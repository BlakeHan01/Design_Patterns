class Main {
  public static void main(String[] args) {
    // Waiter w1=new Waiter();
    // Waiter w2=new Waiter();
    // Kitchen k = new Kitchen();
    // Food f= new Food("Soup","BBQ meat","Coke");
    // w1.writeOrder(f);
    // w1.sendToKitchen(k);
    // k.prepareFood(f);
    // k.callWaiter(w2);
    // w2.deliverFood();
    Order o= new Order();
    o.makeOrder("Soup","BBQ meat","Coke");
  }
}
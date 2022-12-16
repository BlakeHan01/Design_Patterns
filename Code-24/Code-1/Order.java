class Order{
  public void makeOrder(String appitzer, String mainCourse, String drink){
    Waiter w1=new Waiter();
    Waiter w2=new Waiter();
    Kitchen k = new Kitchen();
    Food f= new Food(appitzer,mainCourse,drink);
    w1.writeOrder(f);
    w1.sendToKitchen(k);
    k.prepareFood(f);
    k.callWaiter(w2);
    w2.deliverFood();
  }
}
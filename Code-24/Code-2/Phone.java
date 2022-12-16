class Phone implements Observer{
  public void notify(String txt){
    System.out.println("Vibrate then show message:\n"+ txt);
  }
}
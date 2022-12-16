class Ipad implements Observer{
  public void notify(String txt){
    System.out.println("Make sound then show message:\n"+ txt);
  }
}
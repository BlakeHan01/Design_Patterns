class Mobile{
  State currentState;
  public void setState(State s){
    this.currentState=s;
  }
  public void notify(String txt){
    this.currentState.alert(txt);
  }
}
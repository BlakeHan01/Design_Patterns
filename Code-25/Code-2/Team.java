class Team{
  public Strategy current_strategy;
  public void setCurrentStrategy(Strategy s){
    this.current_strategy = s;
  }
  public void play(){
    System.out.println("Team is polaying now..");
    this.current_strategy.run();
  }
}
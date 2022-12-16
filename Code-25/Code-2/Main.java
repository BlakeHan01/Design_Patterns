class Main {
  public static void main(String[] args) {
    Team t = new Team();
    // t.setCurrentStrategy(new ManToManStrategy());
    t.setCurrentStrategy(new ZoneDefenceStrategy());
    t.play();
  }
}
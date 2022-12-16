class Main {
  public static void main(String[] args) {
    EssayMaker em;
    // em = new LongEssayMaker();
    em = new ShortEssayMaker();
    em.write();
  }
}
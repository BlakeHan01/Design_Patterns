abstract class EssayMaker{
  public void write(){
    this.doResearch();
    this.makeOutlines();
    this.writeIntro();
    this.writeBody();
    this.writeConclusion();
  }
  public void doResearch(){
    System.out.println("do research");
  }
  public void makeOutlines(){
    System.out.println("make outlines");
  }
  public void writeIntro(){
    System.out.println("write intro");
  }
  public void writeConclusion(){
    System.out.println("Write conclusion");
  }
  abstract public void writeBody();
}
class Main {
  public static void main(String[] args) {
    FileManager f1 = FileManager.getInstance("manager 1");
    FileManager f2 = FileManager.getInstance("manager 2");
    FileManager f3 = FileManager.getInstance("manager 3");
    System.out.println(f1.name);
    System.out.println(f2.name);
    System.out.println(f3.name);
  }
}
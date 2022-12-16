class FileManager{
  public String name;
  public static FileManager instance=null;
  private FileManager(String name){
    this.name = name;
  }
  public static FileManager getInstance(String name){
    if (instance == null){
      instance = new FileManager(name);
    }
    return instance;
  }
}
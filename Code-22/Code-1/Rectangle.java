class Rectangle extends Shape{
  Rectangle(String color){
    this.color=color;
  }
  Rectangle(Rectangle r){
    this.color= r.color;
  }
  public String toString(){
    return "I am Rectangle and my color is: "+ this.color;
  }
  public Shape clone(){
    return new Rectangle(this);
  }
}
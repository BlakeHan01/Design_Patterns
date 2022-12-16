class Circle extends Shape{
  Circle(String color){
    this.color=color;
  }
  Circle(Circle c){
    this.color=c.color;
  }
  public String toString(){
    return "I am Circle and my color is: "+ this.color;
  }
  
  public Shape clone(){
    // return new Circle(this.color);
    return new Circle(this);
  }
}
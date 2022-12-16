class Button{
  Command command;
  Button(Command c){command =c;}
  void press(){
    this.command.execute();
  }
}
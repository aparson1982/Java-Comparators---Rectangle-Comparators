
/**
 * Write a description of class a here.
 * 
 * @author (Robert Parson) 
 * @version (10-21-15)
 */

public abstract class RectangleObject {
    
  public String name;
    //constructor
  protected RectangleObject() 
  {
  }

 //cconstructs rectangle obj
  protected RectangleObject(String name) {
    this.name = name;  //assigns value of parameter name to variable with same name
    
  }

  //get method for name
  public String getName() {
    return name;
  }

 //set method for name
  public void setName(String name) {
    this.name = name;
  }

  //abstract methods.  Declared without implementation.
  public abstract int getArea();
  public abstract int getSkinny();
  public abstract int getWidth();
  public abstract int getHeight();
  
}


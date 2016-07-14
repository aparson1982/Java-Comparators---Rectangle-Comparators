
/**
 * Write a description of class d here.
 * 
 * @author (Robert Parson) 
 * @version (a version number or a date)
 */
public class Rectangle extends RectangleObject
{
    //creates private instance variables
    private int width;  
    private int height;
    
    public Rectangle(String name, int width, int height)
    {
        this.name = name;
        this.width = width;
        this.height = height;
    }
    //get method for Width
    public int getWidth()
    {
        return width;
    }
    //set method for width
    public void setWidth(int width)
    {
        this.width = width;
    }
    //get method for Height
    public int getHeight()
    {
        return height;
    }
    //set method for Height
    public void setHeight(int height)
    {
        this.height = height;
    }
    //Area method
    public int getArea()
    {
        return width * height;
    }
    //get method for finding skinniest rectangle
    public int getSkinny()  
    {  //if the width is less than the height return height b/c height is the longest side
        if(width < height)
        {
            return height;
        }
        else if(width == height)
        {   //doesn't matter which one is returned here (cause it's a square duh, probably a useless else if statement)
            return width;
        }
        else
        {
            return width;
        }
    }
    
}
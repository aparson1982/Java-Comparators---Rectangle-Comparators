
/**
 * 
 * 
 * @author (Robert Parson) 
 * @version (10-21-15)
 */
import java.util.*;
 
public class TreeSetWithComparatorTester {
  public static void main(String[] args) {
    // Creates a tree set for rectangle objects using a comparator
    Set<RectangleObject> set = new TreeSet<RectangleObject>(new RectangleComparator());
    //creates new Rectangles with (Name, Width, Height)
    set.add(new Rectangle("A",8, 4));  
    set.add(new Rectangle("B",4, 8));
    set.add(new Rectangle("C",8, 5));
    set.add(new Rectangle("D",14, 2));
    set.add(new Rectangle("E",10, 4));
    set.add(new Rectangle("F",11, 3));
    set.add(new Rectangle("G",9, 12));
    set.add(new Rectangle("H",16, 1));
    set.add(new Rectangle("I",2, 20));
    set.add(new Rectangle("J",4, 4));
    set.add(new Rectangle("K", 4, 8));
 
    // Prints Sorted Rectangle Objects by area and prints Skinniest rectangles first (skinniest rectangle being whichever has the longest side)
    System.out.println("Sorted Rectangles:  ");
    System.out.println("Note:  If the area of 2 or more rectangles are equal, they will be sorted by skinniest to fattest.");
    System.out.println("       If there are any duplicates, triplicates, etc. only 1 will show and the rest will be removed.");
    System.out.println("");
    //prints set
    for (RectangleObject e: set){
      System.out.println("Rectangle " + e.getName() +" Area Equals:  " + e.getArea()+ "  (Width, Height):   ("+e.getWidth()+", "+e.getHeight()+")");
      System.out.println("");

  }

}
}

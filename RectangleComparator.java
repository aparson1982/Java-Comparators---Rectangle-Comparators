
/**
 * Write a description of class a here.
 * 
 * @author (Robert Parson) 
 * @version (a version number or a date)
 */

import java.util.*;

public class RectangleComparator implements Comparator<RectangleObject>
{
    //compares 2 objects in the set and sorts the objects
    public int compare(RectangleObject a, RectangleObject b) 
    {
       
        int area1 = a.getArea();
        int area2 = b.getArea();
        int skinny1 = a.getSkinny();
        int skinny2 = b.getSkinny();
        
        //compares values for area (smallest placed at top of set
        if (area1 < area2)  
        {
            return -1;
        }
        //if the area is equal then nested if statement begins
        else if (area1 == area2)  
        {
            //checks for skinniest rectangle and places skinniest at top of set
            if(skinny1 < skinny2) 
            {
            return 1;
            }
            else if(skinny2 < skinny1)
            {
            return -1;
            }
            //removes a rectangle that is a complete duplicate
            else
            {
            return 0;
            }
        }
        else
            return 1;
            
    }

}

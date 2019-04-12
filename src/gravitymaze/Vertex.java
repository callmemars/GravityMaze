/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gravitymaze;

public class Vertex
{
    int x, y, z;
    Actions actTest;
    String direction;
    
    int yellowHeight = 4;
    //Booleans that check if there is a possible action(if not there is probably a wall)
    
    //Yellow spike
    // Two dots: down, right, top
    boolean[] UpYellowActionsRight = new boolean[]{true, false, true, true};
    // Two dots: down, right, left
    boolean[] UpYellowActionsBackward = new boolean[]{true, true, true, true};
    // Two dots: down, left, top
    boolean[] UpYellowActionsLeft = new boolean[]{true, false, true, true};
    // Two dots: Top, right, left
    boolean[] UpyellowActionsForward = new boolean[]{true, false, true, true};
    
   public Vertex(int x, int y, int z)
    {
        this.actTest = new Actions();
        this.x = x;
        this.y = y;
        this.z = z;
    }
   
   public void changeVertex(int x, int y, int z)
   {
       this.x = x;
       this.y = y;
       this.z = z;
       
   }
   // X is left to right horizontally
   public void setX(int x)
   {
       this.x = x;
   }
   // Y is vertical
     public void setY(int y)
   {
       this.y = this.y+y;
   }
   // Z is forward/ backward horizontally
       public void setZ(int z)
   {
       this.z = z;
   }
       
       // TO DO CREATE CHECK TO SEE IF ACTION EXISTS AT HEIGHT /DIRECTION 
    public boolean isActionExists(String blockColor, int heightChecked, String direction)
    {
        return true;
        
    }
    // Outputs next vertex given a vertex, direction, action
    public Vertex getNewVertex(Vertex inputV, char blockColor, char ballDirection, char towerDirection, int height)
    {
        // Yellow, height 4 spike up
        if (blockColor == 'y' && towerDirection == 'r' && height == 4)
        {
            inputV.setX(-1);
            inputV.setY(-1);
        }
         if (blockColor == 'y' && towerDirection == 'l' && height == 4)
        {
            inputV.setX(1);
            inputV.setY(-1);
        }
          if (blockColor == 'y' && towerDirection == 'b' && height == 4)
        {
            inputV.setZ(+1);
            inputV.setY(-1);
        }
           if (blockColor == 'y' && towerDirection == 'f' && height == 4)
        {
            inputV.setZ(-1);
            inputV.setY(-1);
        }
        // Yellow, height 3, spike up
        if (blockColor == 'y' && height == 3 && ballDirection == 's')
        {
           if (towerDirection == 'r')
           {
               return null;
           }
           if (towerDirection == 'l')
           {
               return null;
           }
           if (towerDirection == 'b')
           {
               return null;
           }
           if (towerDirection == 'f')
           {
               return null;
           }
        }
        return inputV;
    }
    
       public void getVertex()
   {
       System.out.println("x= " + x + "\ny= " + y + "\nz= " +z);
   }

    
}

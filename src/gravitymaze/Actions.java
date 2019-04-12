/*
 * 
 */
package gravitymaze;

/**
 * List of all actions that add each tower has.
 * Grouped by color
 * Name up/down indicates if the spike is up or down on the tower.
 * Description is in the arbitrary  format of(Dot number/placement 1, 2, 3,)
 * The actions are listed from Top-Down
 * @author Marcel Millan
 */
public class Actions 
{
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
  
    
    // TO DO CREATE CHECK TO SEE IF ACTION EXISTS AT HEIGHT /DIRECTION 
    public boolean isActionExists(String blockColor, int heightChecked, String direction)
    {
        return true;
        
    }
    
    // Outputs next vertex given a vertex, direction, action
    public Vertex getNewVertex(Vertex inputV, char blockColor, char ballDirection, char towerDirection, int height)
    {
        // Yellow, height 4 spike:
        if (blockColor == 'y' && towerDirection == 'r')
        {
            inputV.setX(1);
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
        Vertex test = new Vertex(0, 0, 0);
        return test;
    }
    
}

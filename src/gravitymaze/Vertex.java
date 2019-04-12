/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravitymaze;


public class Vertex
{
    int x, y, z;
    
   public Vertex(int x, int y, int z)
    {
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
   public void setX(int x)
   {
       this.x = x;
   }
     public void setY(int y)
   {
       this.y = y;
   }
       public void setZ(int z)
   {
       this.z = z;
   }
   public void getVertex()
   {
       System.out.println("x= " + x + "\ny= " + y + "\nz= " +z);
   }
   
}

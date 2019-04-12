/*

 */
package gravitymaze;

/**
 *
 * @author Marcel Millan
 */
public class Main {

    public static void main(String[] args)
    {
        Vertex test = new Vertex(0, 4, 0);
        Vertex test2;
        test2 = test.getNewVertex(test, 'y', 'r', 'f', 4);
        test2.getVertex();
                
    }
    
}

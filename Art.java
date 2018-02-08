import gpdraw.*;
import java.util.Random;

/**
 * Art Project with Recursion
 *
 * @author HoqueDeepro
 * @version 120517
 */
public class Art
{
    // instance variables - replace the example below with your own
    public static SketchPad myPaper;
    public static DrawingTool myPencil;
    /**
     * Constructor for objects of class Art
     */
    public Art()
    {
        myPaper = new SketchPad(508, 547);
        myPencil = new DrawingTool (myPaper);
    }

    /**
     * draws a right triangle fractal
     * @param  levels, size
     */
    public static void drawTriangle(int levels, double size){
        if (levels == 1){
            myPencil.move(size);
            myPencil.turnRight(90);
            myPencil.move(size);
            myPencil.turnRight(135);
            myPencil.move(size*Math.sqrt(2));
            myPencil.turnRight(135);
        } else {
            drawTriangle(levels-1,size/2);
            myPencil.move(size);
            myPencil.turnRight(90);
            drawTriangle(levels-1,size/2);
            myPencil.move(size);
            myPencil.turnRight(135);
            drawTriangle(levels-1,size*Math.sqrt(2)/2);
            myPencil.move(size*Math.sqrt(2));
            myPencil.turnRight(135);
        }
    }
    
    /**
     * draws a universe fractal (overlapping circles within overlapping circles)
     * @param  levels, size
     */
    public static void drawUniverse(int levels, double size)
    {
        if (levels == 1){
            for (int i = 0;i<360;i++){
                myPencil.up();
                myPencil.forward(size-1);
                myPencil.down();
                myPencil.forward(1);
                myPencil.up();
                myPencil.turnRight(180);
                myPencil.forward(size);
                myPencil.turnRight(1);
            }
            myPencil.up();
            myPencil.forward(size);
            myPencil.down();
            for (int i = 0;i<360;i++){
                myPencil.up();
                myPencil.forward(size-1);
                myPencil.down();
                myPencil.forward(1);
                myPencil.up();
                myPencil.turnRight(180);
                myPencil.forward(size);
                myPencil.turnRight(1);
            }
        } else {
            drawUniverse(1,size);
            myPencil.turnRight(240);
            myPencil.forward(size);
            myPencil.turnLeft(150);
            myPencil.forward((0.5*((size/2)*Math.sqrt(3))+0.5*((0.5*(size/2)*Math.sqrt(3)))));
            drawUniverse(levels-1,0.5*(size/2)*Math.sqrt(3));
        }
    }
    
    public static void move_turn(double x, double y, double angle){
        myPencil.up();
        myPencil.move(x,y);
        myPencil.down();
        myPencil.turnRight(angle);
    }  
}

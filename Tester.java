import gpdraw.*;
import java.awt.Color;
/**
 * Runs the drawingtool
 * @author HoqueDeepro
 * @version 120517
 */
public class Tester
{
    public static Color RED = Color.red, BLUE = Color.blue, BLACK = Color.black,
    GRAY = Color.gray, YELLOW = Color.yellow, 
    PINK = Color.pink, ORANGE = Color.orange,
    GREEN = Color.green;

    public static void main(String args[]){
        Art sketch = new Art();
        sketch.myPencil.fillRect(1000,1000);
        sketch.move_turn(0,250,90);
        sketch.myPencil.setColor(RED);
        sketch.drawTriangle(5,250);
        sketch.move_turn(0,-250,90);
        sketch.drawTriangle(5,250);
        sketch.move_turn(250,0,135);
        sketch.drawTriangle(5,250);
        sketch.move_turn(-250,0,90); 
        sketch.drawTriangle(5,250);
        sketch.myPencil.setColor(GREEN);
        sketch.move_turn(-50,0,360);
        sketch.drawUniverse(5,100);  
    }
}

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Skizze
{
    double x = 100;
 
    // Diese Methode wird immer und immer wieder ausgeführt
    void draw(GraphicsContext gc){
        gc.clearRect(0,0,400,400);
        gc.setFill(Color.RED);
        gc.fillOval(x,100,20,20);  
        x = x + 1;
    }

}

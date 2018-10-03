import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Skizze
{
    double x = 100;   // x-Koordinate des Balls        
 
    // Diese Methode wird immer und immer wieder ausgeführt
    void draw(GraphicsContext gc){
        gc.clearRect(0,0,400,400);  // Löschen der Zeichenfläche
        gc.setFill(Color.RED);      // Setzen der Füllfarbe
          
        x = x + 1;               
        gc.fillOval(x,100,20,20);   // Zeichnen des Balls
    }

}

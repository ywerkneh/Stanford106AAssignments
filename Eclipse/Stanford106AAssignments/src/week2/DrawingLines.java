package week2;

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class DrawingLines extends GraphicsProgram {

    public void run() {
        addMouseListeners();
    }

    /** Called on mouse press to record the coordinates of the click */
    public void mousePressed(MouseEvent e) {
        double x = e.getX();
        double y = e.getY();
        line = new GLine(x, y, x, y);
        add(line);
    }

    /** Called on mouse drag to reposition the object */
    public void mouseDragged(MouseEvent e) {
        double x = e.getX();
        double y = e.getY();
        line.setEndPoint(x, y);
    }

    private GLine line;

}
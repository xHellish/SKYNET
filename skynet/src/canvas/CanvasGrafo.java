package canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class CanvasGrafo extends Canvas {

    private int xCirculo = -1;
    private int yCirculo = -1;

    public void setCoordenadasCirculo(int x, int y) {
        xCirculo = x;
        yCirculo = y;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Dibuja un círculo en las coordenadas especificadas si se han establecido
        if (xCirculo != -1 && yCirculo != -1) {
            g.setColor(Color.BLUE);
            g.fillOval(xCirculo, yCirculo, 30, 30);
        }
    }
}



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingApp extends Frame implements MouseMotionListener {
    public static void main(String[] args) {

        DrawingApp app = new DrawingApp();
        app.WritingWithMouse();
    }

    public void WritingWithMouse() {

        setSize(300, 300);
        setVisible(true);
        // Add a clear button
        Button clear = new Button("Clear");
        add(clear, BorderLayout.SOUTH);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });

        addMouseMotionListener(this);

    }

    int count = 0;

    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        // Generate 3 random numbers between 0 and 255
        int r = (int) (Math.random() * 256);
        int gr = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        g.setColor(new Color(r, gr, b));
        g.fillOval(e.getX(), e.getY(), 10, 10);

        count++;
        // Draw count on screen
        g.setColor(Color.BLACK);
        g.drawString("Count: " + count, 10, 10);

    }

    public void mouseMoved(MouseEvent e) {

    }

}

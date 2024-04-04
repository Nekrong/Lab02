package org.dstu;

import org.dstu.components.GraphicsPanel;
import org.dstu.shapes.Circle;
import org.dstu.shapes.Shape;
import org.dstu.shapes.Ellipse;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(50, 150, 100, Color.RED));
        shapes.add(new Ellipse(700, 700, 100, 50, Color.BLUE));
        shapes.add(new Circle(30, 100, 150, Color.BLUE));
        shapes.add(new Ellipse(355, 355, 75, 80, Color.GREEN));

        GraphicsPanel canvas = new GraphicsPanel(shapes);


         for (Shape s: shapes) {
            Thread t = new Thread(s.getAnimator(canvas));
            t.start();
        }

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(canvas);
        frame.setVisible(true);

    }
}

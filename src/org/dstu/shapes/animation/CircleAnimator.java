package org.dstu.shapes.animation;

import org.dstu.shapes.Circle;
import org.dstu.shapes.Shape;

import javax.swing.*;
import java.awt.*;


public class CircleAnimator extends Animator {

    public CircleAnimator(Shape shape, JComponent component) {
        super(shape, component);
    }

    @Override
    public void run() {
        while (true){
                shape.moveRel((int) (Math.random() * 10), (int) (Math.random() * 10));
                //shape.setColor(new Color((int) (i + 100 + 20 % 255), (int) i + 70 + 40 % 255, (int) i + 120 + 70 % 255));
                if (shape.getColor().equals(Color.BLACK))
                    shape.setColor(Color.YELLOW);
                else if (shape.getColor().equals(Color.BLUE))
                    shape.setColor(Color.RED);
                else if (shape.getColor().equals(Color.YELLOW))
                    shape.setColor(Color.RED);
                else if (shape.getColor().equals(Color.RED))
                    shape.setColor(Color.BLACK);
                if (component != null) {
                    component.repaint();
                }
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }
}

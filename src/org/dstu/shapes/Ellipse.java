package org.dstu.shapes;

import org.dstu.shapes.animation.Animator;
import org.dstu.shapes.animation.EllipseAnimation;

import javax.swing.*;
import java.awt.*;

public class Ellipse extends Shape {
    protected int height;
    protected int width;

    public Ellipse() {
    }

    public Ellipse(int x, int y, int height, int width, Color color) {
        super(x, y, color);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(x, y, height, width);
        g.fillOval(x, y, height, width);
    }

    @Override
    public Animator getAnimator(JComponent component) {
        return new EllipseAnimation(this, component);
    }
}

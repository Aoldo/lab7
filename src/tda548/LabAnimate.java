package tda548;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class LabAnimate {
    Labyrinth l;
    Drawable3D shape;
    int s = 0;
    Iterator<Labyrinth> iterator;

    public LabAnimate(LabList ll) {
        this.l = ll;
        iterator = ll.iterator();
        tick();
    }

    public void draw(Graphics g, int w, int h) {
        shape.draw(g, w, h);
    }

    public void tick() {
        if (iterator.hasNext()) {
            shape = new Labyrinth3D(iterator.next());
        } else {
            shape = new Labyrinth3D(l);
            s = s + 1;
        }
        shape = shape.rotate(0.01 * s, 0.02 * s);

    }

}

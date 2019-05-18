package ncd.creatures;

import processing.core.*;

public class Qbee extends Creature {
    
    public int color;
    
    public Qbee(PApplet p, float x, float y, float width, float height) {
        super(p, x, y, width, height);
        color = p.color(255.0f, 0.0f, 0.0f, 255.f);
    }
    
    @Override 
    public void update() {
        location.add(velocity);
    }
    
    @Override
    public void display() {
        p.fill(color);
        p.noStroke();
        p.rect(location.x, location.y, width, height);
    }
}

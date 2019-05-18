package ncd.creatures;

import processing.core.*;

public class Creature implements CreatureInterface {

    public PApplet p;
    public PVector location;
    public PVector velocity;
    public PVector acceleration;
    public float width, height;
    
    public Creature(PApplet p, float x, float y, float width, float height) {
        this.p = p;
        location = new PVector(x, y);
        velocity = new PVector(1.0f, 1.0f);
        this.width = width;
        this.height= height;
    }
    
    public void run() {
        update();
        checkEdges();
        draw();
    }
    
    public void checkEdges() {
        if(((location.x + width) > p.width) || (location.x < 0.0f)) {
            velocity.x *= -1.0f;
        }
        
        if(((location.y + height) > p.height) || (location.y < 0.0f)) {
            velocity.y *= -1.0f;
        }
    }
    
    @Override public void update() {}
    @Override public void draw() {}
}

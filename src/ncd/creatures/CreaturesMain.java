
package ncd.creatures;

import processing.core.PApplet;

public class CreaturesMain extends PApplet {
    
    Qbee qbee;
    
    @Override 
    public void settings() {
        size(1280, 720);
    }
    
    @Override
    public void setup() {
        qbee = new Qbee(this, width/2, height/2, 25.0f, 25.0f);
    }
    
    @Override 
    public void draw() {
        background(255);
        qbee.run();
    }
}

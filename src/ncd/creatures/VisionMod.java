package ncd.creatures;

import processing.core.*;

public class VisionMod {
    
    public PApplet p;
    public float ownerWidth, ownerHeight;
    
    public void VisionMod(PApplet p, float ownerWidth, float ownerHeight) {
        this.p = p;
        this.ownerWidth = ownerWidth;
        this.ownerHeight = ownerHeight;
    }
    
    public void run(float x, float y) {
        p.loadPixels();
        
    }
}

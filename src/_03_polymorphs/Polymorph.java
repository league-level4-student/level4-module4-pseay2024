package _03_polymorphs;

import java.awt.Graphics;
import java.util.Random;

public abstract class Polymorph {
    protected int x;
    protected int y;
    protected double i;
    
    protected final static int width = 50;
    protected final static int height = 50;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
   	 i = new Random().nextInt(31415) * 0.0001;
    }
    
    public void update(){
   	 i+=0.1;
    }
    
    public void jop() {}
    
    public abstract void draw(Graphics g);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static int getWidth() {
		return width;
	}

	public static int getHeight() {
		return height;
	}
}

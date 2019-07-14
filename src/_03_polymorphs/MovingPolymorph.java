package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingPolymorph extends Polymorph{
	MovingPolymorph (int x, int y)
	{
		super(x,y);
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
	}
	
	public void update()
	{
		Random r = new Random();
		x = r.nextInt(PolymorphWindow.WIDTH - width);
		y = r.nextInt(PolymorphWindow.HEIGHT - height);
	}
}

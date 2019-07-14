package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{
	CirclePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(x, y, width, height);
	}
	
	public void update()
	{
		super.update();
		x = (int)(((Math.sin(i) + 1)/2)*(PolymorphWindow.WIDTH - 50));
		y = (int)(((Math.cos(i) + 1)/2)*(PolymorphWindow.HEIGHT - 50));
	}
}

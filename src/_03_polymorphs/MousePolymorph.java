package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;

public class MousePolymorph extends Polymorph{
	MousePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
	}
	
	public void update()
	{
		Point l = MouseInfo.getPointerInfo().getLocation();
		x = l.x;
		y = l.y;
	}
}

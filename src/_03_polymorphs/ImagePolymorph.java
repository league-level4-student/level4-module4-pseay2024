package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImagePolymorph extends Polymorph{

	BufferedImage bi;
	
	ImagePolymorph(int x, int y) {
		super(x, y);
		try {
			bi = ImageIO.read(this.getClass().getResourceAsStream("Polymorphism.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(bi, x, y, width, height, null);
	}
}

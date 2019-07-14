package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class jopPolymorph extends Polymorph{
	jopPolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
	}
	
	public void jop()
	{
		JOptionPane.showMessageDialog(null, "my number is " + i);
	}
}

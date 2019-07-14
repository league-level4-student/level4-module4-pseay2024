package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener{
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 1000;
    
    private JFrame window;
    private Timer timer;
    
    ArrayList<Polymorph> polys;
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
   	}
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseListener(this);
   	 
   	 polys = new ArrayList<Polymorph>();
   	 int polySize = 100;
   	 for (int i = 0; i < polySize; i++)
   	 {
   		 Random r = new Random();
   		 int x = r.nextInt(WIDTH - Polymorph.width);
   		 int y = r.nextInt(HEIGHT - Polymorph.height);
   		 switch (r.nextInt(7))
   		 {
   		 case 0:
   			 polys.add(new RedPolymorph(x,y));
   			 break;
   		 case 1:
   			 polys.add(new BluePolymorph(x,y));
   			 break;
   		 case 2:
   			 polys.add(new MovingPolymorph(x,y));
   			 break;
   		 case 3:
   			 polys.add(new CirclePolymorph(x,y));
   			 break;
   		 case 4:
   			 polys.add(new MousePolymorph(x,y));
   			 break;
   		 case 5:
   			 polys.add(new jopPolymorph(x,y));
   			 break;
   		 case 6:
   			 polys.add(new ImagePolymorph(x,y));
   			 break;
   		 }
   	 }
   	 
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, WIDTH, HEIGHT);
   	
   	 //draw polymorph
   	 for (Polymorph pm : polys)
   	 {
   		 pm.draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 for (Polymorph pm : polys)
   	 {
   		 pm.update();
   	 }
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for (Polymorph pm : polys)
		{
			pm.jop();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

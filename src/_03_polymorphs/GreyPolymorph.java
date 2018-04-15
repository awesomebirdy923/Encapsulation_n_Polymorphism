package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class GreyPolymorph extends Polymorph{

	public GreyPolymorph(int x, int y) {
		super(x,y);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GRAY);
		g.drawRect(x, y, 50, 50);
	}

}

package Test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends GameObject {
	
	Random r = new Random();

	public Player(int x, int y, ID id) {
		super(x, y, id);
		
		velX = r.nextInt(16);
		velY = r.nextInt(16);
		
	}


	public void tick() {
		x += velX ;
		y += velY;
	
		
	}


	public void render(Graphics g) {
		
		Random rand = new Random();
		
		float r = rand.nextFloat();
		float f = rand.nextFloat();
		float b = rand.nextFloat();
		
		Color randomColor = new Color(r, f, b);
		
		g.setColor(randomColor);
		g.fillOval(x, y, 20, 27);
		
	}

}

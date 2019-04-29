

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Color;


public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		super(x,y);
                   }   

	public Ammo(int x, int y, int s)
	{
		super(x,y);
                                     speed = s;
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return 0;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.YELLOW);
                                     window.fillRect(getX(), getY(), 10, 10);
	}
	
	
	public void move( String direction )
	{
		if(direction.equals("UP")){
                                     setY(getY() - getSpeed());
                }
	}

	public String toString()
	{
		return "";
	}
}

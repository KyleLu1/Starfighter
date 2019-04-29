

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int size;
	
	private int origSize;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		this.size = size;
		origSize = size;
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien al : aliens)
			al.draw(window);
	}

	public void moveEmAll()
	{
		for(int i = 0; i < aliens.size(); i++){
                    aliens.get(i).move("any");
                }
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int i = 0; i < shots.size(); i++)
		{
			for (int j = 0; j < aliens.size(); j++)
			{
				try
				{
					if (aliens.get(j).isCol(shots.get(i))) 
					{
						shots.remove(i);
						aliens.remove(j);
						size--;
					}
					
				} catch (Exception e)
				{
					 
				}
			}
		}
	}
	
	
	
	public Alien getAlien(int i)
	{
		return aliens.get(i);
	}
	
	public int getSize()
	{
		return size;
	}

	public String toString()
	{
		return "";
	}
}
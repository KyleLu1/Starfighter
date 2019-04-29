
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing {

    private int speed;
    private Image image;

    public Alien() {
        this(0, 0, 30, 30, 0);
    }

    public Alien(int x, int y) {
        this(x, y, 10, 10, 5);
    }

    public Alien(int x, int y, int s) {
        this(x, y, 10, 10, s);
    }

    public Alien(int x, int y, int w, int h, int s) {
        super(x, y, w, h);
        speed = s;
        try {
            URL url = getClass().getResource("Resources/alien.jpg");
            image = ImageIO.read(url);
        } catch (Exception e) {
            //feel free to do something here
        }
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public int getSpeed() {
        return 0;
    }

    public void move(String direction) {
        if (direction.equals("RIGHT")) {
            setX(getX() + speed);
        } else if (direction.equals("LEFT")) {
            setX(getX() - speed);
        } else if (direction.equals("UP")) {
            setY(getY() + speed);
        } else if (direction.equals("DOWN")) {
            setY(getY() - speed);
        }
    }

    public void draw(Graphics window) {
        window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
    }
    
    public boolean isBet(int x, int y, int z){
        return x >= y && x <= z;
    }
    
    public boolean isCol (Ammo a){
        int ay = a.getY() + a.getSpeed();
        int ax = a.getX() - this.getSpeed();
        if (isBet(ay, this.getY(), this.getY() + this.getHeight()) || isBet(ay + a.getHeight(), this.getY(), this.getY() + this.getHeight())){
            if(isBet(ax, this.getX(), this.getX() + this.getWidth()) || isBet(ax, this.getX(), this.getX() + this.getWidth())){
            return true;
        }
        }
        return false;
    }

    public String toString() {
        return "";
    }
}

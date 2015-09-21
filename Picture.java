/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an assignment for OOP for Professor Crosbie, using preexisting code/classes from the "Project1" directory.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square wall2;
    private Square road;
    private Square stripe1;
    private Square stripe2;
    private Square stripe3;
    private Square bstripe1;
    private Square bstripe2;
    private Square bstripe3;
    private Triangle mountain;
    private Circle sun;
    private Circle sun2;
    private Person guy;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
        road = new Square();
        road.changeColor("black");
        road.moveHorizontal(-320);
        road.moveVertical(60);
        road.changeSize(800);
        road.makeVisible();
        
        stripe1 = new Square();
        stripe1.changeColor("white");
        stripe1.moveHorizontal(-60);
        stripe1.moveVertical(80);
        stripe1.changeSize(60);
        stripe1.makeVisible();

        bstripe1 = new Square();
        bstripe1.changeColor("black");
        bstripe1.moveHorizontal(-60);
        bstripe1.moveVertical(70);
        bstripe1.changeSize(60);
        bstripe1.makeVisible();
       
        stripe2 = new Square();
        stripe2.changeColor("white");
        stripe2.moveHorizontal(100);
        stripe2.moveVertical(80);
        stripe2.changeSize(60);
        stripe2.makeVisible();

        bstripe2 = new Square();
        bstripe2.changeColor("black");
        bstripe2.moveHorizontal(100);
        bstripe2.moveVertical(70);
        bstripe2.changeSize(60);
        bstripe2.makeVisible();
        
        stripe3 = new Square();
        stripe3.changeColor("white");
        stripe3.moveHorizontal(-220);
        stripe3.moveVertical(80);
        stripe3.changeSize(60);
        stripe3.makeVisible();

        bstripe3 = new Square();
        bstripe3.changeColor("black");
        bstripe3.moveHorizontal(-220);
        bstripe3.moveVertical(70);
        bstripe3.changeSize(60);
        bstripe3.makeVisible();
        
        mountain = new Triangle();  
        mountain.changeSize(100, 180);
        mountain.moveHorizontal(20);
        mountain.moveVertical(-60);
        mountain.makeVisible();
        
        wall = new Square();
        wall.moveHorizontal(-240);
        wall.moveVertical(-60);
        wall.changeSize(120);
        wall.makeVisible();
        
        wall2 = new Square();
        wall2.moveHorizontal(-40);
        wall2.moveVertical(-20);
        wall2.changeSize(80);
        wall2.makeVisible();
        wall2.changeColor("blue");

        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(120);
        sun.moveVertical(-80);
        sun.changeSize(100);
        sun.makeVisible();
        
        sun2 = new Circle();
        sun2.changeColor("yellow");
        sun2.moveHorizontal(125);
        sun2.moveVertical(-75);
        sun2.changeSize(90);
        sun2.makeVisible();
        
        guy = new Person();
        guy.moveHorizontal(-40);
        guy.moveVertical(-50);
        guy.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            wall2.changeColor("black");
            road.changeColor("black");
            mountain.changeColor("black");
            sun.changeColor("black");
            sun2.changeColor("black");
            guy.changeColor("white");
            stripe1.changeColor("white");
            stripe2.changeColor("white");
            stripe3.changeColor("white");
            bstripe1.changeColor("black");
            bstripe2.changeColor("black");
            bstripe3.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            road.changeColor("black");
            mountain.changeColor("green");
            wall.changeColor("red");
            wall2.changeColor("blue");
            sun.changeColor("yellow");
            sun2.changeColor("red");
            guy.changeColor("black");
            stripe1.changeColor("white");
            stripe2.changeColor("white");
            stripe3.changeColor("white");
            bstripe1.changeColor("black");
            bstripe2.changeColor("black");
            bstripe3.changeColor("black");
        }
    }
}

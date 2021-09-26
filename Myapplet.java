import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
	public void paint(Graphics g)
	{
	g.drawString("hello world",20,30);
	g.drawOval(150,150,130,130);
	g.drawOval(170,170,40,30);
	g.drawOval(210,210,20,30);
	g.drawOval(220,170,40,30);
	g.drawArc(180,250,100,150,110,50);
	}
}
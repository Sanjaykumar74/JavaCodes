
import java.applet.*;
import java.awt.*;
public class Myapplet2 extends Applet
{
	String msg="";
	public void init()
	{
		msg=getParameter("stname");
		setBackground(Color.RED);
		setForeground(Color.WHITE);
	}
	public void paint(Graphics g)
	{
	g.drawString("hello world "+msg,20,30);
	g.drawLine(20,20,50,50);
	g.drawRect(40,40,30,60);
	g.drawOval(50,70,10,10);
	g.drawRoundRect(100,100,30,40,4,5);
	int x[]={20,30,40,50,60};
	int y[]={30,60,90,120,150};
	g.drawPolygon(x,y,5);
	g.drawArc(50,100,40,90,20,25);
	}
}
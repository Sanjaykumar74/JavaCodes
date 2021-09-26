import java.awt.*;
//step 1 import the event package
import java.awt.event.*;
//step 2 implements the listener interface
class Myframe extends Frame implements ActionListener
{
	Label lbtitle,lbname,lbpass,lbcpass,lbgen,laddress,lcoun,lph;
     TextField textemail,textpass,textcpass,textaddress,textcoun,textph;
     Checkbox rbtmale,rbtfemale;
     CheckboxGroup chg;
     Button btlogin,btcancel;
   
	Myframe()
	{
     setTitle("welcome to frame window");
     setSize(1000,1000);
     setVisible(true);
     setLayout(null);
     chg=new CheckboxGroup();
     lbtitle=new Label("Login Here");
     lbname=new Label("Enter Email id:");
     lbpass=new Label("Enter Passward:");
     lbcpass=new Label("Confirm Passward:");
     lbgen=new Label("Gender:");
     laddress=new Label("Address:");
     lph=new Label("Phone:");
     lcoun=new Label("Country:");
     textemail=new TextField("");
     textpass=new TextField("");
     textcpass=new TextField("");
     textaddress=new TextField("");
     textph=new TextField("");
     textcoun=new TextField("");
     rbtmale=new Checkbox("Male",chg,true);
     rbtfemale=new Checkbox("Female",chg,false);
     btlogin=new Button("Login");
     btcancel=new Button("Cancel");
     textpass.setEchoChar('*');
     lbtitle.setBounds(250,100,150,40);
     lbname.setBounds(50,150,150,40);
     lbpass.setBounds(50,200,150,40);
     lbcpass.setBounds(50,250,150,40);
     lbgen.setBounds(50,300,150,40);
     laddress.setBounds(50,350,150,40);
     lph.setBounds(50,450,150,40);
     lcoun.setBounds(50,500,150,40);
     textemail.setBounds(200,150,150,30);
     textpass.setBounds(200,200,150,30);
     textcpass.setBounds(200,250,150,30);
     textaddress.setBounds(200,350,150,30);
     textph.setBounds(200,450,150,30);
     textcoun.setBounds(200,500,150,30);
     rbtmale.setBounds(200,300,150,40);
     rbtfemale.setBounds(400,300,150,40);
     btlogin.setBounds(200,600,150,40);
     btcancel.setBounds(400,600,150,40);
     add(lbtitle);
     add(lbname);
     add(lbpass);
     add(lbcpass);
     add(lbgen);
     add(laddress);
     add(lph);
     add(lcoun);
     add(textemail);
     add(textpass);
     add(textcpass);
     add(textaddress);
     add(textph);
     add(textcoun);
     add(rbtmale);
     add(rbtfemale);
     add(btlogin);
     add(btcancel);
     //step 3: register listener with button
     btlogin.addActionListener(this);
     btcancel.addActionListener(this);
   }
   //step 4 implement the method to handle the event
   public void actionPerformed(ActionEvent ae)
   {
     String msg=ae.getActionCommand();
     if(msg.equals("Login"))
          System.out.println("You Clicked on login button");
     else
          System.out.println("You Clicked on Reset Button");
   }
   
}
class callframe
{
	public static void main(String args[])
	{
	Myframe f1=new Myframe();
	}
}
 String msg=ae.getActionCommand();
     String email=textname.getText();
     if(email.equals(""))
          System.out.println("Empty Not allowed");
     else
          System.out.println(email);
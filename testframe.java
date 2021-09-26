import java.awt.*;
import java.awt.event.*;
class Myframe extends Frame implements ActionListener
{
    Label lbtitle,lbname,lbpass;
    TextField textname,textpass;
    Button btlogin,btcancel;
	Myframe()
	{
     setTitle("welcome to email window");
     setSize(600,600);
     setVisible(true);
     setLayout(null);
     lbtitle=new Label("Login Here");
     lbname=new Label("Enter Email id:");
     lbpass=new Label("Enter Passward:");
     textname=new TextField("");
     textpass=new TextField("");
     btlogin=new Button("Login");
     btcancel=new Button("Cancel");
     lbtitle.setBounds(250,100,150,40);
     lbname.setBounds(50,150,150,40);
     lbpass.setBounds(50,200,150,40);
     textname.setBounds(200,150,150,30);
     textpass.setBounds(200,200,150,30);
     btlogin.setBounds(200,350,150,40);
     btcancel.setBounds(400,350,150,40);
     add(lbtitle);
     add(lbname);
     add(lbpass);
     add(textname);
     add(textpass);
     add(btlogin);
     add(btcancel);
     btlogin.addActionListener(this);
	}

    public void actionPerformed(ActionEvent ae)
    {
     String msg=ae.getActionCommand();
     String email=textname.getText();
     if(email.equals("abhay"))
          System.out.println("welcome");
     else
          System.out.println("invalid email");
     String passward=textpass.getText();
     if(passward.equals("abhay"))
          System.out.println("welcome");
     else
          System.out.println("invalid email");
    }
}
class testframe
{
    public static void main(String args[])
    {
    Myframe f1=new Myframe();
    }
}
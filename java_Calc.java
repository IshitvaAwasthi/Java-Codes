import java.awt.*;
import java.awt.event.*;

public class A207_Calc implements ActionListener 
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	TextField tf;
	Panel p;
	Frame f;
	A207_Calc()
	{
		f=new Frame("A207_Calculator");
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b10=new Button("0");
		b11=new Button("+");
		b12=new Button("-");
		b13=new Button("*");
		b14=new Button("/");
		b15=new Button("=");
		b16=new Button("CE");
		tf=new TextField("0",150);
		p=new Panel();
		f.setSize(400,500);
		f.setVisible(true);
		f.add(tf,BorderLayout.NORTH);
		f.add(p,BorderLayout.CENTER);
		p.setLayout(new GridLayout(4,4,2,2));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b11);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b12);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b13);
		p.add(b16);
		p.add(b10);
		p.add(b15);
		p.add(b14);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
	}
	static String s1,s2,s3,s4;
	public void actionPerformed (ActionEvent e)
	{
		String a,b;
		Object o=e.getSource();
		a=e.getActionCommand();
		b=tf.getText();
		if(o==b1)
			tf.setText(b.concat(a));
		if(o==b2)
			tf.setText(b.concat(a));
		if(o==b3)
			tf.setText(b.concat(a));
		if(o==b4)
			tf.setText(b.concat(a));
		if(o==b5)
			tf.setText(b.concat(a));
		if(o==b6)
			tf.setText(b.concat(a));
		if(o==b7)
			tf.setText(b.concat(a));
		if(o==b8)
			tf.setText(b.concat(a));
		if(o==b9)
			tf.setText(b.concat(a));
		if(o==b10)
			tf.setText(b.concat(a));
		if(o==b16)
			tf.setText("");
		if(o==b11)
		{
			s1=tf.getText();
			tf.setText("");
			s2=a;
		}
		if(o==b12)
		{
			s1=tf.getText();
			tf.setText("");
			s2=a;
		}
		if(o==b13)
		{
			s1=tf.getText();
			tf.setText("");
			s2=a;
		}
		if(o==b14)
		{
			s1=tf.getText();
			tf.setText("");
			s2=a;
		}
		if(o==b15)
		{
			s3=tf.getText();
			s4=a;
			if(s2=="+" )
			{
				int i1=Integer.parseInt (s1);
				int i2=Integer.parseInt (s3);
				int i3=i1+i2;
				tf.setText (i3+"");
			}
			else if(s2=="-")
			{
				int i1=Integer.parseInt (s1);
				int i2=Integer.parseInt (s3);
				int i3=i1-i2;
				tf.setText(i3+" ");
			}
			else if(s2=="*")
			{
				int i1=Integer.parseInt (s1);
				int i2=Integer.parseInt (s3);
				int i3=i1*i2;
				tf.setText(i3+" ");
			}
			else if(s2=="/")
			{
				int i1=Integer.parseInt(s1);
				int i2=Integer.parseInt(s3);
				int i3=i1/i2;
				tf.setText(i3+" ");
			}
		}
	}
	public static void main(String...a)
	{
		A207_Calc c=new A207_Calc();
	}
}
		
		
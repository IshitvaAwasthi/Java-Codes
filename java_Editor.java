import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;

class A207_Editor implements ActionListener
{
	Frame f;
	TextArea t;
	MenuBar mb;
	MenuItem red,blue,bold,italics,exit,green,yellow;
	Menu colour,font,exitm,bg,fg;
	A207_Editor()
	{
		f=new Frame("A207_Editor");
		t=new TextArea(25,80);
		mb=new MenuBar();
		red=new MenuItem("Red");
		blue=new MenuItem("Blue");
		green=new MenuItem("Green");
		yellow=new MenuItem("Yellow");
		bold=new MenuItem("Bold");
		italics=new MenuItem("Italics");
		exit=new MenuItem("Exit");
		colour=new Menu("Colour");
		font=new Menu("Font");
		exitm=new Menu("Exit");
		bg=new Menu("Background");
		fg=new Menu("Foreground");
		exit.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		yellow.addActionListener(this);
		bold.addActionListener(this);
		italics.addActionListener(this);
		colour.add(bg);
		colour.add(fg);
		fg.add(green);
		fg.add(yellow);
		bg.add(blue);
		bg.add(red);
		font.add(bold);
		font.add(italics);
		exitm.add(exit);
		mb.add(colour);
		mb.add(font);
		mb.add(exitm);
		f.setMenuBar(mb);
		f.add(t);
		f.setVisible(true);
		f.setSize(500,400);
	}
	public void actionPerformed (ActionEvent e)
	{
		Object o=e.getSource();
		if(o==red)
			t.setBackground(Color.red);
		else if(o==blue)
			t.setBackground(Color.blue);
		else if(o==green)
			t.setForeground(Color.green);
		else if(o==yellow)
			t.setForeground(Color.yellow);
		else if(o==bold)
		{
			Font mybld=new Font("Verdana",Font.BOLD,14);
			t.setFont(mybld);
		}
		else if(o==italics)
		{
			Font myita=new Font("Courier",Font.ITALIC,14);
			t.setFont(myita);
		}
		else if(o==exit)
			System.exit(0);
	}
	public static void main(String...a)
	{
		A207_Editor ed=new A207_Editor();
	}
}
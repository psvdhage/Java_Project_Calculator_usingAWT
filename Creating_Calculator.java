package Adv_Java;
import java.awt.*;

public class Creating_Calculator {
	Frame f;
	Panel p1;
	public static void main(String[] args) {
		
		Creating_Calculator c=new Creating_Calculator();
		c.MyFrame();
		c.MyTextField();
		c.MyPanel();

	}
	
	public void MyFrame()
	{

		f = new Frame();
		f.setVisible(true);
		f.setBounds(10, 50, 500, 600);
		f.setTitle("Working_on_Calculator");
		p1 = new Panel();
		//p1.setBackground(Color.BLACK);
		f.add(p1);
		
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,1000,10));
	}
	
	
	public void MyTextField()
	{
		TextField t1 = new TextField();
		Panel p2 = new Panel();
		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gc = new GridBagConstraints();
		
		p2.setBackground(Color.gray);
		p2.setLayout(gb);
		gc.insets = new Insets(10,10,10,10);
		gc.gridx=0;
		gc.gridy=0;
		gc.ipadx=330;
		gc.ipady=50;
		
		gb.setConstraints(t1, gc);
		
		p2.add(t1);
		p1.add(p2);
		
	}
	
	public void MyPanel()
	{

		Panel p= new Panel();
		p.setBackground(Color.GREEN);
		p1.add(p);

		
		GridBagLayout gl = new GridBagLayout();
		GridBagConstraints gc = new GridBagConstraints();
		p.setLayout(gl);
		
		gc.insets = new Insets(10,10,10,10);
		
		Button b1 = new Button("ON / AC");
		gc.gridx=5;
		gc.gridy=2;
		gc.ipadx=10;
		gc.ipady=25;
		gl.setConstraints(b1,gc);
		b1.setBackground(Color.cyan);
		p.add(b1);
		//p.setLayout(gl);
		
		Button b2 = new Button("M +");
		gc.gridx=1;
		gc.gridy=3;
		gc.ipadx=15;
		gc.ipady=15;
		gl.setConstraints(b2,gc);
		p.add(b2);
		//p.setLayout(gl);
		
		Button b3 = new Button("M -");
		gc.gridx=2;
		gc.gridy=3;
		gc.ipadx=15;
		gc.ipady=15;
		gl.setConstraints(b3,gc);
		p.add(b3);
		//p.setLayout(gl);
		
		Button b4 = new Button("MR");
		gc.gridx=3;
		gc.gridy=3;
		gc.ipadx=15;
		gc.ipady=15;
		gl.setConstraints(b4,gc);
		p.add(b4);
		//p.setLayout(gl);
		
		Button b5 = new Button("GT");
		gc.gridx=4;
		gc.gridy=3;
		gc.ipadx=15;
		gc.ipady=15;
		gl.setConstraints(b5,gc);
		p.add(b5);
		//p.setLayout(gl);
		
		Button b6 = new Button("CE");
		gc.gridx=5;
		gc.gridy=3;
		gc.ipadx=15;
		gc.ipady=15;
		gl.setConstraints(b6,gc);
		p.add(b6);
		//p.setLayout(gl);
		
		Button b7 = new Button("7");
		gc.gridx=1;
		gc.gridy=4;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b7,gc);
		p.add(b7);
		//p.setLayout(gl);
		
		Button b8 = new Button("8");
		gc.gridx=2;
		gc.gridy=4;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b8,gc);
		p.add(b8);
		//p.setLayout(gl);
		
		Button b9 = new Button("9");
		gc.gridx=3;
		gc.gridy=4;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b9,gc);
		p.add(b9);
		//p.setLayout(gl);
		
		Button b10 = new Button("/");
		gc.gridx=4;
		gc.gridy=4;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b10,gc);
		p.add(b10);
		//p.setLayout(gl);
		//
		Button b11 = new Button("=>");
		gc.gridx=5;
		gc.gridy=4;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b11,gc);
		p.add(b11);
		//p.setLayout(gl);
		
		Button b12 = new Button("4");
		gc.gridx=1;
		gc.gridy=5;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b12,gc);
		p.add(b12);
		//p.setLayout(gl);
		
		Button b13 = new Button("5");
		gc.gridx=2;
		gc.gridy=5;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b13,gc);
		p.add(b13);
		//p.setLayout(gl);
		
		Button b14 = new Button("6");
		gc.gridx=3;
		gc.gridy=5;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b14,gc);
		p.add(b14);
		//p.setLayout(gl);
		
		Button b15 = new Button("*");
		gc.gridx=4;
		gc.gridy=5;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b15,gc);
		p.add(b15);
		//p.setLayout(gl);
		
		Button b16 = new Button("%");
		gc.gridx=5;
		gc.gridy=5;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b16,gc);
		p.add(b16);
	//	p.setLayout(gl);
		
		Button b17 = new Button("1");
		gc.gridx=1;
		gc.gridy=6;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b17,gc);
		p.add(b17);
	//	p.setLayout(gl);
		
		Button b18 = new Button("2");
		gc.gridx=2;
		gc.gridy=6;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b18,gc);
		p.add(b18);
	//	p.setLayout(gl);
		
		Button b19 = new Button("3");
		gc.gridx=3;
		gc.gridy=6;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b19,gc);
		p.add(b19);
	//	p.setLayout(gl);
		
		Button b20 = new Button("+");
		gc.gridx=4;
		gc.gridy=6;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b20,gc);
		b20.setBackground(Color.cyan);
		p.add(b20);
	//	p.setLayout(gl);
		
		Button b21 = new Button("=");
		gc.gridx=5;
		gc.gridy=6;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b21,gc);
		b21.setBackground(Color.cyan);
		p.add(b21);
//		p.setLayout(gl);
		
		Button b22 = new Button("0");
		gc.gridx=1;
		gc.gridy=7;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b22,gc);
		p.add(b22);
//		p.setLayout(gl);
		
		Button b23 = new Button("00");
		gc.gridx=2;
		gc.gridy=7;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b23,gc);
		p.add(b23);
	//	p.setLayout(gl);
		
		Button b24 = new Button(".");
		gc.gridx=3;
		gc.gridy=7;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b24,gc);
		p.add(b24);
	//	p.setLayout(gl);
		
		Button b25 = new Button("Tax+");
		gc.gridx=4;
		gc.gridy=7;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b25,gc);
		p.add(b25);
	//	p.setLayout(gl);
		
		Button b26 = new Button("Tax-");
		gc.gridx=5;
		gc.gridy=7;
		gc.ipadx=20;
		gc.ipady=20;
		gl.setConstraints(b26,gc);
		p.add(b26);
	//	p.setLayout(gl);
		
	}

}

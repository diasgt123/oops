import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class light extends JPanel implements ActionListener{
	JRadioButton r1;
	JRadioButton r2;
	JRadioButton r3;
	Color red_c;
	Color yellow_c;
	Color green_c;
	public light()
	{
		setBounds(0,0,640,480);
		r1=new JRadioButton("Red");
		r2=new JRadioButton("Yellow");
		r3=new JRadioButton("Green");
		//r1.setSelected=(true);
		yellow_c=getBackground();
		green_c=getBackground();
		ButtonGroup gp = new ButtonGroup();
		gp.add(r1);
		gp.add(r2);
		gp.add(r3);
		add(r1);
		add(r2);
		add(r3);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(r1.isSelected()==true)
		{
			red_c=Color.red;
			yellow_c=getBackground();
			green_c=getBackground();
		}
		
		if(r2.isSelected()==true)
		{
			yellow_c=Color.yellow;
			red_c=getBackground();
			green_c=getBackground();
		}
		if(r3.isSelected()==true)
		{
			green_c=Color.red;
			yellow_c=getBackground();
			red_c=getBackground();
		}
		repaint();
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawOval(50,50,50,50);
		g.drawOval(50,110,50,50);
		g.drawOval(50,170,50,50);
		g.setColor(red_c);
		g.fillOval(50,50,50,50);
		g.setColor(yellow_c);
		g.fillOval(50,110,50,50);
		g.setColor(green_c);
		g.fillOval(50,170,50,50);
	}
}
public class trafficswing{
	public static void main(String[] args)
	{
		JFrame f= new JFrame();
		f.setVisible(true);
		f.setSize(640,480);
		f.setLayout(null);
		f.setBackground(Color.yellow);
		light t= new light();
		f.add(t);
	}
}

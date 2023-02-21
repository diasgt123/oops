import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Palswing implements ActionListener{
JFrame f;
JTextField t;
JButton b1;
Palswing()
{
f= new JFrame("Palindrome");
f.setSize(400,500);
t = new JTextField();
b1 = new JButton("Submit");


t.setBounds(30,40,250,30);
b1.setBounds(100,150,90,40);
b1.setBackground(Color.red);

f.add(t);
f.add(b1);


f.setVisible(true);
f.setLayout(new GridLayout(2,1));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


b1.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
    if (e.getSource() == b1)
    {
        String str = t.getText();
        int len = str.length();
        boolean isPalindrome = true;
        for (int i = 0; i < len / 2; i++)
        {
            if (str.charAt(i) != str.charAt(len - i - 1))
            {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
        {
            t.setText("Palindrome");
        }
        else
        {
            t.setText("Not palindrome");
        }
    }
}

public static void main(String[] args)
	{
		new Palswing();
	}
}
		




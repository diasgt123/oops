import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Traffic extends JFrame implements ActionListener{
    JRadioButton b1, b2, b3;
    ButtonGroup bg;

    Traffic(){
        setTitle("Traffic");
        setSize(400, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1 = new JRadioButton("Red");
        b2 = new JRadioButton("Yellow");
        b3 = new JRadioButton("Green");
        bg = new ButtonGroup();
        add(b1);
        add(b2);
        add(b3);
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        
        setBackground(Color.blue);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            getContentPane().setBackground(Color.red);
        }
        else if(e.getSource() == b2) {
            getContentPane().setBackground(Color.yellow);
        }
        else if(e.getSource() == b3) {
            getContentPane().setBackground(Color.green);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Traffic().setVisible(true);
            }
        });
    }
}


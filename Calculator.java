package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
    JPanel panel;
    JTextField text1;
    JButton sum, mult, res, div, click;
    
    public Calculator(){
        this.setLocation(30,30);
        this.setSize(500,500);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Panel();
        events();
    }
    
    public void TextField(){
        text1 = new JTextField();
        text1.setBounds(15, 15, 460, 50);
        panel.add(text1);
    }
    
    public void Buttons(){
        sum = new JButton("Add");
        sum.setBounds(15,75, 60, 30);
        
        res = new JButton("Subtract");
        res.setBounds(85, 75, 60, 30);
        
        mult = new JButton("Multiply");
        mult.setBounds(155, 75, 60, 30);
        
        div = new JButton("Split");
        div.setBounds(225, 75, 60, 30);
        
        click = new JButton("click");
        click.setBounds(295, 75, 60, 30);
        
        panel.add(sum);
        panel.add(res);
        panel.add(mult);
        panel.add(div);
        panel.add(click);
    }
    
    public void Panel(){
        panel = new JPanel();
        this.add(panel);
        panel.setLayout(null);
        
        Contents();
    }
    
    public void events(){
        float result = Float.parseFloat(text1.getText());
        
        sum.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
               
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                text1.setText(text1.getText() + "SUM()");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        
        click.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
    }
    
    public void Contents(){
        TextField();
        Buttons();
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        JFrame myFrame = new JFrame();
        myFrame.setSize(400, 400);

        JPanel myPanel = new JPanel();

        JButton myButton = new JButton("push me");

        JTextField myTextField = new JTextField(10);

        JLabel myLabel = new JLabel("");

        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Hello World!");
                myPanel.setBackground(new Color((int) (Math.random()*255) + 1, (int) (Math.random()*255) + 1, (int) (Math.random()*255) + 1));

            }
        });

        myTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                  String text = myTextField.getText();
//                System.out.println(text);
                  myLabel.setText("Hi " + text);

            }
        });

        myPanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("(" + e.getX() + "," + e.getY() + ")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        myPanel.add(myButton);
        myFrame.add(myPanel);
        myPanel.add(myTextField);
        myPanel.add(myLabel);
        myFrame.setVisible(true);

    }
}
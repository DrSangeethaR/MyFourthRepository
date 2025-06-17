package Swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleGUI {
	public static void main(String[] args) {
        // Create the frame (window)
        JFrame frame = new JFrame("My First GUI");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // Absolute positioning

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(100, 50, 100, 30);

        // Create a label
        JLabel label = new JLabel("Hello!");
        label.setBounds(120, 100, 100, 30);

        // Add action to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed1(ActionEvent e) {
                label.setText("You clicked!");
            }

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        });

        // Add components to the frame
        frame.add(button);
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}

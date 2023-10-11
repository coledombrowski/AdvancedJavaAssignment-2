// - Cole Dombrowski
// - Assignment 1
// - 9/6/2023

package dombrowski.cole;

import itds.bcis3680.TimeStamp;
import javax.swing.JOptionPane;

public class Hello
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,
                "Hello, Cole Dombrowski! Welcome to Fall 2023. The time is now " + 
                TimeStamp.getCurrentTime() + ".",
                "Assignment 1", 1
                );
    }
}
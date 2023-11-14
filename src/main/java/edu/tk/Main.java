package edu.tk;

import edu.tk.gui.ExamGUI;
import edu.tk.gui.PupilGUI;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private final PupilGUI pupilGUI;
    private final ExamGUI examGUI;


    public Main() {
        setTitle("AbiRechner Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pupilGUI = new PupilGUI(this);
        examGUI = new ExamGUI(this);
        this.initWindow(pupilGUI.getContent());
    }

    public void initWindow(JPanel content) {
        setContentPane(content);
        //setMinimumSize(new Dimension(800,600));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setPupilGUI() {
        initWindow(pupilGUI.getContent());
    }

    public void setExamGUI() {
        initWindow(examGUI.getContent());
    }

    public static void main(String[] args) {
        Main app = new Main();
    }
}
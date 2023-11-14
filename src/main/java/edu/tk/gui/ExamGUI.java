package edu.tk.gui;

import edu.tk.Main;
import edu.tk.logic.Exam;
import edu.tk.logic.Pupil;

import javax.swing.*;
import javax.swing.border.Border;

public class ExamGUI {
    private JLabel pupilLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JButton backButton;
    private JButton saveButton;
    private JButton nextButton;
    private JButton pupilDataButton;
    private JPanel jPanel;

    private final Main window;

    public ExamGUI(Main window) {
        this.window = window;
        Border padding = BorderFactory.createEmptyBorder(20, 20, 20, 20);
        this.jPanel.setBorder(padding);

        this.saveButton.addActionListener(e -> doSave());
        this.pupilDataButton.addActionListener(e -> window.setPupilGUI());
    }

    private void doSave() {
        // Neues Kollegiaten-Objekt
        Exam newPupil = new Exam();

        // Werte der Textfelder auslesen und zuordnen.

    }


    public JPanel getContent() {
        return jPanel;
    }

}

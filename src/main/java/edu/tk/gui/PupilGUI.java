package edu.tk.gui;

import edu.tk.Main;
import edu.tk.logic.Exam;
import edu.tk.logic.Pupil;

import javax.swing.*;
import javax.swing.border.Border;
import java.util.ArrayList;

public class PupilGUI {
    private JTextField firstnameTextField;
    private JTextField lastnameTextField;
    private JTextField examDateTextField;
    private JTextField teacherTextField;
    private JButton saveButton;
    private JButton examButton;
    private JPanel jPanel;
    private final ArrayList<Pupil> pupilList = new ArrayList<>();
    private final Main window;

    public PupilGUI(Main window) {
        this.window = window;
        Border padding = BorderFactory.createEmptyBorder(20, 20, 20, 20);
        this.jPanel.setBorder(padding);

        this.saveButton.addActionListener(e -> doSave());
        this.examButton.addActionListener(e -> window.setExamGUI());
    }

    private void doSave() {
        // Neues Kollegiaten-Objekt
        Pupil newPupil = new Pupil();

        // Werte der Textfelder auslesen und zuordnen.
        newPupil.setFirstname(firstnameTextField.getText());
        newPupil.setLastname(lastnameTextField.getText());
        newPupil.setExamDate(examDateTextField.getText());
        newPupil.setTeacher(teacherTextField.getText());

        // Kollegiaten-Objekt der ArrayList hinzufügen
        this.pupilList.add(newPupil);

        // Textfelder leeren
        firstnameTextField.setText(null);
        lastnameTextField.setText(null);
        examDateTextField.setText(null);
        teacherTextField.setText(null);

        System.out.println("Kollegiat wurde erfasst!");
        System.out.println("Folgende Kollegiaten existieren nun:");
        for(Pupil pupil: this.pupilList) {
            for(int i = 0; i < 5; i++) {
                if(pupil.getExam(i) != null)
                    System.out.println(pupil + " hat " + pupil.getExam(i).getSchoolSubject());
                else
                    System.out.println(pupil + " hat keine " + (i+1) + ". Prüfung.");
            }
        }
    }

    public JPanel getContent() {
        return jPanel;
    }

}

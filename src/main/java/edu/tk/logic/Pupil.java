package edu.tk.logic;

public class Pupil {

    private String firstname;
    private String lastname;
    private String examDate;
    private String teacher;
    private final Exam[] exams = new Exam[5];

    public String toString() {
        return this.firstname + " " + this.lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setExam(int index, Exam exam) {
        this.exams[index] = exam;
    }

    public Exam getExam(int index) {
        return this.exams[index];
    }

    public Exam[] getExams() {
        return exams;
    }
}

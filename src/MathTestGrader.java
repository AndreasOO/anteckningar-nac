import javax.swing.*;

public class MathTestGrader {
    private final int LOWEST_SCORE_FOR_E = 25;
    private final int LOWEST_SCORE_FOR_D = 30;
    private final int LOWEST_SCORE_FOR_C = 35;
    private final int LOWEST_SCORE_FOR_B = 40;
    private final int LOWEST_SCORE_FOR_A = 45;
    private final int HIGHEST_SCORE_FOR_A = 50;
    private int studentScore;
    private char studentGrade;

    MathTestGrader() {

    }

    public void execute() {
        getStudentScore();
        assessGrade();
        showGradeToUser();
    }

    private void getStudentScore() {
        studentScore = Integer.parseInt(JOptionPane.showInputDialog("Ange poäng: "));
    }

    private void assessGrade() {
        if (studentScore < LOWEST_SCORE_FOR_E) {
            setStudentGrade('F');
        }
        else if (studentScore < LOWEST_SCORE_FOR_D) {
            setStudentGrade('E');
        }
        else if (studentScore < LOWEST_SCORE_FOR_C) {
            setStudentGrade('D');
        }
        else if (studentScore < LOWEST_SCORE_FOR_B) {
            setStudentGrade('C');
        }
        else if (studentScore < LOWEST_SCORE_FOR_A) {
            setStudentGrade('B');
        }
        else if (studentScore <= HIGHEST_SCORE_FOR_A) {
            setStudentGrade('A');
        }
        else {
            JOptionPane.showMessageDialog(null, "Någonting gick fel");
            throw new IllegalArgumentException("Felaktig input - Input från användare: " + studentScore);
        }
    }

    private void setStudentGrade(char ch) {
        studentGrade = ch;
    }

    private void showGradeToUser() {
        JOptionPane.showMessageDialog(null, studentGrade);
    }


}

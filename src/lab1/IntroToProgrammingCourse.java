package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Isaac Stefanski
 * @version     1.00
 */
public class IntroToProgrammingCourse extends BeginnerCourse{

    public IntroToProgrammingCourse(String courseName, String courseNumber, int credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }
}
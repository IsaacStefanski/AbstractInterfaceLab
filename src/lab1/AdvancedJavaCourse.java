package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Isaac Stefanski
 * @version     1.00
 */
public class AdvancedJavaCourse extends IntermediateCourse{    
    
    public AdvancedJavaCourse(String courseName, String courseNumber, int credits, Course prerequisite) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisite(prerequisite);
    }
}
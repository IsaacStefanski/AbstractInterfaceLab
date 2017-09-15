package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Isaac Stefanski
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course{
    private String prerequisites;
    
//    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
//        this.setCourseName(courseName);
//        this.setCourseNumber(courseNumber);
//        this.setCredits(credits);
//        this.setPrerequisites(prerequisites);
//    }
    
    @Override
    public String getPrerequisiteCourses() {
        return prerequisites;
    }
}
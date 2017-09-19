package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse implements Course{
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.prerequisites = prerequisites;
    }

    public double getCredits(){
        return credits;
    }

    public void setCredits(double credits) {
        if(credits >= 0.5 && credits <= 4.0) {
            this.credits = credits;
        } else {
            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");
        }      
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if(courseName != null){
            this.courseName = courseName;
        } else {
            throw new IllegalArgumentException("Course name is required");
        }
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        if(courseNumber != null && courseNumber.charAt(3) == '-'){
            this.courseNumber = courseNumber;
        } else {
            throw new IllegalArgumentException("Course number is required and must be formatted ###-###");
        }
    }
    
    public String toString(){
        return courseName + " " + courseNumber + " (" + credits + " credits)";
    }
    
    public String getPrerequisites(){
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites != null){
            this.prerequisites = prerequisites;
        } else {
            throw new IllegalArgumentException("This course has prerequisites");
        }
    }
}
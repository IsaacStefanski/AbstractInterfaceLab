package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Isaac Stefanski
 * @version     1.00
 */
public class IntroToProgrammingCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = "No prerequisites";
    }
    
    public double getCredits(){
        return credits;
    }

    public void setCredits(double credits) {
        if(credits >= 0.5 && credits <= 4.0) {
            this.credits = credits;
        } else {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
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
        throw new IllegalArgumentException("This is an introductory level course and has no prerequisites");
    }
}
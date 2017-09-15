/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Isaac
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    public abstract String getPrerequisiteCourses();
    
    public void setCredits(double credits) {
        if(credits >= 0.5 && credits <= 4.0) {
            this.setCredits(credits);
        } else {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        }       
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
    
    public final String toString(){
        return courseName + " " + courseNumber + " (" + credits + " credits)";
    }
}
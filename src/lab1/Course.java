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
    
    public final void setCredits(double credits) {
        if(credits >= 0.5 && credits <= 4.0) {
            this.credits = credits;
        } else {
            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");
        }       
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName != null){
            this.courseName = courseName;
        } else {
            throw new IllegalArgumentException("Course name is required");
        }
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber != null && courseNumber.charAt(3) == '-'){
            this.courseNumber = courseNumber;
        } else {
            throw new IllegalArgumentException("Course number is required and must be formatted ###-###");
        }
    }
    
    public final String toString(){
        return courseName + " " + courseNumber + " (" + credits + " credits)";
    }

    public final void setPrerequisites(String prerequisites) {
        if(prerequisites != null){
            this.prerequisites = prerequisites;
        } else {
            throw new IllegalArgumentException("Value cannot be left empty; if no prerequisites, enter 'none'");
        }
    }
}
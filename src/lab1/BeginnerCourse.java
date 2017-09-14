/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Isaac
 */
public class BeginnerCourse extends Course{
    
    @Override
    public String getPrerequisiteCourses() {
        return "No prerequisites";
    }    
}
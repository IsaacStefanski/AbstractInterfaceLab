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
public class IntermediateCourse extends Course{
    private Course prerequisite;
    
    @Override
    public String getPrerequisiteCourses() {
        return prerequisite.toString();
    }

    public Course getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(Course prerequisite) {
        if(prerequisite != null){
            this.prerequisite = prerequisite;
        } else {
            throw new IllegalArgumentException("Valid prerequisite course required at intermediate level");
        }        
    }    
}
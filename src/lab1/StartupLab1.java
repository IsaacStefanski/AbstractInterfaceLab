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
public class StartupLab1 {
    public static void main(String[] args) {
        Course course1 = new IntroToProgrammingCourse(/*"Intro to Programming", "111-111", 2.0*/);
        Course course2 = new IntroJavaCourse(/*"Intro to Java", "222-222", 4.0, "Intro to Programming"*/);
        Course course3 = new AdvancedJavaCourse(/*"Advanced Java", "333-333", 4.0, "Intro to Java"*/);
        
        course1.setCourseName("Intro to Programming");
        course1.setCourseNumber("111-111");
        course1.setCredits(2.0);
        System.out.println("Course 1: " + course1.getPrerequisiteCourses());
        
        course2.setCourseName("Intro to Java");
        course2.setCourseNumber("222-222");
        course2.setCredits(4.0);
        course2.setPrerequisites("Intro to Programming");
        System.out.println("Course 2: " + course2.getPrerequisiteCourses());
        
        course3.setCourseName("Advanced Java");
        course3.setCourseNumber("333-333");
        course3.setCredits(4.0);
        course2.setPrerequisites("Intro to Programming, Intro to Java");
        System.out.println("Course 3: " + course1.getPrerequisiteCourses());
        
        System.out.println(course1.toString());
        System.out.println(course2.toString());
        System.out.println(course3.toString());
    }
}
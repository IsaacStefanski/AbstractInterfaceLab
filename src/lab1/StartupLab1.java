/* * To change this license header, choose License Headers in Project Properties.
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
        Course intro2Prog = new IntroToProgrammingCourse("Intro to Programming", "111-111", 2.0);
        Course intro2Java = new IntroJavaCourse("Intro to Java", "222-222", 4.0, "Intro to Programming");
        Course advJava = new AdvancedJavaCourse("Advanced Java", "333-333", 4.0, "Intro to Programming, Intro to Java");

        System.out.println("Course 1: " + intro2Prog.getPrerequisiteCourses());
        System.out.println("Course 2: " + intro2Java.getPrerequisiteCourses());
        System.out.println("Course 3: " + advJava.getPrerequisiteCourses());
        
        System.out.println(intro2Prog.toString());
        System.out.println(intro2Java.toString());
        System.out.println(advJava.toString());
    }
}
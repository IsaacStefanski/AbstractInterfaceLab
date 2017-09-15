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
public class Startup {
    public static void main(String[] args) {
        Course course1 = new IntroToProgrammingCourse("Intro to Programming", "111-111", 2.0);
        Course course2 = new IntroJavaCourse("Intro to Java", "222-222", 4.0, "Intro to Programming");
        Course course3 = new AdvancedJavaCourse("Advanced Java", "333-333", 4.0, "Intro to Java");
        
        System.out.println(course1.toString());
        System.out.println(course2.toString());
        System.out.println(course3.toString());
    }
}
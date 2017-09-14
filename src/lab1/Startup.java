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
        Course course1 = new IntroToProgrammingCourse("Intro to Programming", "111-111", 4);
        Course course2 = new IntroJavaCourse("Intro to Java", "222-222", 8, course1);
        Course course3 = new AdvancedJavaCourse("Advanced Java", "333-333", 8, course2);
        
        System.out.println(course1.toString());
        System.out.println(course2.toString());
        System.out.println(course3.toString());
    }
}

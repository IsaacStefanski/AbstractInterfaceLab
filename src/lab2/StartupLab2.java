/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Isaac
 */
public class StartupLab2 {
    /*
    * Creating an abstract Course class is a better solution than a concrete class.
    * Since there will be some courses that do not require prerequisites, creating
    * an abstract method to then be implemented by each class that extends Course
    * makes the most sense. A concrete superclass would not allow for the same
    * flexibility in handling prerequisites.
    * When it comes to the Liskov Substitution Principle, the same idea of
    * flexibility applies. For example, if a method takes a Course as a parameter,
    * if you declare a variable course1 as Course course1 = new JavaCourse(), you
    * should not have any problems. Doing JavaCourse course1 = new JavaCourse()
    * is more rigid, as JavaCourse is a more specific kind of Course. I see an
    * advantage to this, as portability is always a plus in programming. Code
    * reuse makes the software development process more efficient.
    */
    public static void main(String[] args) {
        Course intro2Prog = new IntroToProgrammingCourse("Intro to Programming", "111-111", 2.0);
        Course intro2Java = new IntroJavaCourse("Intro to Java", "222-222", 4.0, "Intro to Programming");
        Course advJava = new AdvancedJavaCourse("Advanced Java", "333-333", 4.0, "Intro to Programming, Intro to Java");

        System.out.println("Course 1: " + intro2Prog.getPrerequisites());
        System.out.println("Course 2: " + intro2Java.getPrerequisites());
        System.out.println("Course 3: " + advJava.getPrerequisites());
        
        System.out.println(intro2Prog.toString());
        System.out.println(intro2Java.toString());
        System.out.println(advJava.toString());
    }
}
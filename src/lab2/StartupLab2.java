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
    * Choosing an interface affords the greatest amount of flexibility. You do
    * have to remember to put the properties in the right subclass(es) since an
    * an interface can only have the common behaviors/methods instead. With an
    * interface, you can handle anything any way you see fit. True, you have no
    * choice but to implement all the methods of an interface, but you are in
    * complete control over what those methods do. One point worth adding is that
    * there is a significantly reduced risk of getting stuck with bad code, a
    * risk that is high when extending a concrete class and could be there, but
    * to a lesser degree, when extending an abstract class.
    * The Liskov Substitution Principle in this part of the lab is similar to the
    * first part in that it increases the flexibility. Here, though, trying to
    * do a behavior on an instance of IntroJavaCourse is not going to work, but
    * it would if it was declared using Course courseName = new IntroJavaCourse().
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
        
        //Trying to give a prerequisite to Course intro2Java will work...
        intro2Java.setPrerequisites("AP Computer Science");
        System.out.println(intro2Java.getPrerequisites());
        //...but trying to give a prerequisite to a specific type of Course does not
        IntroJavaCourse introJava2 = new IntroJavaCourse("Java 2", "222-333", 1.5, "Intro to Java");
        System.out.println(introJava2.getPrerequisites());
    }
}
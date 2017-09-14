package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Isaac Stefanski
 * @version     1.00
 */
public class IntroJavaCourse extends IntermediateCourse{
    
    public IntroJavaCourse(String courseName, String courseNumber, Course prerequisite) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisite(prerequisite);
    }
}
package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Isaac Stefanski
 * @version     1.00
 */
public class IntroJavaCourse extends Course{
    
    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }
    
    @Override
    public String getPrerequisiteCourses() {
        return this.getPrerequisiteCourses();
    }
}
package lab1;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Isaac Stefanski
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course{

//    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
//        this.setCourseName(courseName);
//        this.setCourseNumber(courseNumber);
//        this.setCredits(credits);
//    }
    
    @Override
    public String getPrerequisiteCourses() {
        return "No prerequisites";
    } 
}
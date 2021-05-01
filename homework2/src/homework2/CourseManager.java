package homework2;

public class CourseManager {
	public void add(Course course) {
		System.out.println("Kurs Eklendi. Kurs:"+ course.courseName);
	}
	public void delete(Course course) {
		
		System.out.println("Kurs silindi. Kurs:" + course.courseName);
	}
}

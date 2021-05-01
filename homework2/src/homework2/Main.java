package homework2;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1313, "C# Angular", "Y�cel YAVA�", 13000);
		Course course2=new Course(1414, "Java React", "Engin DEM�RO�", 15000);
		Course course3=new Course(1515, "Android", "Ali �OKB�LM��", 1000);
		
		Course[] courses = {course1,course2,course3};
		for (Course course : courses) {
			System.out.println(course.courseName+" "+course.instructor + " "+ course.price);
		}
		
		
		Category category1  = new Category(13, "Web uygulamlar�");
		Category category2 = new Category(14, "Siber G�venlik");
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		
		courseManager.delete(course3);

	}

}

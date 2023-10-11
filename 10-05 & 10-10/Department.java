import java.util.List;

class Department {
	private List<Student> students;  // Department has Students but both can independently exist
	private List<Course> courses;    // Department has courses; Course cannot exist without department
}


public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.id=1;
		instructor.firstName="Engin";
		instructor.lastName="Demiroğ";
		instructor.instructorCourse = "java";
		
		
		Student student = new Student();
		student.id=2;
		student.firstName="Zeynep";
		student.lastName="Çıtlak";
		student.studentCourse="java";
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor);
		instructorManager.upload();
		instructorManager.update();
		instructorManager.delete();
		instructorManager.logout(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student);
		studentManager.buy();
		studentManager.cancel();
		studentManager.logout(student);

	}

}

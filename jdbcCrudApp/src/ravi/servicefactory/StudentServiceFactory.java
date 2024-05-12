package ravi.servicefactory;

import ravi.service.IStudentService;
import ravi.service.StudentServiceImp;

public class StudentServiceFactory {
	private StudentServiceFactory() {

	}

	private static IStudentService studentService = null;

	public static IStudentService getStudentService() {
		
		//singleton pattern code
		if (studentService == null) {
			studentService = new StudentServiceImp();
		}
		return studentService;
	}
}

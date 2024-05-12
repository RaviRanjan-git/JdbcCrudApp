package ravi.daofactory;

import ravi.persistance.IStudentDao;
import ravi.persistance.StudentDaoImp;

public class StudentDaoFactory {
	private StudentDaoFactory() {}

	private static IStudentDao studentDao = null;

	public static IStudentDao getStudentDao() {
		if (studentDao == null) {
			studentDao = new StudentDaoImp();
		}
		return studentDao;
	}
}

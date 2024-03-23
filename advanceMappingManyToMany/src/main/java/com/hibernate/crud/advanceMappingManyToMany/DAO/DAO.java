package com.hibernate.crud.advanceMappingManyToMany.DAO;

import java.util.List;

import com.hibernate.crud.advanceMappingManyToMany.entity.Course;
import com.hibernate.crud.advanceMappingManyToMany.entity.Instructor;
import com.hibernate.crud.advanceMappingManyToMany.entity.InstructorDetail;
import com.hibernate.crud.advanceMappingManyToMany.entity.Student;

public interface DAO {

	public void save(Instructor instructor);
	
	public Instructor findInstructorById(int id);
	
	public void deleteInstructorById(int id);
	
	public InstructorDetail findInstructorDetailById(int id);
	
	public void deleteInstructorDetailById(int id);
	
	public List<Course> findCoursesByInstructorId(int id);
	
	public Instructor findInstructorWithCoursesJoinFetch(int id);
	
	public void update(Instructor tempInstructor);
	
	public void updateCourse(Course tempCourse);
	
	public Course findCourseById(int id);
	
	public void deleteCourseById(int id);
	
	public void saveCourse(Course course);
	
	public Course findCourseAndReviewByCourseId(int id);
	
	public Course findCourseAndStudentByCourseId(int id);
	
	public Student findStudentAndCourseByStudentId(int id);
	
	public void updateStudent(Student tempStudent);
	
	public void deleteStudentById(int id);
}

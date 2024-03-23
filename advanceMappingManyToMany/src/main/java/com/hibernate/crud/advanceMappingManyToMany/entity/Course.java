package com.hibernate.crud.advanceMappingManyToMany.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name = "course")
@Data
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name ="title")
	private String title;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
			CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name ="instructor_id")
	private Instructor instructor;
	
	//field for implementing uni-directional in oneToMany mapping
	//between course and review
	@OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="course_id")
	List<Review> review;
	
	public void add(Review tempReview) {
		if(review == null) {
			review = new ArrayList<>();
		}
		review.add(tempReview);
	}
	
	
	//adding field for implementing many to many mapping.
	//between course and student
	@ManyToMany(fetch = FetchType.LAZY,
			cascade = {CascadeType.DETACH, CascadeType.MERGE,
					CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinTable(name="course_student",
			joinColumns = @JoinColumn(name="course_id"),
			inverseJoinColumns = @JoinColumn(name="student_id"))
	private List<Student> students;
	
	public void addStudent(Student tempStudent) {
		if(students == null) {
			students = new ArrayList<>();
		}
		students.add(tempStudent);
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	
	public Course(String title) {
		super();
		this.title = title;
	}
	public Course() {
		
	}
}

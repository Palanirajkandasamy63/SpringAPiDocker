package com.example.SpringApi.Repository;



import com.example.SpringApi.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}


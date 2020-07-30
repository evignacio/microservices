package com.ms.exemple.microservices.repository;

import com.ms.exemple.microservices.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{
}

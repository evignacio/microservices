package com.ms.exemple.microservices.endpoint.repository;

import com.ms.exemple.microservices.endpoint.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{
}

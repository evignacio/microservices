package com.ms.exemple.microservices.services;

import com.ms.exemple.microservices.model.Course;
import org.springframework.data.domain.Pageable;

public interface CourseService {

    public Iterable<Course> list(Pageable pageable);
}

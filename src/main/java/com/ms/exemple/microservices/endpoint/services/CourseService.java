package com.ms.exemple.microservices.endpoint.services;

import com.ms.exemple.microservices.endpoint.model.Course;
import org.springframework.data.domain.Pageable;

public interface CourseService {

    public Iterable<Course> list(Pageable pageable);
}

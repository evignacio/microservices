package academy.devdojo.course.services;

import academy.devdojo.core.model.Course;
import org.springframework.data.domain.Pageable;


public interface CourseService {

    public Iterable<Course> list(Pageable pageable);
}

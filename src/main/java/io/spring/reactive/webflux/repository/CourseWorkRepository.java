package io.spring.reactive.webflux.repository;

import io.spring.reactive.webflux.model.Coursework;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CourseWorkRepository extends ReactiveCrudRepository<Coursework, Long> {
    Mono<Void> deleteByStudentID(Long studentID);
}
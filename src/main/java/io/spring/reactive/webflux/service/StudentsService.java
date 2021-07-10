package io.spring.reactive.webflux.service;

import io.spring.reactive.webflux.model.Students;
import io.spring.reactive.webflux.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class StudentsService {

    @Autowired
    private StudentsRepository studentsRepository;

    public Mono<Students> getStudent (Long studentID){
        return studentsRepository.findById(studentID);
    }

    public Mono<Students> saveStudent (Students student){
        return studentsRepository.save(student);
    }
}

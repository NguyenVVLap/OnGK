package com.example.OnGK.service;

import com.example.OnGK.entity.Subject;
import com.example.OnGK.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements  SubjectService{
    @Autowired
    private SubjectRepository subjectRepository;


    @Override
    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }
}

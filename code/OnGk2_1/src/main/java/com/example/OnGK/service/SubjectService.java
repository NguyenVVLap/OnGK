package com.example.OnGK.service;

import com.example.OnGK.entity.Subject;

import java.util.List;

public interface SubjectService {
    public Subject saveSubject(Subject subject);
    public List<Subject> getSubjects();
}

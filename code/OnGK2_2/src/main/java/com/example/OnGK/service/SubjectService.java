package com.example.OnGK.service;



import com.example.OnGK.model.Subject;

import java.util.List;

public interface SubjectService {
    public void saveSubject(Subject subject);
    public List<Subject> getSubjects();
}

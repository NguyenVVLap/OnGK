package com.example.OnGK.rest;

import com.example.OnGK.entity.Subject;
import com.example.OnGK.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectRestController {
    @Autowired
    private SubjectService subjectService;

    @PostMapping("/subject")
    public Subject addSubject(@RequestBody Subject subject) {
        return subjectService.saveSubject(subject);
    }
}

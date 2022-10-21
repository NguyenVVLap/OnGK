package com.example.OnGK.rest;

import com.example.OnGK.model.Subject;
import com.example.OnGK.service.ListenService;
import com.example.OnGK.service.SendService;
import com.example.OnGK.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectRestController {
    @Autowired
    private SubjectService subjectService;

    @Autowired
    private SendService sendService;

    @Autowired
    private ListenService listenService;

    @PostMapping("/subject")
    public Subject addSubject(@RequestBody Subject subject) {
        subjectService.saveSubject(subject);
        return subject;
    }

    @GetMapping("/subjects")
    public List<Subject> getSubjects() {
        return subjectService.getSubjects();
    }

    @PostMapping("sendSubject/{id}")
    public Subject sendSubject(@PathVariable int id) {
        Subject subj = null;
        for (Subject sub : subjectService.getSubjects() ) {
            if (sub.getSubId() == id) {
                subj = sub;
            }
        }
        if (subj != null)
            sendService.SendProduct(subj);
        return subj;
    }

    @GetMapping("receiveSubject")
    public Subject receiveSubject() {


        return listenService.receiveProduct();
    }
}

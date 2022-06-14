package com.citros.core.controller;

import com.citros.core.model.Assignment;
import com.citros.core.service.interface_impl.AssignmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AssignmentController {
    private final AssignmentService assignmentService;
    @GetMapping("/assignment/{id}")
    public Assignment showAssigment(@PathVariable Long id) {
        return assignmentService.getAssignment(id);
    }

}

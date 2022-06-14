package com.citros.core.service.implementation;

import com.citros.core.model.Assignment;
import com.citros.core.repository.AssignmentRepository;
import com.citros.core.service.interface_impl.AssignmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AssignmentServiceImpl implements AssignmentService {

    private final AssignmentRepository assignmentRepository;

    @Override
    public Assignment getAssignment(Long id) {
        return assignmentRepository.findById(id).get();
    }
}

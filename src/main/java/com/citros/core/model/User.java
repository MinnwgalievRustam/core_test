package com.citros.core.model;

import lombok.*;
import org.apache.tomcat.jni.Address;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "job_title")
    private String jobTitle;

//    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    private List<Assignment> assignments = new ArrayList<>();

//    public void addAssignment(Assignment assignment) {
//        assignments.add(assignment);
//        assignment.getUsers().add(this);
//    }
//
//    public void removeAssignment(Assignment assignment) {
//        assignments.remove(assignment);
//        assignment.getUsers().remove(this);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return Objects.equals(id, user.id) && Objects.equals(surname, user.surname) && Objects.equals(name, user.name) && Objects.equals(lastName, user.lastName) && Objects.equals(jobTitle, user.jobTitle) && Objects.equals(assignments, user.assignments);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, surname, name, lastName, jobTitle, assignments);
//    }
}

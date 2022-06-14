package com.citros.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@Table(name = "assignment")
@NoArgsConstructor
@AllArgsConstructor
public class Assignment {
    @Id
    @Column(name = "assignment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject_order")
    private String subjectOrder;

    @Column(name = "sign_control")
    private String signControl;

    @Column(name = "sign_performance")
    private String signPerformance;

    @Column(name = "text_order")
    private String textOrder;

//    @ManyToMany(mappedBy = "assignment")
//    private List<User> users = new ArrayList<>();
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Assignment that = (Assignment) o;
//        return Objects.equals(id, that.id) && Objects.equals(subjectOrder, that.subjectOrder) && Objects.equals(signControl, that.signControl) && Objects.equals(signPerformance, that.signPerformance) && Objects.equals(textOrder, that.textOrder) && Objects.equals(users, that.users);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, subjectOrder, signControl, signPerformance, textOrder, users);
//    }
}

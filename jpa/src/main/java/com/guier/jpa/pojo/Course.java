package com.guier.jpa.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
// @Data
@Setter
@Getter
@Accessors(chain = true)
public class Course {
    @Id
//    @GeneratedValue(generator = "idGenerator")
//    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cName;
    // @Transient
    // @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "courses")
    private Set<Student> students = new HashSet<>();

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", cName='" + cName + '\'' +
                '}';
    }
}

package entity;

import annotations.Constraint;
import annotations.Table;
import lombok.*;

@Data
@Table(name = "student")
@Builder
public class Student {
    @Constraint(pk = true, uniq = true)
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
}

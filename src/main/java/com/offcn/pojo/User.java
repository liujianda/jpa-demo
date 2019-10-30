package com.offcn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private Integer age;
}

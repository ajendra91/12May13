package com.example.RepositoryRest;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Java {

    @Id
    @GeneratedValue
    public int id;
    public String name;
    public String age;

}

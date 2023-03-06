package org.java.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: Joker
 * @createTime: 2023-02-03 13:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    private Integer stuId;
    private String stuName;
    private String stuGender;
    private String stuBirth;
    private String stuClass;
    private Integer stuScore;
}

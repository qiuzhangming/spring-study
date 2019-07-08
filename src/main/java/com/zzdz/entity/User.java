package com.zzdz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Classname User
 * @Description TODO
 * @Date 2019/7/8 11:31
 * @Created by joe
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User {

    private String name;
    private Integer age;
    private Integer sex;

}

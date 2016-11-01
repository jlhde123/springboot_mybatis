package com.jlh.mapper;

import com.github.pagehelper.Page;
import com.jlh.model.User;

import java.util.List;

/**
 * Created by jlh
 * On 2016/10/28 0028.
 *
 * @description
 */
public interface UserMapper {
    List<User> getUsers (Page<User> page);
}

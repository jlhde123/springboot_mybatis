package com.jlh.service;

import com.github.pagehelper.Page;
import com.jlh.mapper.UserMapper;
import com.jlh.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by jlh
 * On 2016/10/17 0017.
 *
 * @description
 */

@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserMapper userMapper;

    public List<User> getList(Page<User> page){
//        String sql = "SELECT ID,NAME, AGE   FROM tb_user ";
//        return (List<User>) jdbcTemplate.query(sql, new RowMapper<User>(){
//            @Override
//            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//                User stu = new User();
//                stu.setId(rs.getLong("ID"));
//                stu.setAge(rs.getInt("AGE"));
//                stu.setName(rs.getString("NAME"));
//                return stu;
//            }
//        });
        return userMapper.getUsers(page);
    }
}

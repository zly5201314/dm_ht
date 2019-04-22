package com.jk.mapper;

import com.jk.model.Tree;
import com.jk.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {

    /*登录*/
    @Select("SELECT * FROM user_lmd u WHERE u.userNumber = #{userNumber}")
    @GetMapping("login")
    User login(String userNumber);

    /*注册*/
    @Insert("INSERT INTO user_lmd(userNumber,userPassword) VALUES(#{userNumber},#{userPassword})")
    void regStu(@Param("userNumber") String userNumber, @Param("userPassword")String userPassword);
    /*一日游页面*/
    @Select("SELECT * FROM user_lmd where userName is not null order by price")
    List<User> queryUserList();
    /*树页面*/
    @Select("select id,text,href,pid from tree_lmd n where pid=#{pid} ")
    List<Tree> findTreeById(@Param("pid")int pid);
    /*故宫页面*/
    @Select("SELECT * FROM user_lmd where userName='故宫'")
    List<User> queryGuGong();
    /*长城页面*/
    @Select("SELECT * FROM user_lmd where userName='长城'")
    List<User> queryChangCheng();
    /*欢乐谷页面*/
    @Select("SELECT * FROM user_lmd where userName='欢乐谷'")
    List<User> queryHuanLeGe();


    /* int queryCount(@Param("user") User user);*/


   /* List<User> queryUserList(@Param("start")int start, @Param("rows")Integer rows,@Param("user") User user);
*/
   /* @Select("select * from user_lmd where id=#{id}")
    List<User> queryUserById(@Param("id") Integer id);
*/

}

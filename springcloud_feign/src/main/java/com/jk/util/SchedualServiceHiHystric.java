/**
 * Copyright (C), 2019, 金科教育
 * FileName: SchedualServiceHiHystric
 * Author:   zyl
 * Date:     2019/4/15 9:43
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.util;

import com.jk.model.Tree;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author zyl
 * @create 2019/4/15
 * @since 1.0.0
 */
@Component
public class SchedualServiceHiHystric implements UserService {

    public String hiService(String name) {
        return "报错";
    }

    @Override
    public String login(String userNumber, String userPassword) {
        return null;
    }

    @Override
    public List<User> queryUserList() {
        return null;
    }






    /*@Override
    public HashMap<String, Object> queryUserList(Integer page, Integer rows, User user) {
        return null;
    }*/




    @Override
    public String regStu(String userNumber, String userPassword) {
        return null;
    }

    @Override
    public List<Tree> getTree() {
        return null;
    }

    @Override
    public List<User> queryGuGong() {
        return null;
    }

    @Override
    public List<User> queryChangCheng() {
        return null;
    }

    @Override
    public List<User> queryHuanLeGe() {
        return null;
    }

   /* @Override
    public List<User> queryUserById(Integer id) {
        return null;
    }*/


}
